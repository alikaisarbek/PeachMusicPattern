package com.company.state;

public class Musicnext implements State {
    @Override
    public void doAction() {
        System.out.println("Next song is playing.");
    }
}
