/*
 * 
 */

/* 
 * File:   write.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:44 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int write() {
    
    /* r = read; w = write; a = append */
    FILE * fpointer = fopen("employees.txt", "w"); /* default created in same dir as c file. */
    
    fprintf(fpointer, "Jim, Salesman\nPam, Receptionist\nOscar, Accounting");  /* Overwrites by default */
    
    
    
    FILE * fpointer2 = fopen("employees.txt", "a");
    
    fprintf(fpointer2, "\nKelly, Customer Service");
    
    fclose(fpointer);
    fclose(fpointer2);
    return 0;
}

