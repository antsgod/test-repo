package com.comanche.DesignMode.structural.bridge.v1;

// Implementor
public interface FileDownloadImplementor {

	public Object downloadFile(String path);

	public boolean storeFile(Object object);

}
