package com.comanche.DesignMode.structural.bridge.v1;

// Abstraction
public interface FileDownloaderAbstraction {

	public Object download(String path);

	public boolean store(Object object);
}
