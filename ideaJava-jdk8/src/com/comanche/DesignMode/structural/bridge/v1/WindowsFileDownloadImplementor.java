package com.comanche.DesignMode.structural.bridge.v1;

//Concrete Implementor
public class WindowsFileDownloadImplementor implements FileDownloadImplementor {

	@Override
	public Object downloadFile(String path) {
		return new Object();
	}

	@Override
	public boolean storeFile(Object object) {
		System.out.println("File download successfully in WINDOWS !!");
		return true;
	}

}
