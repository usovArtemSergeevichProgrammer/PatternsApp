package com.work.abstractFactory;

public class WindowsFactory extends GUIFactory{

	@Override
	public RadioButton creatRadioButton() {
		// TODO Auto-generated method stub
		return new WindowsRadioButton();
	}

	@Override
	public Button creatButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public ChackButton creatChackButton() {
		// TODO Auto-generated method stub
		return new WindowsChackButton();
	}

}
