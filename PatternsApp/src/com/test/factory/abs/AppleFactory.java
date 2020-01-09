package com.test.factory.abs;

public class AppleFactory extends ElectronicFactory{

	@Override
	public MobilePhone createMobilePhone() {
		// TODO Auto-generated method stub
		return new AppleMobilePhone();
	}

	@Override
	public TV createTV() {
		// TODO Auto-generated method stub
		return new AppleTV();
	}

	@Override
	public SmatrWatch createSmartWatch() {
		// TODO Auto-generated method stub
		return new AppleSmartWatch();
	}

	@Override
	public Laptop createLaptop() {
		// TODO Auto-generated method stub
		return new AppleLaptop();
	}

}
