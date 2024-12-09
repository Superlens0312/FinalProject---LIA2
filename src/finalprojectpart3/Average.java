/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3;

/**
 *
 * @author Lenny Manset
 */
public class Average {
    private int[] data;
    private double mean;
    
    public Average(){
        data = new int[5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < data.lenght; i++) {
            System.out.println("Enter score number " + (i + 1) + ":");
            data[i] = input.nextInt();
            
        }
        
        selectionSort();
        calculateMean();
    }
    
    public void calculateMean() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        mean = total / (double) data.length;
    }
    
    public void selecionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }
    
    public String toString() {
        String result = "Scores in descending order: ";
        for (int i = 0; i < data.lenght; i++) {
            result += data[i] + " ";
        }
        result += "\nMean: " + mean;
        return result;
    }
}
