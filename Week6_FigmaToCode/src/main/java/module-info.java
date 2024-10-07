module edu.farmingdale.week6_figmatocode {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.week6_figmatocode to javafx.fxml;
    exports edu.farmingdale.week6_figmatocode;
}