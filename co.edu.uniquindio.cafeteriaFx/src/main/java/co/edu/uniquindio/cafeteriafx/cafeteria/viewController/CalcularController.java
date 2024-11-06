package co.edu.uniquindio.cafeteriafx.cafeteria.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcularController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCalcular;

    @FXML
    private Label txtCosto;

    @FXML
    private Label txtCostoResultado;

    @FXML
    private Label txtIngredientes;

    @FXML
    private Label txtIngredientesResultado;

    @FXML
    void onCalcular(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCalcular != null : "fx:id=\"btnCalcular\" was not injected: check your FXML file 'calcular.fxml'.";
        assert txtCosto != null : "fx:id=\"txtCosto\" was not injected: check your FXML file 'calcular.fxml'.";
        assert txtCostoResultado != null : "fx:id=\"txtCostoResultado\" was not injected: check your FXML file 'calcular.fxml'.";
        assert txtIngredientes != null : "fx:id=\"txtIngredientes\" was not injected: check your FXML file 'calcular.fxml'.";
        assert txtIngredientesResultado != null : "fx:id=\"txtIngredientesResultado\" was not injected: check your FXML file 'calcular.fxml'.";

    }
    private void calcular(){


    }


}

