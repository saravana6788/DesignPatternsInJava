package org.example.designpatterns.adapterpattern;

public class MP3Player implements MediaPlayer{

    MP3ToMP4Converter mp3ToMP4Converter;

    MP3Player(){

    }
    @Override
    public void playMedia(String audioType) {
        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println("I can play MP3 formats...");
        else {
            mp3ToMP4Converter = new MP3ToMP4Converter(audioType);
            mp3ToMP4Converter.playMedia(audioType);
        }
    }
}
