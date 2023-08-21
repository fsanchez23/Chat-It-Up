package fsanchez.a7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chat.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("CMPS3390 Chat");
        primaryStage.setScene(scene);
        primaryStage.setOnHidden(e -> {
            try {
                controller.exit();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
