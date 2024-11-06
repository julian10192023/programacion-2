module co.edu.uniquindio.cafeteriafx.cafeteria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.cafeteriafx.cafeteria to javafx.fxml;
    exports co.edu.uniquindio.cafeteriafx.cafeteria;

    opens co.edu.uniquindio.cafeteriafx.cafeteria.viewController to javafx.fxml;
    exports co.edu.uniquindio.cafeteriafx.cafeteria.viewController to javafx.fxml;


}