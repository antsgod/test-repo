package com.comanche.DesignMode.structural.proxy;

// RealSubject
public class Folder implements IFolder {

	public void performOperations() {
		// access folder and perform various operations like copy or cut files
		System.out.println("Performing operation on folder");
	}

}
