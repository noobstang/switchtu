/*
 * 
 */

/* 
 * File:   read.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 4:55 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {
    
    char line[255];
    /* r = read; w = write; a = append */
    FILE * fpointer = fopen("employees.txt", "r");
    
    /* The int number is size. */
    fgets(line, 255, fpointer);
    printf("%s", line);
    
    fgets(line, 255, fpointer);
    printf("%s", line);
    
    fclose(fpointer);
    return 0;
}

