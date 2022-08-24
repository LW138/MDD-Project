module com.example.mdd_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.mdd_project to javafx.fxml;
    exports com.example.mdd_project;
}
