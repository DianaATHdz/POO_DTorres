/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DianaAlessa
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    
    public boolean addSong (String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    
    public Song findSong (String title){
        for (Song checkedSong: this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    
    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index = trackNumber -1;
        if((index >= 0)&&(index < this.songs.size())){ //No se puede numero menor que cero, pero si debe ser menor en el tamaño de array
            playList.add(this.songs.get(index)); //AGREGALE EL NUMERO DE TRACK
            return true;
        }
        System.out.println("This album does not have a track" + trackNumber);
        return false;
    }
    
    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" is not in this album");
        return false;
    }    
}
