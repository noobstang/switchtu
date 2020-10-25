# Functions / Subroutines

def say(): # Define function without arguments
    print("Hello")

def say1(string):
    print(string)

def say2(string, string2):
    print(string, string2)

def getName():
    return "Steve" # Return steve

say() # Prints "Hello"
say1("Hi") # Prints "Hi"
say2("Hello", "There") # Prints "Hello There"
print(getName()) # Prints what returned from getName()

