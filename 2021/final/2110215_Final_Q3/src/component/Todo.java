package component;

import application.ImageButtonType;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class Todo extends BorderPane{
	private ImageButton imageButton;
	private Text text;
	
	public Todo(Text text, ImageButton imageButton) {
		super();
		imageButton = new ImageButton(ImageButtonType.REMOVE);
		this.imageButton = imageButton;
		this.text = text;
		this.setLeft(text);
		this.setRight(imageButton);
		//TODO
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public void setImageButton(ImageButton imageButton) {
		this.imageButton = imageButton;
	}

	public ImageButton getImageButton() {
		return imageButton;
	}
	
	
}
