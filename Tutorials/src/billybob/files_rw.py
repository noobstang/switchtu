# Files +rw

read_file = open("readFile.txt", "r") # Open file in reading mode
for line in read_file: # Loop through lines in file
    print(line) # Print current line

read_file.close() # Close file

write_file = open("writeFile.txt", "w") # Open file in writing mode
write_file.write("Hello\n") # Print "Hello" with newline character
write_file.close() # Close file

# We can also use the "a" method which is same as write but append so doesn't overwrite file

