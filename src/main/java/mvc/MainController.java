package mvc;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    private Cat cat;

    @FXML
    private BorderPane rootPane;

    public MainController(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/cat_detail.fxml"));

        loader.setController(new CatDetailController(cat));
        Parent rootNode = null;
        try {
            rootNode = loader.load();
            rootPane.setCenter(rootNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
