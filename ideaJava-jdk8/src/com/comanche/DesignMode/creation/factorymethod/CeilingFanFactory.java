package com.comanche.DesignMode.creation.factorymethod;

public class CeilingFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new CeilingFan();
	}

}
