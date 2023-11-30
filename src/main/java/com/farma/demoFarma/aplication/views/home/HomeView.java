package com.farma.demoFarma.aplication.views.home;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HomeView extends Application {


    private VBox menu;
    private Label seccionActual;

    private String[] secciones = {
            "Facturacion",
            "Inventario",
            "Cuentas a Pagar",
            "Cuentas por Cobrar",
            "Impresora Fiscal",
            "Sistema de Facturas",
            "Utilitys"
    };

    private int indiceSeccionActual = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menú Central");

        // Crear las secciones del menú
        menu = new VBox();
        for (String seccion : secciones) {
            menu.getChildren().add(crearSeccion(seccion));
        }

        // Mostrar la primera sección por defecto
        seccionActual = new Label("Bienvenido");
        seccionActual.setStyle("-fx-font-size: 20;");

        // Organizar la interfaz con BorderPane
        BorderPane root = new BorderPane();
        root.setCenter(menu);
        root.setLeft(seccionActual);

        // Crear la escena y manejar eventos de teclado
        Scene scene = new Scene(root, 400, 300);
        scene.setOnKeyPressed(event -> manejarTeclaPresionada(event.getCode()));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Label crearSeccion(String nombreSeccion) {
        Label seccion = new Label(nombreSeccion);
        seccion.setStyle("-fx-font-size: 18;");
        seccion.setOnMouseClicked(event -> actualizarSeccion(nombreSeccion));
        return seccion;
    }

    private void actualizarSeccion(String nombreSeccion) {
        seccionActual.setText("Sección Actual: " + nombreSeccion);
    }

    private void manejarTeclaPresionada(KeyCode tecla) {
        switch (tecla) {
            case UP:
                seleccionarSeccionAnterior();
                break;
            case DOWN:
                seleccionarSeccionSiguiente();
                break;
            default:
                // Otras teclas no se manejan en este ejemplo
                break;
        }
    }

    private void seleccionarSeccionAnterior() {
        if (indiceSeccionActual > 0) {
            indiceSeccionActual--;
            actualizarSeccion(secciones[indiceSeccionActual]);
        }
    }

    private void seleccionarSeccionSiguiente() {
        if (indiceSeccionActual < secciones.length - 1) {
            indiceSeccionActual++;
            actualizarSeccion(secciones[indiceSeccionActual]);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}