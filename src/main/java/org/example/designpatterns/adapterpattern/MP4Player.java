package org.example.designpatterns.adapterpattern;

import javax.print.attribute.standard.Media;

public class MP4Player implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String audioType) {

    }

    @Override
    public void playMp4(String audioType) {
        System.out.println("I can play Mp4 formaats.. ");
    }
}
