package component;

import application.ImageButtonType;
import application.Main;
import javafx.scene.Cursor;
import javafx.scene.image.ImageView;
import logic.TodoLogic;
import javafx.scene.image.*;

import java.awt.event.MouseEvent;

public class ImageButton extends ImageView {
//	private static final String addButtonUrl = "/res/plus-icon.png";
//	private static final String removeButtonUrl = "/res/minus-icon.png";
	private static final String addButtonUrl = ClassLoader.getSystemResource("plus-icon.png").toString();
	private static final String removeButtonUrl = ClassLoader.getSystemResource("minus-icon.png").toString();

	public ImageButton(ImageButtonType imageButtonType) {
		super();
		initImageButton(imageButtonType);
		initEventHandler(imageButtonType);
	}

	private void initImageButton(ImageButtonType imageButtonType) {
		this.setFitHeight(26);
		this.setFitWidth(26);
		if (imageButtonType.equals(ImageButtonType.ADD)) {
			Image tmp = (new Image(addButtonUrl));
			this.setImage(tmp);
		} else {
			Image tmp = (new Image(removeButtonUrl));
			this.setImage(tmp);
		}
		// TODO
	}

	private void initEventHandler(ImageButtonType imageButtonType) {
		this.setCursor(Cursor.HAND);
		if (imageButtonType.equals(ImageButtonType.ADD)) {
			this.setOnMouseClicked(event -> {
				TodoLogic.addTodo(Main.getAdderBarCurrentText());
			});
		} else {
			this.setOnMouseClicked(MouseEvent -> {
				TodoLogic.removeTodo(this);
			});
		}

	}
}
