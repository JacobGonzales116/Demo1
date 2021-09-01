package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Demo1 extends Application {

    public static void main(String[] args){
        // maybe do other startup here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //load the scene and plug it into the stage
        URL viewURL = this.getClass().getResource("/Demo1.fxml");
        FXMLLoader loader = new FXMLLoader(viewURL);
        Parent rootNode = loader.load();
        stage.setScene(new Scene(rootNode));
        stage.setTitle("JavaFX Demo 1");
        stage.show();
    }
}
