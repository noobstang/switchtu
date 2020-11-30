# -*- coding: utf-8 -*-
# Hello World - Second Edition by Warren & Carter Sande
# Listing 15.1 Creating a module
# 

# this is the file "my_module.py"
# we're going to use it in another program

def c_to_f(celsius):
    """(number) -> float
    returns the equivalent fahrenheit temperature measure given its 
        celsius measure"""
    
    fahrenheit = celsius * 9.0 / 5 + 32
    return fahrenheit


