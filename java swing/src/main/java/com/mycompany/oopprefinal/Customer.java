/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopprefinal;

/**
 *
 * @author bimya
 */
class Customer{
	private String id;
	private String name;
	private String address;
	private double salary;
	
	public Customer(){
		
	}
	
	public Customer(String id, String name, String address, double salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;		
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public double getSalary(){
		return salary;
	}

    public void setName(String name) {
        this.name=name;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }
}


