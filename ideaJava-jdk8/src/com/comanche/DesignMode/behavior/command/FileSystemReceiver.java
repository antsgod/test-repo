package com.comanche.DesignMode.behavior.command;

// Receiver Interface
public interface FileSystemReceiver {
	void openFile();
	void writeFile();
	void closeFile();
}
