package necklace;

import java.util.ArrayList;
import java.util.Scanner;

public class Necklace {

	public static void main (String[]args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Word1:");
		String word1 = sc1.nextLine();
		System.out.println("Word2:");
		String word2 = sc1.nextLine();

		ArrayList<String> wordList = new ArrayList<>();
		ArrayList<String> compareList = new ArrayList<>();

		String[] wordArray = word1.split("|");

		for(String c:wordArray){
			wordList.add(c);
		}

		for (int i = 0; i<wordList.size();i++) {
			String a = wordList.get(0);

			wordList.remove(0);
			wordList.add(a);

			String compareWord = String.join("", wordList);

			compareList.add(compareWord);
		}

		if(compareList.contains(word2)) {
			System.out.println("The two words belong to the same necklace.");
		} else {
			System.out.println("The two words doesn't belong to the same necklace.");
		}
		sc1.close();
	}
}