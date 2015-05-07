/**
 * 
 */
package org.cuatroveintos.exam;

import java.util.Scanner;

/**
 * @author Irene
 *
 */
public class Main {
	
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wording = "";
		String answer = "";
		Question question = null;
		
		int index = 0;
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		QuestionList qList = new QuestionList();
		
		
		
		do {
			
			System.out.println("Exam: Question List");
			System.out.println("Select an option: \n");
			System.out.println("1. Add question");
			System.out.println("2. Remove question");
			System.out.println("3. Show all questions");
			System.out.println("4. Show a question");
			System.out.println("5. Check answer:");
			System.out.println("6. exit");

			option = reader.nextLine();

			switch (option) {
			case "1":
				System.out.println("Please, enter wording:");
				wording = reader.nextLine();
				System.out.println("Please, enter answer:");
				answer = reader.nextLine();
				question = new Question(wording,answer);
				
				//QuestionList.addQuestion(question);		
				break;
			case "2":
				System.out.println("Please, enter index:");
				wording = reader.nextLine();
				index = Integer.parseInt(wording);
				QuestionList.removeQuestion(index);
				break;
			case "3":
				System.out.println(QuestionList.readAll());
				break;
			case "4":
				System.out.println(QuestionList.randomQuestion());
				break;
			case "5":
				System.out.println("Please, enter index:");
				wording = reader.nextLine();
				index = Integer.parseInt(wording);
				System.out.println(QuestionList.checkAnswer(index));
				break;
			case "6":
				System.out.println("See you around");
				break;
			default:
				break;
			}		
		} while (!option.equals("6"));
		
		
	}

}
