package com.company.facade;

import java.util.Scanner;

public class PlayerOptions {
    public void PlayerOptions(){
        Scanner scan = new Scanner(System.in);
        String text;
        System.out.println("\nChoose option: Save, Share, Like");
        text = scan.next();
        if (text.equals("Save") || text.equals("save")){
            OptionsFacade save = new OptionsFacade();
            save.turnonSave();
        }
        else if (text.equals("Share") || text.equals("share")){
            OptionsFacade share = new OptionsFacade();
            share.turnonShareInstagram();
        }
        else if (text.equals("Like") || text.equals("like")){
            OptionsFacade like = new OptionsFacade();
            like.turnonLike();
        }
        else {
            System.out.println("Error");
        }
    }
}
