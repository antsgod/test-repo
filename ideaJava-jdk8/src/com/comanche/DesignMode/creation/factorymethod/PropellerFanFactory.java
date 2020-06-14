package com.comanche.DesignMode.creation.factorymethod;

public class PropellerFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new PropellerFan();
	}

}
