package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int riddler=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question=JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?"); 
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		 if(question.equals("A stamp")) {
		// 5. Otherwise, say "wrong" and tell them the answer
			 JOptionPane.showMessageDialog(null, "Correct");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}
}
