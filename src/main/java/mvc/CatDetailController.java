package mvc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.ResourceBundle;

public class CatDetailController implements Initializable {
    private static final Logger logger = LogManager.getLogger();

    @FXML
    private TextField catName;

    @FXML
    private TextField catAge;

    private Cat cat;

    public CatDetailController(Cat cat) {
        this.cat = cat;
    }

    @FXML
    void cancelSave(ActionEvent event) {
        logger.info("Cancel clicked");
    }

    @FXML
    void save(ActionEvent event) {
        logger.info("Save clicked");

        // TODO: validate text fields FIRST before you save them to model
        cat.setCatName(catName.getText());
        try {
            cat.setAge(Integer.parseInt(catAge.getText()));
        } catch(NumberFormatException e) {
            // TODO: find and plug in your alert helper functions
            // Alert errorAlert = new Alert(Alert.AlertType.ERROR)
            logger.error("Hey man, cat age must be an integer from 0 to 40");
            return;
        }

        // TODO: save the data to the database somewhere
        // TODO: what id db save fails?
        // ALERT
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // this is where we connect the model data to the GUI components like textfields
        catName.setText(cat.getCatName());
        catAge.setText("" + cat.getAge());
    }


}
