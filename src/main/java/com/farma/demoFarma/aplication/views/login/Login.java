package com.farma.demoFarma.aplication.views.login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application{
	

    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		 primaryStage.setTitle("Login");

		 primaryStage.setTitle("Login");

	        // Crear la interfaz de usuario
	        GridPane grid = new GridPane();
	       
	        grid.setPadding(new Insets(10, 10, 10, 10));
	        grid.setVgap(8);
	        grid.setHgap(10);

	        // Etiqueta y campo para el nombre de usuario
	        Label usernameLabel = new Label("Usuario:");
	        
	        GridPane.setConstraints(usernameLabel, 0, 0);
	        usernameLabel.setMaxWidth(Double.MAX_VALUE);
	        usernameLabel.setMaxHeight(Double.MAX_VALUE);
	        
	        TextField usernameInput = new TextField();
	       
	        GridPane.setConstraints(usernameInput, 1, 0);

	        usernameInput.setMaxWidth(Double.MAX_VALUE);
	        usernameInput.setMaxHeight(Double.MAX_VALUE);
	        // Etiqueta y campo para la contraseña
	        Label passwordLabel = new Label("Contraseña:");
	        GridPane.setConstraints(passwordLabel, 0, 1);
	        passwordLabel.setMaxWidth(Double.MAX_VALUE);
	        passwordLabel.setMaxHeight(Double.MAX_VALUE);
	        
	        PasswordField passwordInput = new PasswordField();
	       
	        GridPane.setConstraints(passwordInput, 1, 1);
	        passwordInput.setMaxWidth(Double.MAX_VALUE);
	        passwordInput.setMaxHeight(Double.MAX_VALUE);
	        // Botón de inicio de sesión
	        Button loginButton = new Button("Ingresar");
	        loginButton.setCursor(Cursor.HAND);
	        GridPane.setConstraints(loginButton, 1, 2);
	        loginButton.setMaxWidth(Double.MAX_VALUE);
	        loginButton.setMaxHeight(Double.MAX_VALUE);

	        // Configurar la acción del botón de inicio de sesión
	        loginButton.setOnAction(e -> {
	            // Agregar lógica de autenticación aquí
	            // Por ahora, simplemente mostramos la información ingresada
	            System.out.println("Usuario: " + usernameInput.getText());
	            System.out.println("Contraseña: " + passwordInput.getText());
	        });

	        // Agregar componentes al grid
	        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton);

	        // Configurar la escena
	        Scene scene = new Scene(grid, 300, 200);
	        primaryStage.setScene(scene);

	        primaryStage.show();
	    }
		
}
