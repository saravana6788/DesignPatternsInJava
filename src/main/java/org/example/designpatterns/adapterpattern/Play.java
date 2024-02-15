package org.example.designpatterns.adapterpattern;

public class Play {

    public static void main(String args[]){
        MediaPlayer playMp3 = new MP3Player();
        playMp3.playMedia("mp3");

       playMp3.playMedia("vlc");
       playMp3.playMedia("mp4");


    }
}
