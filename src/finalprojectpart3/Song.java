/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3;

/**
 *
 * @author Lenny Manset
 */
public class Song {
    private String title;  // The song's title
    private String artist; // The song's artist

    // Constructor to initialize the song with a title and artist
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // toString method to return a string representation of the song
    public String toString() {
        return title + " by " + artist + "\n";
    }
}
