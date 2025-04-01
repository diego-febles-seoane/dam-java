package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RecuperarPasswordController extends AbstractController{

    private final String email = "programador@gmail.com";

    @FXML
    private TextField emailRecuperar;
    
    @FXML
    private Button buttonAtras;
    
    @FXML
    private Text textCorreo;

    @FXML
    protected void onButtonRecuperarClick() {

        if (emailRecuperar== null || emailRecuperar.getText().isEmpty() ){
                textCorreo.setText("Correo no valido");
                return;
        }

        if (!emailRecuperar.getText().equals(email)) {
            textCorreo.setText("Credenciales invalidas");
            return;
        } 

        textCorreo.setText("Usuario validado correctamente");
    }

    @FXML
    protected void openAtrasClick() {

        try {
            Stage stage = (Stage) buttonAtras.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize(){
        cambiarIdiomaRecuperarPassword();
    }
}
