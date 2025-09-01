# DESCRIPTION 

The Number Guessing Game is a simple console-based Java application where the computer selects a random number between 1 and 20, and the user has to guess it. 
The program gives hints whether the guess is too high or too low, and counts the number of attempts until the user guesses correctly.

This project demonstrates:

. Core Java concepts – input/output, loops, conditionals, random number generation.

. Problem-solving logic – feedback-based guessing until success.

. User interaction – handling invalid inputs gracefully.

# LOGIC 

-->Import Required Classes

Random → to generate a random number between 1 and 20.

Scanner → to take user input from the console.

-->Initialize Game

. Show welcome screen and rules.

. Generate a random number → secretNumber.

-->Initialize variables:

. attempts → count number of guesses.

. guessed → boolean flag to check if user has guessed correctly.

-->Game Loop (while loop)

. Runs until the user guesses the correct number.

Ask user for input:

. If input is not a number → show warning and continue loop.

. If input is valid → increment attempt counter.

--> Check Guess

. If guess == secretNumber → show success message + attempts, end game.

. If guess < secretNumber → print "Too low! Try again.".

. If guess > secretNumber → print "Too high! Try again.".

-->End of Game

. Once guessed, print "GAME OVER - Thanks for playing!".

. Close scanner to avoid resource leaks.
