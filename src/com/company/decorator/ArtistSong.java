package com.company.decorator;

public class ArtistSong implements Song {

    @Override
    public void equalizer() {
        System.out.print("Artist Song. ");
    }
}
