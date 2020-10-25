/*
 * 
 */

/* 
 * File:   memory_address.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:19 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int memory_address() {
    
    /* All values that C accesses are stored in the computer as memory addresses. 
     * When C needs to access them, it needs to access this memory address.
     * This address can be different for every computer.
     */
    
    int age = 30;
    double gpa = 3.4;
    char grade = 'A';
    
    /* To see this physical memory address: */
    printf("age: %p\n", &age);
    printf("gpa: %p\ngrade: %p\n", &gpa, &grade);
    
    
    return 0;
}

