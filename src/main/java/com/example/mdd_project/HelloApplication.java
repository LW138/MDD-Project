package com.example.mdd_project;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.skin.TableColumnHeader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.controlsfx.control.CheckComboBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        Student student = new Student("Roth", "Joachiiim", "0157468466", "joachiiim.roth@zdh.thm.de", "5328884");

        List<Modul> modulListe = new ArrayList<>();

        {
            List<Pruefung> pruefungsListe = new ArrayList<>();
            pruefungsListe.add(new Pruefung("20.04.2020", 3.4, true, "Klausur", 100));
            modulListe.add(new Modul(3.4, true, 1, "Mathematik fuer Informatiker 1", 5, pruefungsListe));
        }
        {
            List<Pruefung> pruefungsListe = new ArrayList<>();
            modulListe.add(new Modul(2.6, true, 1, "Gundlagen der Informatik 1", 5, pruefungsListe));
        }
        {
            List<Pruefung> pruefungsListe = new ArrayList<>();
            modulListe.add(new Modul(2.5, true, 1, "Algorithmen und Datenstrukturen", 5, pruefungsListe));
        }
        {
            List<Pruefung> pruefungsListe = new ArrayList<>();
            modulListe.add(new Modul(1.2, true, 1, "Gundlagen der Informatik 2", 5, pruefungsListe));
        }

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
            if ("Gundlagen der Informatik 2".equals(m.getName())) {
                semesterListe.get(semesterListe.size() - 1).addModul(m);
            }
        }

        Semesterliste semester = new Semesterliste(semesterListe);

        List<Dozent> dozentenListe = new ArrayList<>();
        {
            List<String> titel = new ArrayList<>();
            titel.add("Dr");
            dozentenListe.add(new Dozent("Edelmann", "Renate", "", "renate.edelmann@mni.thm.de", titel));
        }
        for (Modul m : modulListe) {
            if ("Mathematik fuer Informatiker 1".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
        }
        {
            List<String> titel = new ArrayList<>();
            titel.add("Dr");
            dozentenListe.add(new Dozent("Hoffmann", "Benjamin", "", "benjamin.hoffmann@mni.thm.de", titel));
        }
        for (Modul m : modulListe) {
            if ("Gundlagen der Informatik 1".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
        }
        {
            List<String> titel = new ArrayList<>();
            titel.add("Prof");
            titel.add("Dr");
            titel.add("nat");
            titel.add("rer.");
            dozentenListe.add(new Dozent("Schultes", "Dominik", "", "dominik.schultes@mni.thm.de", titel));
        }
        for (Modul m : modulListe) {
            if ("Algorithmen und Datenstrukturen".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
            if ("Gundlagen der Informatik 2".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addModul(m);
            }
        }

        for (Modul m : modulListe) {
            if ("Algorithmen und Datenstrukturen".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addVerantwortlicheModule(m);
            }
            if ("Gundlagen der Informatik 2".equals(m.getName())) {
                dozentenListe.get(dozentenListe.size() - 1).addVerantwortlicheModule(m);
            }
        }
        {
            List<String> titel = new ArrayList<>();
            dozentenListe.add(new Dozent("Gumpfer", "Nils", "", "nils.gumpfer@mni.thm.de", titel));
        }
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
            if ("Gundlagen der Informatik 2".equals(m.getName())) {
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




        ObservableList<Modul> data = FXCollections.observableArrayList(
                notenuebersicht.getModule().getModule().get(0), notenuebersicht.getModule().getModule().get(1), notenuebersicht.getModule().getModule().get(3)
        );


        BorderPane borderPane = new BorderPane();
        CheckComboBox checkComboBox = new CheckComboBox();
        ObservableList<String> strings = FXCollections.observableArrayList();

        for (Semester s : notenuebersicht.getSemester().getSemester()) {
            strings.add(s.getName());
        }

        checkComboBox.getItems().addAll(strings);
        checkComboBox.getCheckModel().checkAll();


        ChoiceBox<String> studiengangChoiceBox = new ChoiceBox<>();
        ArrayList<String> observable = new ArrayList<>();
        for(Studiengang sg : notenuebersicht.getStudiengaenge().getStudiengaenge()){
            observable.add(sg.getName());
        }
        ObservableList<String> options = FXCollections.observableArrayList(observable);
        studiengangChoiceBox.setValue(options.get(0));
        studiengangChoiceBox.setItems(options);


        VBox vBox = new VBox();

        HBox studentOverview = new HBox();
        studentOverview.setPadding(new Insets(5,5,5,5));
        Text name = new Text("Name: " + notenuebersicht.getStudent().getName());
        Text firstName = new Text("First Name: " + notenuebersicht.getStudent().getVorname());
        Text matrikel = new Text("MNR: " + notenuebersicht.getStudent().getMatrikelnummer());
        Text email = new Text("Email: " + notenuebersicht.getStudent().getEmail());
        studentOverview.setSpacing(25);
        studentOverview.setMinHeight(40);
        studentOverview.setAlignment(Pos.CENTER);
        HBox semesterChoice = new HBox();
        semesterChoice.setSpacing(5);
        semesterChoice.setPadding(new Insets(0, 0, 20,20));

        semesterChoice.setAlignment(Pos.CENTER);
        semesterChoice.getChildren().addAll(checkComboBox);
        studentOverview.getChildren().addAll(studiengangChoiceBox, name, firstName, matrikel, email);
        vBox.getChildren().addAll(studentOverview, semesterChoice);
        borderPane.setTop(vBox);



        //new Modul(1.0, true, 1, "Modellgetriebene Softwareentwicklung", 5, d1, d1, studiengang, semester);
        TableView table = new TableView();
        table.prefHeightProperty().bind(stage.heightProperty());
        table.prefWidthProperty().bind(stage.widthProperty());

        table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        TableColumn gradeCol = new TableColumn("Note");

        TableColumn passedCol = new TableColumn("Bestanden");

        TableColumn attemptsCol = new TableColumn("Versuche");

        TableColumn modulenameCol = new TableColumn("Modulname");

        TableColumn crpCol = new TableColumn("CRP");

        TableColumn lecturerCol = new TableColumn("Dozent");

        TableColumn responsibleLecturerCol = new TableColumn("Verantwortlicher");

        TableColumn degreeCol = new TableColumn("Studiengang");

        TableColumn semesterCol = new TableColumn("Semester");


        gradeCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("Note")
        );
        passedCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("bestanden")
        );
        attemptsCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("Versuche")
        );

        modulenameCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("name")
        );

        crpCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("crp")
        );

        lecturerCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("dozenten")
        );

        responsibleLecturerCol.setCellValueFactory(
                new PropertyValueFactory<Modul, String>("verantwortliche")
        );

        degreeCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("pruefungen")
        );

        semesterCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("semester")
        );

        Callback<TableColumn, TableCell> cellFactory =
                new Callback<TableColumn, TableCell>() {
                    public TableCell call(TableColumn p) {
                        TableCell cell = new TableCell<Person, String>() {
                            @Override
                            public void updateItem(String item, boolean empty) {
                                super.updateItem(item, empty);
                                setText(empty ? null : getString());
                                setGraphic(null);
                            }

                            private String getString() {
                                return getItem() == null ? "" : getItem().toString();
                            }
                        };

                        cell.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent event) {
                                if (event.getClickCount() > 1) {
                                    System.out.println("double clicked!");
                                    TableCell c = (TableCell) event.getSource();
                                    System.out.println("Cell text: " + c.getText());
                                    Label secondLabel = new Label("I'm a Label on new Window");

                                    StackPane secondaryLayout = new StackPane();
                                    secondaryLayout.getChildren().add(secondLabel);

                                    Scene secondScene = new Scene(secondaryLayout, 230, 100);

                                    // New window (Stage)
                                    Stage newWindow = new Stage();
                                    newWindow.setTitle("Second Stage");
                                    newWindow.setScene(secondScene);

                                    // Set position of second window, related to primary window.
                                    newWindow.setX(stage.getX() + 200);
                                    newWindow.setY(stage.getY() + 100);
                                    System.out.println(checkComboBox.getCheckModel().getCheckedItems());
                                    newWindow.show();
                                }
                            }
                        });
                        return cell;
                    }
                };

        modulenameCol.setCellFactory(cellFactory);

        table.getColumns().addAll(gradeCol, passedCol, attemptsCol, modulenameCol, crpCol, lecturerCol, responsibleLecturerCol, degreeCol, semesterCol);

        table.setItems(data);

        borderPane.setCenter(table);


        HBox summary = new HBox();
        summary.setPadding(new Insets(5,5,5,5));
        Text anzahl = new Text("Module: " + 10);
        Text average = new Text("Avg ⌀: " + 1.8);

        Text crp = new Text("Sum CRP: " + 67);
        summary.getChildren().addAll(anzahl, average, crp);
        summary.setSpacing(10);
        ArrayList<Modul> allModules = new ArrayList<>();
        System.out.println(checkComboBox.getCheckModel().getCheckedItems());
        double averageGrade = 0.0;
        int sum_crp = 0;
        allModules.clear();
        for(Modul m : notenuebersicht.getModule().getModule()){
            for(Object s : checkComboBox.getCheckModel().getCheckedItems()){
                if(m.getSemester() != null) {
                    if (m.getSemester().getName().equals(s.toString())) {
                        allModules.add(m);
                        averageGrade = averageGrade + (m.getNote() * m.getCrp());
                        sum_crp = sum_crp + m.getCrp();
                    }
                }
            }

        }
        anzahl.setText("Module: " + allModules.size());
        average.setText("AVG ⌀: " + Math.round(averageGrade / sum_crp * 100.0) / 100.0);
        crp.setText("Credit Points: " + sum_crp);
        System.out.println(allModules.size());

        ObservableList<Modul> data2 = FXCollections.observableArrayList(allModules);
        table.setItems(data2);
        checkComboBox.getCheckModel().getCheckedItems().addListener(new ListChangeListener() {
            @Override
            public void onChanged(Change change) {
                System.out.println(studiengangChoiceBox.getSelectionModel().getSelectedItem());
                double averageGrade = 0.0;
                int sum_crp = 0;
                allModules.clear();
                for(Modul m : notenuebersicht.getModule().getModule()){
                    for(Object s : change.getList()){
                        if((m.getSemester() != null) && m.getStudiengang().getName().equals(studiengangChoiceBox.getSelectionModel().getSelectedItem())) {
                            if (m.getSemester().getName().equals(s.toString())) {
                                allModules.add(m);
                                averageGrade = averageGrade + (m.getNote() * m.getCrp());
                                sum_crp = sum_crp + m.getCrp();
                            }
                        }
                    }

                }
                anzahl.setText("Module: " + allModules.size());
                average.setText("AVG ⌀: " + Math.round(averageGrade / sum_crp * 100.0) / 100.0);
                crp.setText("Credit Points: " + sum_crp);
                System.out.println(allModules.size());

                ObservableList<Modul> data = FXCollections.observableArrayList(allModules);
                table.setItems(data);
            }
        });


        borderPane.setBottom(summary);

        Scene scene = new Scene(borderPane, 1280, 720);

        stage.setTitle("Notenübersicht");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
