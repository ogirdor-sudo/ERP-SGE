package org.example.erpsge;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.io.IOException;

public class iniciarSesionController {

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuPrincialUsuario.fxml"));

    Scene scene1 = new Scene(fxmlLoader.load(), 320, 240);



    public iniciarSesionController() throws IOException {

    }


    protected void menuUsuario() {

        stage.setScene(scene1);


    }

}
