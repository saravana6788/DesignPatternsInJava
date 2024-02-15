package org.example.designpatterns.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String audioType) {
        System.out.println("I can play vlc audioType");
    }

    @Override
    public void playMp4(String audioType) {

    }
}
