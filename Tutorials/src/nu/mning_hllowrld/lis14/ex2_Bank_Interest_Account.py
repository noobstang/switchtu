# -*- coding: utf-8 -*-
# Hello World - Second Edition by Warren & Carter Sande
# Listing 14.6 HotDog class with cook(), add_condiments(), and __str__()
# 

class BankAccount():
    """Bank account with attributes name, account number, and balance."""
    def __init__(self, name, acc_num, bal):
        """(BankAccount, str, int, float) -> None"""
        self.name = name
        self.account_number = acc_num
        self.balance = bal
    
    def __str__(self):
        """(BankAccount) -> str
        returns __str__ message for use in print() function."""
        msg = ("The BankAccount named \"" + str(self.name) +"\" with account " +
            "number " +str(self.account_number) +" has a balance of $" +
            str(self.balance))
        return msg
    
    def getName(self):
        """(BankAccount) -> str
        returns the name string of the BankAccount"""
        return self.name
    
    def getNumber(self):
        """(BankAccount) -> int
        returns the account number integer sequence of the BankAccount"""
        return self.account_number
    
    def getBalance(self):
        """(BankAccount) -> float
        returns the balance amount of the BankAccount"""
        return self.balance
    
    def deposit(self, amount):
        """
        (BankAccount, float) -> None
        Preconditions: amount >= 0
        
        increment the balance of the BankAccount by amount
        """
        self.balance += amount
    
    def withdraw(self, amount):
        """
        (BankAccount, float) -> None
        Preconditions: amount >= 0
        
        decrement the balance of teh BankAccount by amount 
        """
        self.balance -= amount

class InterestAccount(BankAccount):
    """InterestAccount that can gain annual interest by percentage rate."""
    
    def __init__(self, name, acc_num, bal, rate):
        """(InterestAccount) -> None"""
        BankAccount.__init__(self, name, acc_num, bal)
        self.rate = rate
    
    def __str__(self):
        """(InterestAccount) -> None"""
        msg = BankAccount.__str__(self)
        msg += " and an annual interest rate of " + str(self.rate * 100) +"%"
        return msg
    
    def getRate(self):
        """(InterestAccount) -> float
        returns the float interest rate of InterestAccount"""
        return self.rate
    
    def setRate(self, new_rate):
        """(InterestAccount, float) -> None
        sets the interest rate of account to new_rate"""
        self.rate = new_rate
    
    def changeRate(self, rate_amount):
        """(InterestAccount, float) -> None
        increments the interest rate float of account given an amount"""
        self.rate += rate_amount
    
    def addInterest(self):
        """(InterestAccount) -> None
        increments balance by interest rate on an annual basis"""
        self.balance += self.balance * self.rate

myBankAccount = BankAccount("My Account", 300173743, 0.00)
print(myBankAccount)

cash = 5.58
print("Adding $" +str(cash), "cash to My Account...")
myBankAccount.deposit(cash)
print("And now the " + str(myBankAccount).strip("The "))

myInterestAccount = InterestAccount("inTeresTo", 10888688, 15.0, 0.03)
print(myInterestAccount)
print()
print("Adding interest to the balance...")
myInterestAccount.addInterest()
print("And now the " + str(myInterestAccount).strip("The "))

rate_increase = 0.02
print("And now the interest rate is increased by", str(rate_increase*100) + "%")
myInterestAccount.changeRate(rate_increase)
myInterestAccount.addInterest()
print("And now the " +str(myInterestAccount).strip("The "))
