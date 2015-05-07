/**
 * 
 */
package org.cuatroveintos.exam;

import java.util.Collection;
import java.util.Random;
import java.util.Vector;




/**
 * Represent a question list
 * @author Irene
 *
 */
public class QuestionList {
	
	private static Vector<QuestionList> qList;
	
	/**
	 * defaul constructor, inits question list vector
	 */
	public QuestionList(){
		qList = new Vector<QuestionList>();
		
	} 
	
	/**
	 * adds question into question list
	 * @param question
	 * @return 
	 */
	public static void addQuestion(QuestionList question){
		qList.add(question);
	}
	
	/**
	 * remove question from question list
	 * @param index
	 * @return
	 */
	public static boolean removeQuestion (int index){
		if (index < qList.size()){
			qList.remove(index);
			return true;
		} else {
			return false;
		}
	}
	
	public static  String readAll(){
		String result = "";
		
		for (int i = 0; i < qList.size(); i++){
			result = result + qList.elementAt(i) + "\n";
			
		}
		return result;
	}
	
	public static String randomQuestion(){
		String result = "";
		
			Random random = new Random();
			 int a = 0;
			 a = random.nextInt(qList.size());
			result = qList.elementAt(a).toString();
		return result;
		
	}
	
	public static String checkAnswer(int index){
		String result = "";
		if (index < qList.size()){
			result = qList.elementAt(index).toString();
			
		}
		return result;
	}

	
}
