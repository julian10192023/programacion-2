module co.edu.uniquindio.preparcial2.preparcial2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.preparcial2.preparcial2 to javafx.fxml;
    exports co.edu.uniquindio.preparcial2.preparcial2;

    opens co.edu.uniquindio.preparcial2.preparcial2.viewController;
    exports co.edu.uniquindio.preparcial2.preparcial2.viewController;
}