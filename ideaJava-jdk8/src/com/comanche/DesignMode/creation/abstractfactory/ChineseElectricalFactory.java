package com.comanche.DesignMode.creation.abstractfactory;

public class ChineseElectricalFactory implements IElectricalFactory {

	public IFan createFan() {
		return new ChineseFan();
	}

	public ITubeLight createTubeLight() {
		return new ChineseTubeLight();
	}

}
