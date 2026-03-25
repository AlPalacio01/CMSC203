/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: In this assignment, we will have to design and implement a Property Management 
 * application that handles multiple properties with various parameters. The array of Property 
 * objects will be handled inside a Property Management object.
 * Due: 03/30/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/

package abc;


import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PropertyAppFX extends Application {
	
	private ManagementCompany managementCompany = new ManagementCompany("AP Inc.", "01292-001");

	@Override
	public void start(Stage stage) throws Exception {
		
		TextField name = new TextField();
		name.setPromptText("Property Name:");
		
		TextField city = new TextField();
		city.setPromptText("City:");
		
		TextField rent = new TextField();
		rent.setPromptText("Rent Amount:");
		
		TextField owner = new TextField();
		owner.setPromptText("Owner Name:");
		
		Button addProperty = new Button("Add Property");
		Button showAllProperties = new Button("Show All Properties");
		Button showTotalRent = new Button("Show Total Rent");
		
		TextArea output = new TextArea();
		
		addProperty.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				Property property = new Property(name.getText(), city.getText(), Double.parseDouble(rent.getText()) ,owner.getText());
			
				managementCompany.addProperty(property);
				output.setText(managementCompany.toString());
			}
		
		});
		
		showAllProperties.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				output.setText(managementCompany.toString());
			}
		
		});

		showTotalRent.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				output.setText("Total Rent: $" + managementCompany.totalRent());
			}
		
		});
		
		VBox root = new VBox(10, name, city, rent, owner, addProperty, showAllProperties, showTotalRent, output);
		
		stage.setScene(new Scene(root, 400, 400));
		stage.setTitle("Property");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}




























