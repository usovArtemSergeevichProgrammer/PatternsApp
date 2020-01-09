package com.test.factory.abs;

public class SonyFactory extends ElectronicFactory{

	@Override
	public MobilePhone createMobilePhone() {
		// TODO Auto-generated method stub
		return new SonyMobilePhone();
	}

	@Override
	public TV createTV() {
		// TODO Auto-generated method stub
		return new SonyTV();
	}

	@Override
	public SmatrWatch createSmartWatch() {
		// TODO Auto-generated method stub
		return new SonySmartWatch();
	}

	@Override
	public Laptop createLaptop() {
		// TODO Auto-generated method stub
		return new SonyLaptop();
	}

}
