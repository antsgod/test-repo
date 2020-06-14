package com.comanche.DesignMode.creation.factorymethod;

public class ExhaustFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new ExhaustFan();
	}

}
