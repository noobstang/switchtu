"""DO NOT REMOVE THIS HEADER

BSD License: http://www.opensource.org/licenses/bsd-license.php

Copyright (c) 2008, Sun Microsystems, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

1.Redistributions of source code must retain the above copyright notice,
this list of conditions and the following disclaimer.

2.Redistributions in binary form must reproduce the above copyright notice,
this list of conditions and the following disclaimer in the documentation and/or
 other materials provided with the distribution.

3.Neither the name of the Sun Microsystems, Inc nor the names of its contributors may
be used to endorse or promote products derived from this software without
specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

"""
#
# Demonstrates:
# 1. Threading
# 2. Exception handling
#


import sys
import threading

__author__ = "Amit Saha <amitksaha@netbeans.org>"
__date__ = "$29 Nov, 2008 9:51:03 PM$"



# 'child' thread

class Parent (threading.Thread):

    def __init__(self, myslice):
        """Documentation"""

        threading.Thread.__init__(self)
        self.numbers = myslice

    def run (self):
        print "Thread", threading.currentThread(), "recieved", self.numbers


# Main thread

# Print the Main thread ID

print threading.currentThread()


print "Starting the threads"

# a List of numbers
numbers = [10, 40, 60, 80, 100, 34, 98, 100, 109, 100, 14, 399]

# pointer to the starting position of each slice

startpos = 0

# In this loop, we shall 'slice' the list into 4 equal parts and send each part
# to a seprate thread

for i in range (1, 4):

    # Sending the slice

    try:
        parent = Parent(numbers[startpos:startpos + 4])
        startpos = startpos + 4

        # Start another thread
        parent.start();

    except IndexError:
        print "Index out of bounds"
        sys.exit(0)


print "Waiting for the slave threads..."
parent.join();

print "...Done"