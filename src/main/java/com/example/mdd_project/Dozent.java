package com.example.mdd_project;

import java.util.ArrayList;
import java.util.List;

public class Dozent extends Person{
    private List<String> titel;
    private List<Modul> module;
    private List<Modul> verantwortlicheModule;

    public Dozent(String name, String vorname, String telnummer, String email, List<String> titel, List<Modul> module, List<Modul> verantwortlicheModule) {
        super(name, vorname, telnummer, email);
        this.titel = titel;
        this.module = module;
        this.verantwortlicheModule = verantwortlicheModule;
    }

    public Dozent(String name, String vorname, String telnummer, String email, List<String> titel) {
        super(name, vorname, telnummer, email);
        this.titel = titel;
        this.module = new ArrayList<>();
        this.verantwortlicheModule = new ArrayList<>();
    }


    public List<String> getTitel() {
        return titel;
    }

    public void setTitel(List<String> titel) {
        this.titel = titel;
    }


    public List<Modul> getModule() {
        return module;
    }

    public void setModule(List<Modul> module) {
        this.module = module;
    }

    public List<Modul> getVerantwortlicheModule() {
        return verantwortlicheModule;
    }

    public void setVerantwortlicheModule(List<Modul> verantwortlicheModule) {
        this.verantwortlicheModule = verantwortlicheModule;
    }

    public void addModul(Modul modul){
        this.module.add(modul);
    }

    public void addVerantwortlicheModule(Modul modul){
        this.verantwortlicheModule.add(modul);
    }

    public String toString(){
        String back = "";

        if(this.titel.size() >= 1){
            back += this.titel.toString();
        }

        back += " " + super.toString() + " hat: ";

        if(this.module.size() >= 1){
            for (Modul m : this.module) {
                back += m.getName() + ", ";
            }
        }

        back += "; verantwortlich für: ";

        if(this.verantwortlicheModule.size() >= 1){
            for (Modul m : this.verantwortlicheModule) {
                back += m.getName() + ", ";
            }
        }

        return  back;
    }
}
