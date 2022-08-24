package com.example.mdd_project;

import java.util.List;

public class Modulliste {
    private List<Modul> module;

    public Modulliste(List<Modul> module) {
        this.module = module;
    }

    public List<Modul> getModule() {
        return module;
    }

    public void setModule(List<Modul> module) {
        this.module = module;
    }

    public String toString(){
        String back = "Module: \n";

        for (Modul m : this.module) {
            back += m.toString() + "\n";
        }

        return back + "\n";
    }
}
