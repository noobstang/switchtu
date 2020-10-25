/*
 * 
 */

/* 
 * File:   for_loop.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:00 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int for_loop() {
    
    int i = 1;
    while(i <= 5) {
        printf("%d\n", i);
        i++;
    }
    
    printf("\n");
    
    /* Cannot create variable in for parameter in C. Tracker must already exist*/
    int j;
    for(j = 6; j <=10; j++) {
        printf("%d\n", j);
    }
    
    printf("\n");
    
    int k;
    int luckyNumbers[] = {4, 8, 15, 16, 23, 42};
    for(k = 0; k < 6; k++) {
        printf("%d\n", luckyNumbers[k]);
    }
    
    return 0;
}

