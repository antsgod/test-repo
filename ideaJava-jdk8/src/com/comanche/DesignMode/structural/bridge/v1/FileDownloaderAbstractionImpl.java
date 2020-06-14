package com.comanche.DesignMode.structural.bridge.v1;

// RefinedAbstraction
public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {
	private FileDownloadImplementor provider = null;

	public FileDownloaderAbstractionImpl(FileDownloadImplementor provider) {
		super();
		this.provider = provider;
	}

	@Override
	public Object download(String path) {
		return provider.downloadFile(path);
	}

	@Override
	public boolean store(Object path) {
		return provider.storeFile(path);
	}
}
