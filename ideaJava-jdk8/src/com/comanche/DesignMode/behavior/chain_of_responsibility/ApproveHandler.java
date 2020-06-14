package com.comanche.DesignMode.behavior.chain_of_responsibility;

// Handler
public interface ApproveHandler {

	public void setNextHandler(ApproveHandler nextHandler);

	public void approve(Leave leave);

}
