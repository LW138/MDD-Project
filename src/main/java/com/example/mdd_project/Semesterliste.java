package com.example.mdd_project;

import java.util.List;

public class Semesterliste {
    private List<Semester> semester;

    public Semesterliste(List<Semester> semester) {
        this.semester = semester;
    }

    public List<Semester> getSemester() {
        return semester;
    }

    public void setSemester(List<Semester> semester) {
        this.semester = semester;
    }

    public String toString(){
        String back = "Semester: \n";

        for (Semester s : this.semester) {
            back += s.toString() + "\n";
        }

        return back + "\n";
    }
}
