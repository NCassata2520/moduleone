package edu.moduleone;

import java.util.Scanner;

public class moduleone {


        public static void main(String[] args) {
            String q1 = "Do you like your sauce Mild (a) or Spicy (b)?";
            String q2 = "Do you like tea (a) or coffee (b)?";
            String q3 = "Breakfast (a) or Lunch (b)?";
            String q4 = "Summer (a) or Winter (b)?";
            String q5 = "Paper (a) or Plastic (b)?";

            //Not sure what code to imput to make code run again if they type in y
            //Do loop?

            Question[] questions = {
                    new Question(q1, "b"),
                    new Question(q2, "a"),
                    new Question(q3, "a"),
                    new Question(q4, "b"),
                    new Question(q5, "a")
            };
            takeTest(questions);
            System.out.println("Would you like to take the test again? y/n?");
            Scanner keyboardInput = new Scanner(System.in);
            //if  (keyboradInput == "y"){? }

        }

        public static class Question {
            String prompt;
            String answer;

            public Question(String prompt, String answer){
                this.prompt = prompt;
                this.answer = answer;
            }
        }

        public static void takeTest(Question [] questions) {
            int score = 0;
            Scanner keyboardInput =  new Scanner(System.in);

            for(int i = 0;  i < questions.length; i++){
                System.out.println(questions[i].prompt);
                String answer = keyboardInput.nextLine();
                if(answer.equals(questions[i].answer)){
                    score++;
                }
            }
            if (score < 3){
                System.out.println("You prefer life  to be calm and organized");
            }
            if (score > 3){
                System.out.println("You prefer life to be spontaneous and active");
            }
            if (score == 3){
                System.out.println("You prefer a good balance in life");
            }
        }
}
