package com.company.state;

public class MusicStop implements State{
    @Override
    public void doAction() {
        System.out.println("Music is turned OFF");
    }
}
