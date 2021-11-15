package com.company.state;
import java.util.Scanner;
public class MusicPlayer {
    public void MusicPlayer(){
        System.out.println("previous | stop | play | next");
        Scanner scan = new Scanner(System.in);
        String text;
        text=scan.next();
        if(text.equals("play")){
            MusicContent content = new MusicContent();
            State musicStartplay = new MusicPlay();
            content.setState(musicStartplay);
            content.doAction();
        }
        else if(text.equals("stop")){
            MusicContent content = new MusicContent();
            State musicStop = new MusicStop();
            content.setState(musicStop);
            content.doAction();
        }
        else if(text.equals("previous")){
            MusicContent content = new MusicContent();
            State musicprev = new MusicPrev();
            content.setState(musicprev);
            content.doAction();
        }
        else if(text.equals("next")){
            MusicContent content = new MusicContent();
            State nextsong = new Musicnext();
            content.setState(nextsong);
            content.doAction();
        }
        else{
            System.out.println("error");
        }
    }
}
