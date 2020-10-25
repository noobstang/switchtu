/*
 * 
 */

/* 
 * File:   functions_return.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 2:49 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

double cube(double num) {
    double result = num * num * num;
    return result;
}

/* function cube() of return type MUST GO BEFORE main(), or conflict will occur! 
 * To create functions below main, initialize it first!
 */

double square(double num);

int functions_return() {
    
    printf("Cube Answer: %f\n", cube(3.0));
    printf("Cube Answer: %f\n", cube(7.0));
    
    printf("\n");
    printf("Square Answer: %f\n", square(4.0));
    
    return 0;
}

double square(double num) {
    double result = num * num;
    return result;
}

