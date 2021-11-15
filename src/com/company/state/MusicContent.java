package com.company.state;

public class MusicContent implements State{
    private State musicState;
    public void setState(State state){
        this.musicState=state;
    }
    public State getState(){
        return this.musicState;
    }
    @Override
    public void doAction() {
    this.musicState.doAction();

    }
}
