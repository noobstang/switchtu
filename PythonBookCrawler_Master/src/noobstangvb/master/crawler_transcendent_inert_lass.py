# -*- coding: utf-8 -*-

# 

from bs4 import BeautifulSoup
import requests, sys

"""
Description: Download "Poke Club" online novel "Transcendent Inert Lass"
Parameters: none
Returns: none
Modify: 2017-09-13
"""
class downloader(object):
    def __init__(self):
        self.server = "http://www.xbiquge.la"
        self.target = "http://www.xbiquge.la/43/43436/";
        self.names = [] #Store chapter name
        self.urls = [] #Store chapter link
        self.nums = 0 #
#
    def get_download_url(self):
        req = requests.get(url = self.target)
        req.encoding = 'utf-8'
        html = req.text
        div_bf = BeautifulSoup(html,"html5lib")
        div = div_bf.find_all('div',id="list")
        a_bf = BeautifulSoup(str(div[0]),"html5lib")
        a = a_bf.find_all('a')
        self.nums = len(a)

#
        for each in a:
            self.names.append(each.string)
            self.urls.append(self.server+each.get('href'))

#Get chapter content
    def get_contents(self,target):
        req = requests.get(url = target)
        req.encoding = 'utf-8'
        html = req.text
        bf = BeautifulSoup(html,"html5lib")
        texts = bf.find_all('div',id = 'content')
        texts = texts[0].text.replace('\xa0'*4,'\n\n')
        return texts

#Write the article content to the file
    def writer(self,name,path,text):
        write_flag = True
        with open(path,'a',encoding = 'utf-8') as f:
            f.write(name + '\n')
            f.writelines(text)
            f.write('\n\n')


if __name__ == "__main__":
    dl = downloader()
    dl.get_download_url()
print('"Transcendent Inert Lass" has started downloading')
for i in range(dl.nums):
    dl.writer(dl.names[i], 'transcendent_inert_lass.txt', dl.get_contents(dl.urls[i]))
    sys.stdout.write(" Downloaded: %0.3f%%" % float(i/dl.nums) + '\r')
    sys.stdout.flush()
print('《 》 has been downloaded.')