package com.comanche.DesignMode.creation.builder.classicbuilder;

// 这个是导演"Director"
public class Manufacturer {
	public void construct(IMobilePhoneBuilder phoneBuilder) {
		phoneBuilder.buildBattery();
		phoneBuilder.buildOS();
		phoneBuilder.buildScreen();
		phoneBuilder.buildStylus();
	}
}
