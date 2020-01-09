package com.test.factory.abs;

import com.test.factory.abs.interfaces.Playable;

public abstract class Device{ //implements Playable{

	abstract void info();
}

abstract class MobilePhone extends Device{
	
}

abstract class Laptop extends Device{
	
}

abstract class TV extends Device{
	
}

abstract class SmatrWatch extends Device{
	
}
