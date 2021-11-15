package com.company.adapter;

import java.util.Scanner;

public class AdapterOS {
    public void AdapterOS() {
        Scanner scan = new Scanner(System.in);
        String text;
        System.out.println("\nPlease enter your operating system");
        text = scan.next();
        if(text.equals("IOS") || text.equals("ios")){
            IOS musicplayer = new IOS();
            System.out.println("IOS ");
            musicplayer.DolbyAtmos();
            musicplayer.DigitalSound();
        }
        else if(text.equals("Android") || text.equals("android")) {
            IOS musicplayer = new IOS();
            Android musicplayer2 = new AndroidOS();
            Android adapt = new AndroidAdapt(musicplayer);
            musicplayer2.LosslessFunction();
            adapt.LosslessFunction();
        }
        else {
            System.out.println("Error");
        }
    }
}




