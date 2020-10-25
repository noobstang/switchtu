/*
 * 
 */

/* 
 * File:   2darray_nested.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:08 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int _2darray_nested() {
    
    int nums[5][2] = {
        
        {1, 2},
        {3, 4},
        {5, 6},
        {7, 8},
        {9, 10}
    };
    
    printf("%d\n\n", nums[1][1]);
    
    int i, j;
    for (i=0; i<5; i++) {
        
        for (j=0; j<2; j++) {
            printf("%d ", nums[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}

