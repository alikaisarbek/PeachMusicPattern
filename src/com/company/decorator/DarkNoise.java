package com.company.decorator;

public class DarkNoise extends SongDecorator {
    public DarkNoise(Song s){
        super(s);
    }
    @Override
    public void equalizer(){
        super.equalizer();
        System.out.print("Add Dark Noise sounds.\n");
    }
}
