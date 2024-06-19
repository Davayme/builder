package com.ayme.david.patrones.clase.estructurales.adapter.mio;

public class MediaAdapter implements IMediaPlayer {
    private AudioPlayer audioPlayer;
    public MediaAdapter(AudioPlayer ap){
        this.audioPlayer = ap;
    }
    @Override
    public void play(String audioType, String fileName) {
        this.audioPlayer.playAudioFile(audioType, fileName);
    }

    
}
