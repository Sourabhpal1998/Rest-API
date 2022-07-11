package com.dto;

import java.util.List;

public class EmployeeDto {
	
	private String firstName;
	private String sex;
	private List<ClientDto> clientDto;
	private List<WorksWithDto> worksWithDto;

	
	public EmployeeDto() {
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public List<ClientDto> getClientDto() {
		return clientDto;
	}


	public void setClientDto(List<ClientDto> clientDto) {
		this.clientDto = clientDto;
	}


	public List<WorksWithDto> getWorksWithDto() {
		return worksWithDto;
	}


	public void setWorksWithDto(List<WorksWithDto> worksWithDto) {
		this.worksWithDto = worksWithDto;
	}


	public EmployeeDto(String firstName, String sex, List<ClientDto> clientDto, List<WorksWithDto> worksWithDto) {
		super();
		this.firstName = firstName;
		this.sex = sex;
		this.clientDto = clientDto;
		this.worksWithDto = worksWithDto;
	}
	
	


	
	
	
}
