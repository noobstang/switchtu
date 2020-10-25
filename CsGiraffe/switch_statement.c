/*
 * 
 */

/* 
 * File:   switch_statement.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 3:27 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int switch_statement() {
    
    char grade;
    printf("Input your letter grade from your last test: ");
    scanf("%c", &grade);
    printf("\n");
    
    switch(grade) {
        case 'A':
            printf("You did great! \n");
            break;
        case 'B':
            printf("You did alright! \n");
            break;
        case 'C':
            printf("You did poorly! \n");
            break;
        case 'D':
            printf("You did very bad! \n");
            break;
        case 'F':
            printf("You failed! \n");
            break;
        default:
            printf("Invalid grade. \n");
    }
    
    
    return 0;
}

