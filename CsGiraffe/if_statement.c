/*
 * 
 */

/* 
 * File:   if_statement.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 2:59 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

int max(int num1, int num2) {
    
    int result;
    if(num1 > num2) {
        result = num1;
    } else {
        result = num2;
    }
    /* In this case, even if num1 == num2, the correct result will be returned. */
    return result;
}

int max3(int num1, int num2, int num3) {
    
    int result;
    
    if(num1 >= num2 && num1 >= num3) {
        result = num1;
    } else if (num2 >= num1 && num2 >= num3) {
        result = num2;
    } else {
        result = num3;
    }
    
    
    return result;
}

int if_statement() {
    
    printf("Greater number is: %d\n", max(4, 10));
    printf("Greatest number is: %d\n", max3(3, 2, 5));
    
    if (1>2 || 7>=5) {
        printf("true\n");
    } else {
        printf("false\n");
    }
    
    if (5 == 3) {
        printf("lol");
    }
    
    if (4 != 2) {
        printf("prodigy programmer\n");
    }
    
    if (!(4 == 3)) {
        printf("true dat\n");
    }
    
    return 0;
}

