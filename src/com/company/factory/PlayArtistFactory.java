package com.company.factory;

public class PlayArtistFactory {
    public static PlayArtist createArtist(String artist)
    {
        if (artist == null || artist.isEmpty())
            return null;
        if ("Olivia Rodrigo".equals(artist)) {
            return new OliviaArtist();
        }
        else if ("Bruno Mars".equals(artist)) {
            return new BrunoArtist();
        }
        else if ("Ariana Grande".equals(artist)) {
            return new ArianaArtist();
        }
        return null;
    }
}
