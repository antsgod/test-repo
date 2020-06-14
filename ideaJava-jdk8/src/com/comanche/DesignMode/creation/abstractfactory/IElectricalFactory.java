package com.comanche.DesignMode.creation.abstractfactory;

// 电器工厂接口
public interface IElectricalFactory {

	IFan createFan();

	ITubeLight createTubeLight();
}
