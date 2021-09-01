package mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppMain extends Application {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("before launch");
        launch(args);
        logger.info("after launch");
    }

    @Override
    public void init() throws Exception {
        super.init();
        logger.info("in init");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        logger.info("in stop");
    }

    @Override
    public void start(Stage stage) throws Exception {
        logger.info("before start");

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/main_view.fxml"));
        loader.setController(new MainController(new Cat("Bob", 10)));
        Parent rootNode = loader.load();
        stage.setScene(new Scene(rootNode));

        stage.setTitle("MVC Demo");
        stage.show();

        logger.info("after start");
    }
}
