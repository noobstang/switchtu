/*
 * 
 */

#include <stdio.h>
#include <stdlib.h>

int printf_test
() {
    
    printf("Hello\nWorld\n");
    printf("Hello \"World\"\n");
    
/*    printf("My favourite number is %d.\n", 500);*/
    printf("My favourite %s is %d.\n", "number", 500);
    printf("My favourite %s is %f.\n", "decimal number", 37.80594);
    
    int favNum = 90;
    printf("My favourite %s is %d.\n", "integer", favNum);
    char myChar = 'C';
    printf("My favourite %s is %c.\n", "character", myChar);
    
    
    return 0;
    
}
