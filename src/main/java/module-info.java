module eu.telecomnancy.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    opens eu.telecomnancy.javafx to javafx.fxml;
    opens eu.telecomnancy.javafx.controller to javafx.fxml;

    exports eu.telecomnancy.javafx;
}