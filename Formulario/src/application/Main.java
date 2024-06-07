package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // CREACIÓN DE LOS CONTROLES
        Button button = new Button("Button");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField("");
        textField.setPrefWidth(100); 
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefWidth(100); 
        TextArea textArea = new TextArea("Se merece un 10 esta tarea ;)");
        textArea.setPrefWidth(200); 
        textArea.setPrefHeight(100); 
        ProgressIndicator progressIndicator = new ProgressIndicator(0.50);
        ProgressBar progressBar = new ProgressBar(0.50);
        Slider slider = new Slider();
        slider.setValue(50);

        // CREACIÓN DEL PANE PARA AÑADIR LOS CONTROLES
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.add(new Label("Button      "), 0, 0);
        grid.add(button, 1, 0);

        grid.add(new Label("CheckBox    "), 0, 1);
        grid.add(checkBox, 1, 1);

        grid.add(new Label("Hyperlink   "), 0, 2);
        grid.add(hyperlink, 1, 2);

        grid.add(new Label("ToggleButton"), 0, 3);
        grid.add(toggleButton, 1, 3);

        grid.add(new Label("RadioButton "), 0, 4);
        grid.add(radioButton, 1, 4);

        grid.add(new Label("Label       "), 0, 5);
        grid.add(label, 1, 5);

        grid.add(new Label("TextField   "), 0, 6);
        grid.add(textField, 1, 6);

        grid.add(new Label("PasswordField"), 0, 7);
        grid.add(passwordField, 1, 7);

        grid.add(new Label("TextArea    "), 0, 8);
        grid.add(textArea, 1, 8);

        grid.add(new Label("ProgressIndicator"), 0, 9);
        grid.add(progressIndicator, 1, 9);

        grid.add(new Label("ProgressBar "), 0, 10);
        grid.add(progressBar, 1, 10);

        grid.add(new Label("Slider      "), 0, 11);
        grid.add(slider, 1, 11);

        // ESCENE
        Scene scene = new Scene(grid, 350, 550);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
