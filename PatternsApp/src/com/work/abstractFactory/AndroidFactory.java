package com.work.abstractFactory;

public class AndroidFactory extends GUIFactory{

	@Override
	public RadioButton creatRadioButton() {
		// TODO Auto-generated method stub
		return new AndroidRadioButton();
	}

	@Override
	public Button creatButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public ChackButton creatChackButton() {
		// TODO Auto-generated method stub
		return new AndroidChackButton();
	}

}
