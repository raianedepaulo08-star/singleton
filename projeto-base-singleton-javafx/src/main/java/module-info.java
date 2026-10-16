module com.senai.javafx.mvc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.senai.javafx.mvc to javafx.fxml;
    opens com.senai.javafx.mvc.controller to javafx.fxml;

    opens com.senai.javafx.mvc.model to javafx.base;

    exports com.senai.javafx.mvc;
    exports com.senai.javafx.mvc.controller;
}