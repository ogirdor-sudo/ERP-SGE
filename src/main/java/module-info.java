module org.example.erpsge {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.erpsge to javafx.fxml;
    exports org.example.erpsge;
}