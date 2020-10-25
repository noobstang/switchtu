# While statements / For loops

for count in range(100): # two numbers e.g. range(5, 27) if the first number is not 0
    say1(count)

print()

for count in range(1, 101): # Note the fact we have a one because we always count up from number 1 (0 by default) to number 2: 0.... 1 < 100
    print(count)

for number in range (5, 11): # Prints numbers 5 to 10
    print(number)

sentence = "Hello there" # Define a sentence
for letter in sentence: # Loop through all letters in sentence
    say1(letter) # Print current letter

sentence = "Hello there 12 345 6789"
for letter in sentence.split(" "): # Split the sentence around the character " "... So Hello and there without space in middle
    print(letter) # Print current word/selection

