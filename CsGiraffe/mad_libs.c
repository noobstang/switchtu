/*
 * 
 */

/* 
 * File:   mad_libs.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 2:12 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int mad_libs() {
    
    char colour[20];
    char pluralNoun[20];  /* Convention C variables are camel case. */
    char celebrityF[20];
    char celebrityL[20];
    
    printf("Enter a colour: ");
    scanf("%s", colour);
    printf("Enter a plural noun: ");
    scanf("%s", pluralNoun);
    printf("Enter a celebrity: ");
    scanf("%s%s", celebrityF, celebrityL);
    
    
    printf("Roses are %s\n", colour);
    printf("%s are blue\n", pluralNoun);
    printf("I love %s %s\n", celebrityF, celebrityL);
    
    return 0;
}

