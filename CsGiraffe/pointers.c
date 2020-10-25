/*
 * 
 */

/* 
 * File:   pointers.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:27 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int pointers() {
    
    /* Pointers are just variable. Just values. Another type of data
     * that you can use in your program. Stores memory addresses.
     */
    
    int age = 30;
    double gpa = 3.4;
    char grade = 'A';
    
    /* You can't get any sort of meaningful memory address off the top of your head.
     * Instead, you borrow one from a variable already created.
     */
    
    int * pAge = &age;
    double * pGpa = &gpa;
    char * pGrade = &grade;
    
    
    printf("age's memory address: %p\n", &age); /* The '&age' is a pointer. */
    
    
    
    return 0;
}

