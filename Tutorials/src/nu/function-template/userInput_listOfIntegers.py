# -*- coding: utf-8 -*-
# Get a list of integers from user input in command line execution
# 
# Input should consist of integers w/wo +/- sign, separated by space in between
# e.g. 1 8372  -7    82183 4 2 5 -10
# Also accepts decimal values as one instance of '.' is removed before s.isdigit()
# comment line 67 to keep the first instance '.', not allowing decimal values
#

# initialize while loop condition
cont = False
#while cont == False:
#    # set to True until proven false
#    cont = True
#    
#    # asks for user input in command line, then strips prefix/postfix whitespace
#    #   and splits string into list with whitespace as delimits
#    raw_i = input("Please input a list of integers separated by space:\n  ").strip().split()
#    
#    # this loop tests each element in the list individually
#    for i in range(len(raw_i)):
#        # test if user input is empty
#        if raw_i == []:
#            cont = False
#        else:
#            # test for pos/neg sign from the beginning
#            if (raw_i[i])[0] in "+-":
#                # set o to the rest of the substring
#                o = (raw_i[i])[1:]
#            else:
#                # if not, then set o as the entire element
#                o = raw_i[i]
#            # replace the first decimal with naught
#    #        o = o.replace('.', '', 1)
#
#            # if string o contains any non-numerical character, re-enter
#            if o.isdigit() == False:
#                cont = False
#    # print error message and re-enter
#    if cont==False:
#        print("Invalid input. Please try again")
#    # otherwise, break out of loop as 'cont' remains True after testing
    

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

