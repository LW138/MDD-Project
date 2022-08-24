package com.example.mdd_project;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    private String name;
    private int nummer;
    private List<Modul> module;

    public Semester(String name, int nummer, List<Modul> module) {
        this.name = name;
        this.nummer = nummer;
        this.module = module;
    }

    public Semester(String name, int nummer) {
        this.name = name;
        this.nummer = nummer;
        this.module = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public List<Modul> getModule() {
        return module;
    }

    public void setModule(List<Modul> module) {
        this.module = module;
    }

    public void addModul(Modul modul){
        this.module.add(modul);
    }

    public String toString(){
        String back = this.name + ": Semester-Nr.: " + this.nummer;


        return back;
    }

    public String toCompleteString(){
        String back = this.name + ": Semester-Nr.: " + this.nummer + "; Module: ";

        if(this.module.size() >= 1){
            for (Modul m : this.module) {
                back += m.getName() + ", ";
            }
        }

        return back;
    }
}
