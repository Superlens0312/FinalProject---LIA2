/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3;

/**
 *
 * @author Lenny Manset
 */
import java.util.Scanner;

public class Average {
    private int[] data;  // Array to store the scores
    private double mean; // The mean of the scores

    // Constructor that initializes the array and calculates the mean
    public Average() {
        data = new int[5]; // Initialize the array with 5 scores
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 5 scores
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter score number " + (i + 1) + ":");
            data[i] = input.nextInt();  // Store user input into the array
        }

        // Call the sorting and mean calculation methods
        selectionSort();
        calculateMean();
    }

    // Method to calculate the mean of the scores
    public void calculateMean() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];  // Add each score to total
        }
        mean = total / (double) data.length;  // Calculate the mean (average)
    }

    // Method to sort the scores in descending order using selection sort
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the max element with the current element
            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }

    // Method to return a string representation of the data and mean
    public String toString() {
        String result = "Scores in descending order: ";
        for (int i = 0; i < data.length; i++) {
            result += data[i] + " ";  // Add each score to the result string
        }
        result += "\nMean: " + mean;  // Add the mean to the result string
        return result;
    }
}
