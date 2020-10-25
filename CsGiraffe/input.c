/*
 * 
 */

/* 
 * File:   main.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 1:47 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int input() {
    
    int age;
    printf("Enter your age: ");
    scanf("%d", &age);  /* The &___ is a pointer. Automatically returns line. */
    /*printf("\n");*/
    printf("You are %d years old", age);
    
    printf("\n");
    
    double gpa;
    printf("Enter your gpa: ");
    scanf("%lf", &gpa);
    printf("Your gpa is %f", gpa);
    
    printf("\n");
    
    /* Error with char. Char has saved previous input. */
    
    char grade;
    printf("Enter your grade: ");
    scanf("%c", &grade);
    printf("Your grade is %c", grade);
    
    printf("\n");
    
    char name[20];
    printf("Enter your name: ");
    scanf("%s", name);
    printf("Your name is %s", name);
    
    printf("\n");
    
    char name2[20];
    printf("Enter your full name: ");
    fgets(name2, 20, stdin);
    printf("Your full name is %s", name2);
    
    printf("\n");
    
    
    return 0;
}

