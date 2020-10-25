# -*- coding: utf-8 -*-

# 
from bs4 import BeautifulSoup
import requests

if __name__ == "__main__":
#    print("Hello World")
    server = 'https://www.xbiquge.cc/'
    url = 'https://www.xbiquge.cc/book/13761'
    req = requests.get(url)
    req.encoding = 'utf-8'
    htm = 'req.text'
    bf = BeautifulSoup(htm,'html5lib')

div = bf.find_all('div',id="list") #find the div of the chapter
a_bf = BeautifulSoup(str(div[0]),'html5lib')
a = a_bf.find_all('a') #Find all a tags
for each in a:
    print(each.string, server+each.get('href'))#Print


