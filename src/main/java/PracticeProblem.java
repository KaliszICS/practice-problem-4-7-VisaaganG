/**
	* Lesson: Random Module
	* Author: Visaagan Gunabalachandran
	* Date Created: April 17, 2023
	* Date Last Modified: May 8, 2026
	*/

import java.util.Random;

public class PracticeProblem {

	public static int randomNumber(int num1, int num2) {
	int num3;
	Random random = new Random();
	num3 = random.nextInt(num1 , num2 + 1);
	return num3;
}

	public static char randomChar(String word) {
	char letter;
	int length = word.length();
	Random random = new Random();
	letter = word.charAt(random.nextInt(0, length));
	return letter;

}
	public static int randomEvenNumber(int min, int max) {
	int num3;
	Random random = new Random();
	
	do {
		num3 = random.nextInt(min , max + 1);
	} while (num3 % 2 != 0);

	return num3;
	}
}