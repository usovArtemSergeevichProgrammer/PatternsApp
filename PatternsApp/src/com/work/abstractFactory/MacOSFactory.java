package com.work.abstractFactory;

public class MacOSFactory extends GUIFactory{

	@Override
	public RadioButton creatRadioButton() {
		// TODO Auto-generated method stub
		return new MacOSRadioButton();
	}

	@Override
	public Button creatButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public ChackButton creatChackButton() {
		// TODO Auto-generated method stub
		return new MacOSChackButton();
	}

}
