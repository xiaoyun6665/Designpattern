package com.yun.prototype;

public class Prototype implements Cloneable{
    private String data;

    public Prototype(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}
