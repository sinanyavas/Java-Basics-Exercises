package com.timbuchakka;

public class Main {

    public static void main(String[] args) {
	    Boolean gameOver=true;
	    int score = 800;
	    int levelCompleted=5;
	    int bonus=100;

	    /*if(score==4000) {
			System.out.println("your score was 5000");
			// if we do not put print statement into brackets, only the first line of code will be printed.
			System.out.println("this was executed");
		}else {
			System.out.println("got here");
		}*/

//		if(score<5000 && score>1000) {
//			System.out.println("your score was less then 5000 but greater then 1000");
//		}else if (score<1000){
//			System.out.println("your score is less then 1000");
//		}else{
//			System.out.println("got here");
//		}



		if(gameOver) {// if(gameOver) = if(gameOver==true)
			int finalscore=score+(levelCompleted*bonus);

			System.out.println("your final score was "+ finalscore);
		}

		// int savedfinalscore=finalscore++; // intellij can not resolve variable "finalscore" because it is defined in if condition bloc.
		// the concept of defining variables in a code bloc calls scope.


//		Boolean newgameOver=true;
//		int newscore = 10000;
//		int newlevelCompleted=8;
//		int newbonus=200;
//
//		if(newgameOver) {// if(gameOver) = if(gameOver==true)
//			int finalscore=newscore+(newlevelCompleted*newbonus);
//
//			System.out.println("your final score was "+ finalscore);
//		}

		//Alternative to above codebloc; instead of defining new variables, we can simply change variable values as below; 

		gameOver=true;
		score = 10000;
		levelCompleted=8;
		bonus=200;

		if(gameOver) {// if(gameOver) = if(gameOver==true)
			int finalscore=score+(levelCompleted*bonus);

			System.out.println("your final score was "+ finalscore);
		}

	}
}
