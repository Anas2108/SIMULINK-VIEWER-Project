
package Project;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import java.util.Map;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
/**
 *
 * @author ANOOS
 */
public class FirstPane extends Pane {
     private final Button parseButton;
    private final Label statusLabel;


    
    
    public FirstPane() {
        //Creat needed Elements
        parseButton = new Button("Parse MDL File");
        statusLabel = new Label("Click the button to parse a Simulink MDL file.");
         Image image = new Image("Project/Images/Simulink.png"); 
        // Set the positions of the UI elements
        parseButton.setLayoutX(200);
        parseButton.setLayoutY(290);
        
        statusLabel.setLayoutX(150);
        statusLabel.setLayoutY(340);
        statusLabel.setTextFill(Color.WHITE);
        // Add the UI elements to the pane
        this.getChildren().addAll(new ImageView(image),parseButton, statusLabel);

       
        
        
        
        
        // Set the action for the parse button
        parseButton.setOnAction(e-> {
           
            
              // Create a file chooser dialog
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open MDL File");
            

            // Set the file extension filter
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("MDL files (*.mdl)", "*.mdl");
            fileChooser.getExtensionFilters().add(extFilter);

            // Show the file chooser dialog and get the selected file
            File selectedFile = fileChooser.showOpenDialog(getScene().getWindow());

            if (selectedFile != null) {
                // Update the status label with the selected file name
                statusLabel.setText("Selected file: " + selectedFile.getName());
               
                try {
                    readMDLfile readFile=new readMDLfile(selectedFile.toString());
                   
                    Stage stage = new SimulinkViewer(); // Create a new stage
               
                } catch (IOException ex) {
                    Logger.getLogger(FirstPane.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                statusLabel.setText("No file selected.");
            }
            
            
        });
        
        
   
    }
    
}
