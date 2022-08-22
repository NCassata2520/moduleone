package edu.tryitout;


public class tryitout {

    public static void main(String[] args){
    countUp(6);
    countUp(-5);
    countUp(9);
    countUp(11);
    }

    public static void countUp(int max){
        if (max > 10) {
            System.out.println("Error: Max should be less than 10");
        }
        else if (max < 0) {
            System.out.println("Error: Max should be more than 0");
        }
        else {
            for (int i = 0; i < max; i++) {
                System.out.println(i);
            }
        }
    }
}
