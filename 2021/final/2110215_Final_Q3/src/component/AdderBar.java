package component;

import application.ImageButtonType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class AdderBar extends HBox {
	private TextField textField;
	private ImageButton imageButton;
	
	public AdderBar(){
		super();
		initTextField();
		initImageButton();
		this.setPrefHeight(50);
		this.setPadding(new Insets(9));
		this.setSpacing(8);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(textField,imageButton);
	}
	
	private void initTextField() {
		textField = new TextField();
		textField.setPrefHeight(35);
		textField.setPrefWidth(640);
		//TODO		
	}
	private void initImageButton() {
		imageButton = new ImageButton(ImageButtonType.ADD);
		//TODO		
	}

	public TextField getTextField() {
		return textField;
	}

	public ImageButton getImageButton() {
		return imageButton;
	}

	public void setImageButton(ImageButton imageButton) {
		this.imageButton = imageButton;
	}

	public void setTextField(TextField textField) {
		this.textField = textField;
	}
	
}
