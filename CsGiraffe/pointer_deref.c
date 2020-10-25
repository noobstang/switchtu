/*
 * 
 */

/* 
 * File:   pointer_deref.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:39 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int pointer_deref() {
    
    int age = 30;
    int * pAge = &age;
    
    printf("%p\n", pAge);
    
    /* Dereferencing a pointer is to decipher the memory address stored inside a 
     * pointer variable to get the value that the memory address has stored.
     */
    
    printf("%p\n", *pAge);
    printf("%d\n", *pAge);  /* Prints out age. */
    printf("%p\n", &*pAge);  /* Prints out memory address. */
    printf("%d\n", *&*pAge);  /* Prints out age. */
    
    
    return 0;
}

