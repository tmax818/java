/*

 * Project #3
 * Source Code File: GradeBook.java
 * Programmer: Tyler Maxwell
 * Due: 10/14/19
 * Description: Grade book program that prompts a user for numeric grade input and calculates the letter grade, an
  average grade for the class and a tally of each letter grade entered.

 */

package co.tylermaxwell;

import java.util.Scanner;

public class GradeBook {

    private static int numberOfScores = 0;
    private static int totalAs = 0;
    private static int totalBs = 0;
    private static int totalCs = 0;
    private static int totalDs = 0;
    private static int totalFs = 0;
    public static String grade ="F";
    public static double scoreTotal = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = 0;


        do {
            System.out.print("Enter a score (a negative score ends input): ");
            score = input.nextDouble();
            String grade = grade(score);
            String article = (grade == "A" || grade == "F") ? "an" : "a";
            System.out.println("A score of " + score + " is "+ article + " " + grade + ".");
        } while (score >= 0);

        System.out.println("Grade Report");
        System.out.println("-------------------------");
        System.out.println("Total number of A's: " + totalAs);
        System.out.println("Total number of B's: " + totalBs);
        System.out.println("Total number of C's: " + totalCs);
        System.out.println("Total number of D's: " + totalDs);
        System.out.println("Total number of F's: " + totalFs);
        System.out.println("Total number of scores input: " + numberOfScores);
        System.out.println("Average class score: " + (scoreTotal / (double)(numberOfScores)));
        System.out.println("Average class grade: " + grade(scoreTotal / (double)(numberOfScores)));
    }

    private static String grade(double score){
        String grade = "F";
        if(score <= 100.0d && score >= 90.0d){
            grade = "A";
            totalAs++;
            numberOfScores++;
            scoreTotal += score;
        } else if(score < 90.0d && score >= 80.0d) {
            grade = "B";
            totalBs++;
            numberOfScores++;
            scoreTotal += score;
        } else if(score < 80.0d && score >= 70.0d){
            grade = "C";
            totalCs++;
            numberOfScores++;
            scoreTotal += score;
        } else if(score < 70.0d && score >= 60.0d){
            grade = "D";
            totalDs++;
            numberOfScores++;
            scoreTotal += score;
        } else if(score >= 0){
            grade = "F";
            totalFs++;
            numberOfScores++;
            scoreTotal += score;

        }
        return grade;
    }

}
