module com.example.curs2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.curs2 to javafx.fxml;
    exports com.example.curs2;
}