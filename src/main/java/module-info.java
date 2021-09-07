module com.example.cyc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.web;
    requires javafx.swing;


    opens com.example.cyc to javafx.fxml;
    exports com.example.cyc;
}