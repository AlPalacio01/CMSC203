package abc;




import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	private Button button1, button2, button3, button4, button5;
	private Label label1;
	private TextField textField1;
	//  declare two HBoxes
	private HBox box1, box2;
	
	//student Task #4:
	//  declare an instance of DataManager
	private DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		
		label1 = new Label("Feedback");
		
		textField1 = new TextField("");
		
		box1 = new HBox(2);
		box2 = new HBox(2);
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
		box1.setAlignment(Pos.CENTER);
		box2.setAlignment(Pos.CENTER);
		
		Insets inset = new Insets(20);
		HBox.setMargin(button1, inset);
		HBox.setMargin(button2, inset);
		HBox.setMargin(button3, inset);
		HBox.setMargin(button4, inset);
		HBox.setMargin(button5, inset);
		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		box1.getChildren().addAll(button1, button2, button3, button4, button5);
		box2.getChildren().addAll(label1, textField1);
		
		
		//  add the buttons to the other HBox
		getChildren().addAll(box1, box2);
		//  add the HBoxes to this FXMainPanel (a VBox)
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	private class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			
			Object object = arg0.getTarget();
			
			if (object == button1) {
				textField1.setText(dataManager.getHello());
				
			} else if (object == button2) {
				textField1.setText(dataManager.getHowdy());
				
			}else if (object == button3) {
				textField1.setText(dataManager.getChinese());
				
			}else if (object == button4) {
				textField1.setText("");
				
			}else if (object == button5) {
				Platform.exit(); 
				System.exit(0); 
				
			}
			
		}
		
	}
}

















	
