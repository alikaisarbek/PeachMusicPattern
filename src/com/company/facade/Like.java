package com.company.facade;

public class Like implements Player {
    @Override
    public void turnon() {
        System.out.println("You liked this music");
    }
}

