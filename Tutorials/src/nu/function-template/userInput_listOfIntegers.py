# -*- coding: utf-8 -*-
# Get a list of integers from user input in command line execution
# 
# Input should consist of integers w/wo +/- sign, separated by space in between
# e.g. 1 8372  -7    82183 4 2 5 -10
# Also accepts decimal values as one instance of '.' is removed before s.isdigit()
# comment line 35 to keep the first instance '.', not allowing decimal values
#

# initialize while loop condition
cont = False

while cont == False:
    # set to True until proven false
    cont = True
    
    # asks for user input in command line, strips pre/postfix whitespace
    #   and split individual subtrings into list
    raw_i = input("Please input a list of numbers separated by space:\n  ").strip().split()
    
    # set to false if empty input
    if raw_i == []:
        cont = False
    else:
        # test each element individually
        for i in range(len(raw_i)):
            # strip one pos/neg sign from the beginning if there is one
            if (raw_i[i])[0] in "+-":
                s = (raw_i[i])[1:]
            # if not, set the entire element as o
            else:
                s = raw_i[i]

            # replace the first decimal with naught
            s = s.replace('.', '', 1)

            if s.isdigit() == False:
                cont = False
    
    if cont==False:
        print("Invalid input. Please try again")

