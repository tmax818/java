/*

 * Project #4
 * Source Code File: ScoreAnalyzer.java
 * Programmer: Tyler Maxwell
 * Due: 10/28/19
 * Description:

 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ScoreAnalyzer {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of scores you'd like to average: ");
        int n = input.nextInt();
        double[] scores = new double[n];

        for(int i = 0; i < scores.length; i++){
            System.out.printf("Enter score #%d: ", i + 1);
            scores[i] = input.nextDouble();
            System.out.println(scores[i] + " is " + grade(scores[i]));
        }

        double sum = sumOfScores(scores);
        double avg = averageOfScores(sum, n);

        System.out.println(sum);
        System.out.println(n);
        System.out.println("The average of these scores is: " + avg);

        System.out.println("The sorted list of scores(above average scores are marked with an asterisk '*'): ");

        sort(scores);

        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= avg){
                System.out.print(scores[i]);
                System.out.println("*");
            } else {
                System.out.println(scores[i]);
            }
        }


    }

    public static String grade(double score){
        String grade;
        if(score <= 100.0d && score >= 90.0d){
            grade = "an A";
        } else if(score < 90.0d && score >= 80.0d) {
            grade = "a B";
        } else if(score < 80.0d && score >= 70.0d){
            grade = "a C";
        } else if(score < 70.0d && score >= 60.0d){
            grade = "a D";
        } else {
            grade = "an F";
        }
        return grade;
    }

    public static double sumOfScores(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double averageOfScores(double sum, int numberOfScores){
        return sum / numberOfScores;
    }

    public static void sort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
// Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }


}
