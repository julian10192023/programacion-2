module co.edu.uniquindio.preparcial2.patron {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.preparcial2.patron to javafx.fxml;
    exports co.edu.uniquindio.preparcial2.patron;
}