package week4;
import java.util.ArrayList;

public class Artist {
    private ArrayList<String> songs;
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSongs(ArrayList songs) {
        this.songs = songs;
    }
    public void setName(String name) {
        this.songs = songs;
    }
    public int getAge(){
        return this.age;
    }
    public String getSongs() {
        for(int i =0; i <songs.size(); i++) {
            System.out.println();
        }
    }
    public Artist(int age, String name, String[] songs){
        this.songs=songs;
        this.age=age;
        this.name=name;
    }
    public String[] songList(){
        return songs;
    }

    public void addSong(String song){

    }
}
