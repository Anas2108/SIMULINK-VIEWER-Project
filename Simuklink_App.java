
package Project;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Simuklink_App extends Application {
   

 
    
    @Override
    public void start(Stage primaryStage)  {

      
        Pane pane=new FirstPane(); //inheritance 
        Scene scene=new Scene(pane, 500, 500);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("Project/Images/Icon.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}