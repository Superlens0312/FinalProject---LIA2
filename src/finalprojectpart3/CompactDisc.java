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
import java.io.*;

public class CompactDisc {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("Classics.txt"));
        
        Song[] cd = new Song[6];
        
        for (int i = 0; i < cd.length; i++) {
            String title = input.nextLine();
            String artist = input.nextLine();
            
            cd[i] = new Song(title, artist);
        }
        
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            System.out.print(cd[i].toString());
        }
    }
}
