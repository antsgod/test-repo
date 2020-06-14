package com.comanche.DesignMode.structural.adapter.display;

//  支持VGA接口的显示器
public class VgaDisplay implements IVga {

	public void openVga() {
		System.out.println("Opening..VGA Display...");
	}

}
