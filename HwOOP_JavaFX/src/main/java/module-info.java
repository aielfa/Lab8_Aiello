module edu.farmingdale.hwoop_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.hwoop_javafx to javafx.fxml;
    exports edu.farmingdale.hwoop_javafx;
}