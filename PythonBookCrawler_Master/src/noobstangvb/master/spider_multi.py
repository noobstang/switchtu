# -*- coding: utf-8 -*-

# 
import requests
from bs4 import BeautifulSoup
from multiprocessing import Pool


# 解析一章的内容
def parser_a_chapter(html):
    # 解析网页
    soup = BeautifulSoup(html, 'html.parser')
    title = soup.find('h1', 'readTitle')
    print(title.get_text())
    # 获得内容
    div = soup.find(id='htmlContent')
    text = div.get_text()
    # 判断一章是否分两页
    bnt = soup.find(id='linkNext')
    if bnt.get_text() != '下一章':
        text = text + get_a_chapter(bnt['href'])
    return text

# 获得一章的内容
def get_a_chapter(chapter_url):
    res = requests.get(chapter_url)
    res.encoding = 'gbk'
    text = parser_a_chapter(res.text)
    return text

# 获得一本书的内容
def get_book(url):
    res = requests.get(url)
    res.encoding = 'gbk'
    soup = BeautifulSoup(res.text, 'html.parser')
    dd = soup.find_all('dd', 'col-md-3')
    title = soup.find('h1', 'bookTitle').get_text()
    print(title)
    with open(title + '.txt', 'a', encoding='utf-8') as f:
        f.write(title + '\n')
        for i in dd:
            if i.a != None:
                text = get_a_chapter(url + i.a['href'])
                f.write(text + '\n')


# 爬取num页，返回list(每一页的url)
def get_pages(num):
    base_url = 'http://www.ddxsw.la/wanben/'
    i = 1
    ls=[]
    for i in range(num):
        url = base_url + str(i)
        res = requests.get(url)
        ls.append(res.text)
    return ls

# 解析每一页，获得每本书的url，返回list
def parser_index_page(html_ls):
    ls = []
    for html in html_ls:
        soup = BeautifulSoup(html, 'html.parser')
        table = soup.table
        for i in table.find_all('a'):
            if i.get('class') == None:
                ls.append(i['href'])
        return ls


def main(url):
    get_book(url)


if __name__ == '__main__':
    # 首先获得num页的书
    num = 2
    index_html_ls = get_pages(num)
    # 然后得到每本书的url
    books_url = parser_index_page(index_html_ls)
    # 最后用多进程爬取
    pool = Pool()
    pool.map(main, books_url)
    