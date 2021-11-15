package com.company.decorator;

public abstract class SongDecorator implements Song {

    protected Song song;

    public SongDecorator(Song s){

        this.song=s;
    }
    @Override
    public void equalizer() {
        this.song.equalizer();
    }
}
