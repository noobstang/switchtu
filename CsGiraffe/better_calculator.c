/*
 * 
 */

/* 
 * File:   better_calculator.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 3:14 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
double calculate(double n1, double n2, char c);

int better_calculator() {
    
    double num1;
    double num2;
    char op;
    
    printf("Enter a number: ");
    scanf("%lf", &num1);
    printf("Enter operator: ");
    scanf(" %c", &op);
    printf("Enter a number: ");
    scanf("%lf", &num2);
    
    printf("Answer is: %f", calculate(num1, num2, op));
    
    return 0;
}

double calculate(double num1, double n2, char c) {
    if(c == '+') {
        return num1 + n2;
    } else if(c == '-') {
        return num1 - n2;
    } else if(c == '*') {
        return num1 * n2;
    } else if(c == '/') {
        return num1 / n2;
    } else {
        printf("Invalid operator.\n");
        return 0;
    }
}
