/*
 * 
 */

/* 
 * File:   functions.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 2:40 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int functions() {
    
    printf("Top\n");
    sayHi();
    printf("bottom\n");
    printf("\n");
    sayHi2("NoobstangOfDusk");
    sayHi3("Joe Blo", 23);
    
    return 0;
}

void sayHi() {
    printf("Hello User\n");
}

void sayHi2(char name[]) {
    printf("Hello %s\n", name);
}

void sayHi3(char name[], int age) {
    printf("Hello %s, you are %d\n", name, age);
}

