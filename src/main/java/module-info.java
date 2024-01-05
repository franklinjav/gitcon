module com.example.practicagitconsola {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicagitconsola to javafx.fxml;
    exports com.example.practicagitconsola;
}