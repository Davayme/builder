package com.ayme.david.patrones.clase.estructurales.adapter.mio;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        IMediaPlayer player = new MediaAdapter(new AudioPlayer());
        player.play("mp3", "song.mp3");
        player.play("wav", "sound.wav");
    }

}