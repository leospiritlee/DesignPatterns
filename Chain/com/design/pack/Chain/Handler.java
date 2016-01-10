package com.design.pack.Chain;

public abstract class Handler {

	protected Handler successorHandler;

	public void setSuccessorHandler(Handler successorHandler) {
		this.successorHandler = successorHandler;
	}
	
	public abstract void HandleRequest(int request);
	
}
