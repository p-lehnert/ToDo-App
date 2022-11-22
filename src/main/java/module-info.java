module de.app.todo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javax.persistence;
    requires lombok;

    opens de.app.todo to javafx.fxml;
    exports de.app.todo;
    exports de.app.todo.controller;
    opens de.app.todo.controller to javafx.fxml;
}