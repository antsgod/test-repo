package com.comanche.DesignMode.creation.factorymethod;

public class TableFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new TableFan();
	}

}
