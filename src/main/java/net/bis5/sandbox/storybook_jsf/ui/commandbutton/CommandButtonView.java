package net.bis5.sandbox.storybook.ui.commandbutton;

import javax.enterprise.inject.Model;

@Model
public class CommandButtonView {

	private String buttonText;

	private String color;

	private String icon;

	public String getButtonText() {
		return buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
}
