9/11/2026
Drishti Nishar

In this program, the program will stop at a random word in the sonnet below
and ask the user to enter the next word. The program will then tell the user
if they got it right or wrong, restart the sonnet, and ask again. After 3
correct or incorrect guesses, the program will terminate

Click run, open the terminal, and answer the questions to the best of your ability!

Sonnet:
Shall I compare thee to a summer’s day?
Thou art more lovely and more temperate:
Rough winds do shake the darling buds of May,
And summer’s lease hath all too short a date;
Sometime too hot the eye of heaven shines,
And often is his gold complexion dimm’d;
And every fair from fair sometime declines,
By chance or nature’s changing course untrimm'd;
But thy eternal summer shall not fade,
Nor lose possession of that fair thou ow’st;
Nor shall death brag thou wander’st in his shade,
When in eternal lines to time thou grow’st:
   So long as men can breathe or eyes can see,
   So long lives this, and this gives life to thee.

Core pseudocode

let correctUserGuesses be an int
let incorrectUserGuesses be an int
let message be a String
let splitMessage be a String array

split message into an array of words

while correctUserGuesses < 3 AND incorrectUserGuesses < 3
    choose a random word from splitMessage
    print all words before the randomly chosen word
    print underscores for the randomly chosen word
    let correctAnswer be the randomly chosen word
    prompt the user for their answer
    let userAnswer be the user's answer

    if(userAnswer matches correctAnswer, ignoring capitalization
       OR userAnswer matches correctAnswer without its final punctuation) then
        print "Good job, you got it right!"
        correctUserGuesses = correctUserGuesses + 1
    else
        if incorrectUserGuesses == 2 then
            print "Not quite. Better luck next time!"
        else
            print "Not quite. Let's try another one!"
        incorrectUserGuesses = incorrectUserGuesses + 1