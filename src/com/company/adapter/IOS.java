package com.company.adapter;

public class IOS implements SystemOS {
    @Override
    public void DigitalSound() {
        System.out.println("Digital Sound is turned on");
    }
    @Override
    public void DolbyAtmos() {
        System.out.println("Dolby Atmos is turned on");
    }
}
