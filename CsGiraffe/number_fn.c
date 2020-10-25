/*
 * 
 */

#include <stdio.h>
#include <stdlib.h>

int number_fn() {
    
    printf("%f\n", 8.9);
    printf("%f\n", 5 + 4.5);
    
    int num = 6;
    
    printf("%f\n", 5.0 * 4.5);
    /*printf("%f\n", 5 + 4);    /* Cannot use %f for int numbers*/
    printf("%d\n", num + 97);
    printf("%f\n", pow(2, 3));    /* Power numbers */
    
    printf("%f\n", ceil(36.56));    /* Round up */
    printf("%f\n", floor(36.656));   /* Round down */
    
    
    return 0;
}
