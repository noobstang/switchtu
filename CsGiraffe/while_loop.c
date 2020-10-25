/*
 * 
 */

/* 
 * File:   while_loop.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 3:42 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int while_loop() {
    
    int index = 1;
    while(index <= 5) {
        printf("%d\n", index);
        index++;
    }
    
    index = 6;
    while(index <= 5) {
        printf("%d\n", index);
        index++;
    }
    
    printf("\n");
    
    /* do-while loops are guaranteed to loop at least once. */
    do {
        printf("%d\n", index);
        index++;
    } while(index <= 5);
    
    
    
    return 0;
}

