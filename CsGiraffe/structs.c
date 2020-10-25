/*
 * 
 */

/* 
 * File:   structs.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 3:33 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * Structs are similar to Java classes in creating Objects.
 */

struct Student{
    char name[50];
    char major[50];
    int age;
    double gpa;
    
};

int structs() {
    
    struct Student student1;
    student1.age = 22;
    student1.gpa = 3.2;
    strcpy( student1.name, "Jim");
    strcpy( student1.major, "Business");
    
    printf("%f\n", student1.gpa);
    printf("%s\n", student1.name);
    
    struct Student student2;
    student2.age = 20;
    student2.gpa = 2.5;
    strcpy( student2.name, "Pam");
    strcpy( student2.major, "Art");
    
    printf("%d\n", student2.age);
    printf("%s\n", student2.major);
    
    return 0;
}

