import java.util.Scanner;
public class Main {
    public static boolean isAnswerCorrect(String userAnswer, String correctAnswer, int incorrectUserGuesses){
        if(userAnswer.equalsIgnoreCase(correctAnswer) || userAnswer.equalsIgnoreCase(correctAnswer.substring(0, correctAnswer.length()-1))){
            System.out.println("Good job, you got it right!\n");
            return true;
        }else{
            if(incorrectUserGuesses == 2){
                System.out.println("Not quite. Better luck next time!");
                return false;
            }else {
                System.out.println("Not quite. Let's try another one!\n");
                return false;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String message = "Shall I compare thee to a summer's day? " +
                "Thou art more lovely and more temperate: " +
                "Rough winds do shake the darling buds of May, " +
                "And summer's lease hath all too short a date; " +
                "Sometime too hot the eye of heaven shines, " +
                "And often is his gold complexion dimm'd; " +
                "And every fair from fair sometime declines, " +
                "By chance or nature's changing course untrimm'd; " +
                "But thy eternal summer shall not fade, " +
                "Nor lose possession of that fair thou ow'st; " +
                "Nor shall death brag thou wander'st in his shade, " +
                "When in eternal lines to time thou grow'st: " +
                "So long as men can breathe or eyes can see, " +
                "So long lives this, and this gives life to thee. ";
        int correctUserGuesses = 0;
        int incorrectUserGuesses = 0;
        String[] splitMessage = message.split(" ");
        int randomIndexToSplit = 0;
        String correctAnswer = "";
        while(correctUserGuesses < 3 && incorrectUserGuesses < 3){
            randomIndexToSplit = (int)(Math.random()*113+1);
            for(int i=0; i<randomIndexToSplit; i++){
                if(!Character.isLetter(splitMessage[i].charAt(splitMessage[i].length()-1))){
                    System.out.print(splitMessage[i] + " \n");
                }else {
                    System.out.print(splitMessage[i] + " ");
                }
            }
            for(int i=0; i<splitMessage[randomIndexToSplit].length(); i++){
                System.out.print("_");
            }
            correctAnswer = splitMessage[randomIndexToSplit];
            System.out.println("\nTry to fill in the blank!:");
            String userAnswer = scanner.next();
            if(isAnswerCorrect(userAnswer, correctAnswer, incorrectUserGuesses)){
                correctUserGuesses++;
            }else{
                incorrectUserGuesses++;
            }
        }
    }
}
