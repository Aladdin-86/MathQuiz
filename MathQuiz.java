import java.util.Random;
import java.util.Scanner;


public class MathQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		
		int numQuestions = 10;
		int score = 0;
		int firstTry = 0;
		int secondTry = 0;
		
		for (int i = 1; i <= numQuestions; i++) {
		int num1 = rand.nextInt(10) +1; //generate random numbers from 1 to 10
		int num2 = rand.nextInt(10) +1; //generate random numbers from 1 to 10
		int answer = 0;
		
		int operation = rand.nextInt(4); //generate random operation case
		switch(operation) {
		case 0: //addition
			System.out.print(i + " ) What is " + num1 + " + " + num2 + " ?");
			answer = num1+num2;
			break;
		case 1: //subtraction
			System.out.print(i + " ) What is " + num1 + " - " + num2 + " ?");
			answer = num1-num2;
			break;
		case 2: //multiplication
			System.out.print(i + " ) What is " + num1 + " * " + num2 + " ?");
			answer = num1*num2;
			break;
		case 3: //division
			int quotient = rand.nextInt(10)+1;
			answer = quotient *num2;
			System.out.print(i + " ) What is " + num1 + " / " + num2 + " ?");
			break;
		}
		
		int userAnswer = input.nextInt();
		
		if (userAnswer == answer) {
		score++;
		firstTry++;
		System.out.println("Correct!");
		} else {
			System.out.println("Incorrect, please try again");
			userAnswer = input.nextInt();
			if (userAnswer == answer) {
			secondTry++;
			score+=0.5;
			System.out.println("Correct!, but you got it in the second try");
		} else {
				System.out.println("Incorrect, the answer was " + answer + ".");
			}
	}
		}
	System.out.println("You got " + score + " out of " + numQuestions);
	System.out.println("You got " + firstTry + " correct answers from the first try and " + secondTry + " correct answers from the second try");
}
}


