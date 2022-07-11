package com.dto;

public class ClientDto {
	
	private String clientName;
	
	public ClientDto() {
		
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public ClientDto(String clientName) {
		super();
		this.clientName = clientName;
	}
	
	

}
