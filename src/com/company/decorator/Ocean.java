package com.company.decorator;

public class Ocean extends SongDecorator{
    public Ocean(Song s){
        super(s);
    }
    @Override
    public void equalizer(){
        super.equalizer();
        System.out.print("Add Ocean sounds.\n");
    }
}
