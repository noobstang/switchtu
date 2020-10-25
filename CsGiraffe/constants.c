/*
 * 
 */

/* 
 * File:   constants.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 1:42 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * Constants - values that cannot be modified
 */
int constants() {
    
    int num = 5;
    printf("%d\n", num);
    num = 8;
    printf("%d\n", num);
    
    printf("\n");
    
    const int num2 = 7;
    printf("%d\n", num);
    /*num2 = 9;  /* Error: assignment to read-only variable. */
    printf("%d\n", num2);
    
    printf("%d\n", 90);  /* The '90' is a constant... */
    
    return 0;
}

