package com.example.mdd_project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> titel = new ArrayList<>();
        Student student = new Student("Roth", "Joachiiim", "0157468466", "joachiiim.roth@zdh.thm.de", "5328884");

        List<Modul> modulListe = new ArrayList<>();
        modulListe.add(new Modul(3.4, true, 1, "Mathematik fuer Informatiker 1", 5));
        modulListe.add(new Modul(2.6, true, 1, "Gundlagen der Informatik 1", 5));
        modulListe.add(new Modul(2.5, true, 1, "Algorithmen und Datenstrukturen", 5));
        modulListe.add(new Modul(1.2, true, 1, "Gundlagen der Informatik 2", 5));

        Modulliste module = new Modulliste(modulListe);

        List<Semester> semesterListe = new ArrayList<>();
        semesterListe.add(new Semester("Wintersemester 20/21", 1));
        for (Modul m : modulListe) {
            if ("Mathematik fuer Informatiker 1".equals(m.getName())) {
                semesterListe.get(semesterListe.size() - 1).addModul(m);
            }
            if ("Gundlagen der Informatik 1".equals(m.getName())) {
                semesterListe.get(semesterListe.size() - 1).addModul(m);
            }
        }
        semesterListe.add(new Semester("Sommersemester 21", 2));
        for (Modul m : modulListe) {
            if ("Algorithmen und Datenstrukturen".equals(m.getName())) {
                semesterListe.get(semesterListe.size() - 1).addModul(m);
            }
        }

        Semesterliste semester = new Semesterliste(semesterListe);

        List<Dozent> dozentenListe = new ArrayList<>();
        titel.clear();
        titel.add("Dr");
        dozentenListe.add(new Dozent("Edelmann", "Renate", "", "renate.edelmann@mni.thm.de", titel));
        for (Modul m : modulListe) {
            if ("Mathematik fuer Informatiker 1".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
        }
        titel.clear();
        titel.add("Dr");
        dozentenListe.add(new Dozent("Hoffmann", "Benjamin", "", "benjamin.hoffmann@mni.thm.de", titel));
        for (Modul m : modulListe) {
            if ("Gundlagen der Informatik 1".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
        }
        titel.clear();
        titel.add("Prof");
        titel.add("Dr");
        titel.add("nat");
        titel.add("rer");
        dozentenListe.add(new Dozent("Schultes", "Dominik", "", "dominik.schultes@mni.thm.de", titel));
        for (Modul m : modulListe) {
            if ("Algorithmen und Datenstrukturen".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
            if ("Algorithmen und Datenstrukturen".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }
        titel.clear();
        dozentenListe.add(new Dozent("Gumpfer", "Nils", "", "nils.gumpfer@mni.thm.de", titel));
        for (Modul m : modulListe) {
            if ("Gundlagen der Informatik 2".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
        }

        Dozentenliste dozenten = new Dozentenliste(dozentenListe);

        List<Studiengang> studiengangsListe = new ArrayList<>();
        studiengangsListe.add(new Studiengang("Softwaretechnologie", 7, "ZDH", "Bachelor"));
        for (Modul m : modulListe) {
            if ("Mathematik fuer Informatiker 1".equals(m.getName())) {
                studiengangsListe.get(studiengangsListe.size() - 1).addModul(m);
            }
            if ("Gundlagen der Informatik 1".equals(m.getName())) {
                studiengangsListe.get(studiengangsListe.size() - 1).addModul(m);
            }
            if ("Algorithmen und Datenstrukturen".equals(m.getName())) {
                studiengangsListe.get(studiengangsListe.size() - 1).addModul(m);
            }
        }

        for (Dozent d : dozentenListe) {
            if ("dominik.schultes@mni.thm.de".equals(d.getEmail())) {
                studiengangsListe.get(studiengangsListe.size() - 1).setVerantwortlicher(d);
            }
        }

        Studiengangsliste studiengaenge = new Studiengangsliste(studiengangsListe);

        for (Dozent d : dozentenListe) {
            for (Modul m : d.getModule()) {
                m.addDozent(d);
            }

            for (Modul m : d.getVerantwortlicheModule()) {
                m.addVeranwortliche(d);
            }
        }

        for (Studiengang s : studiengangsListe) {
            for (Modul m : s.getModule()) {
                m.setStudiengang(s);
            }
        }

        for (Semester s : semesterListe) {
            for (Modul m : s.getModule()) {
                m.setSemester(s);
            }
        }

        Notenuebersicht notenuebersicht = new Notenuebersicht(student, module, semester, studiengaenge, dozenten);
        System.out.println(notenuebersicht.toString());



    }
}


// System.out.println(notenuebersicht.toString());
