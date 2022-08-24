package com.example.mdd_project;

public class Notenuebersicht {
    private Student student;
    private Modulliste module;
    private Semesterliste semester;
    private Studiengangsliste studiengaenge;
    private Dozentenliste dozenten;

    public Notenuebersicht(Student student, Modulliste module, Semesterliste semester, Studiengangsliste studiengaenge, Dozentenliste dozenten) {
        this.student = student;
        this.module = module;
        this.semester = semester;
        this.studiengaenge = studiengaenge;
        this.dozenten = dozenten;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Modulliste getModule() {
        return module;
    }

    public void setModule(Modulliste module) {
        this.module = module;
    }

    public Semesterliste getSemester() {
        return semester;
    }

    public void setSemester(Semesterliste semester) {
        this.semester = semester;
    }

    public Studiengangsliste getStudiengaenge() {
        return studiengaenge;
    }

    public void setStudiengaenge(Studiengangsliste studiengaenge) {
        this.studiengaenge = studiengaenge;
    }

    public Dozentenliste getDozenten() {
        return dozenten;
    }

    public void setDozenten(Dozentenliste dozenten) {
        this.dozenten = dozenten;
    }

    public String toString(){
        return this.student + "\n" + this.studiengaenge.toString() + this.semester.toString() + this.module.toString() + this.dozenten.toString();
    }
}
