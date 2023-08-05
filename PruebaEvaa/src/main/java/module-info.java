module edu.ejercicois.pruebaevaa {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ejercicois.pruebaevaa to javafx.fxml;
    exports edu.ejercicois.pruebaevaa;
}