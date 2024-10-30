module org.example.demootp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demootp2 to javafx.fxml;
    exports org.example.demootp2;
}