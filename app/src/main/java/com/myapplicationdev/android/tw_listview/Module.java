package com.myapplicationdev.android.tw_listview;

public class Module {

    private String name;
    private boolean prog;

    public Module(String name, boolean prog) {
        this.name = name;
        this.prog = prog;
    }
    public String getName() {
        return name;
    }
    public boolean isProg() {
        return prog;
    }

}
