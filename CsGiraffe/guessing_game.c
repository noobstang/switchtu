/*
 * 
 */

/* 
 * File:   guessing_game.c
 * Author: noobstang
 *
 * Created on December 21, 2019, 3:48 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int guessing_game() {
    
    int secretNumber = 5;
    int guess;
    int guessCount = 0;
    int guessLimit = 3;
    int outOfGuesses = 0;
    
    while(guess != secretNumber && outOfGuesses == 0) {
        if(guessCount < guessLimit) {
            printf("Enter a number: ");
            scanf("%d", &guess);
            
            guessCount++;
        } else {
            outOfGuesses = 1;
        }
    }
    
    if (outOfGuesses == 0) {
        printf("You Win!\n");
    } else {
        printf("Out of guesses! You Lose!\n");
    }
    
    return 0;
}

