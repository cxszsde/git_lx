package com.cx.lx;

public class sd {
    private String s;
    private int anInt;

    public sd(String s, int anInt) {
        this.s = s;
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return "sd{" +
                "s='" + s + '\'' +
                ", anInt=" + anInt +
                '}';
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public sd() {
    }
    public void run(String s,int anInt){
       this.s=s;
        this.anInt=anInt;
        System.out.println(anInt+s);
    }
}
