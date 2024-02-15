package org.example.designpatterns.adapterpattern;

public class MP3ToMP4Converter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    MP3ToMP4Converter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            this.advancedMediaPlayer = new VlcPlayer();
        else if (audioType.equalsIgnoreCase("mp4")) {
            this.advancedMediaPlayer = new MP4Player();
        }
    }


    public void convertMp3ToMp4(){
        System.out.println("File converted from MP3 to VLC format");
    }


    @Override
    public void playMedia(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
        advancedMediaPlayer.playVlc(audioType);
        else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(audioType);
        }
    }
}
