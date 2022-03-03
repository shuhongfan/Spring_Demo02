package com.shf.demo03;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出售房子了");
    }
}
