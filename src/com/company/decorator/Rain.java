package com.company.decorator;

public class Rain extends SongDecorator{
    public Rain(Song s){
        super(s);
    }
    @Override
    public void equalizer(){
        song.equalizer();
        System.out.print("Add Rain sounds.\n");
    }
}
