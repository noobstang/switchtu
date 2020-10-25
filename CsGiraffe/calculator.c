/*
 * 
 */

/* 
 * File:   calculator.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 2:07 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int calculator() {
    
    double num1;
    double num2;
    printf("Enter first number: ");
    scanf("%lf", &num1);
    printf("Enter second number: ");
    scanf("%lf", &num2);
    
    printf("Answer: %f", num1 + num2);
    
    
    return 0;
}

