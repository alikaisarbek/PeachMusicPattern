package com.company.state;

public class MusicPlay implements State {
    @Override
    public void doAction() {
        System.out.println("Music is turned ON");
    }
}
