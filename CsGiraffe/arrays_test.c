/*
 * 
 */

/* 
 * File:   arrays_test.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 2:21 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int arrays_test() {
    
    int luckyNumbers[] = {4, 8, 15, 16, 23, 42};
    int luckyNumbers2[10];
    luckyNumbers2[1] = 80;
    luckyNumbers2[2] = 90;
    
    printf("%d\n", luckyNumbers[0]);
    printf("%d\n", luckyNumbers[2]);
    
    printf("%d\n", luckyNumbers2[1]);
    
    char phrase[20];  /* Character Strings in C is just an array ;o */
    char phrase2[] = "Array";
    printf("%s", phrase2);
    
    return 0;
}

