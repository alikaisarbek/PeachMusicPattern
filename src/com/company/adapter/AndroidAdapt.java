package com.company.adapter;

public class AndroidAdapt implements Android{
    SystemOS systemos;
    public AndroidAdapt (SystemOS systemos){
        this.systemos=systemos;
    }
    @Override
    public void LosslessFunction() {
        systemos.DigitalSound();
    }
}
