package com.company.facade;

public class OptionsFacade {
    private Player save;
    private Player shareinstagram;
    private Player like;

    public OptionsFacade() {
        save = new Save();
        shareinstagram = new ShareInstagram();
        like = new Like();
    }

    public void turnonSave(){
        save.turnon();
    }
    public void turnonShareInstagram(){
        shareinstagram.turnon();
    }
    public void turnonLike(){
        like.turnon();
    }
}

