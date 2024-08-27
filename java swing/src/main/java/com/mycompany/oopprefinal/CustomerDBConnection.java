/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopprefinal;

/**
 *
 * @author bimya
 */
import java.util.*;
class CustomerDBConnection{

    
	
    private ArrayList <Customer>customerList;
    
	
	private static CustomerDBConnection customerDBConnection;
	private CustomerDBConnection(){
		customerList=new ArrayList<>();
               
	}
	public static CustomerDBConnection getInstance(){
		if(customerDBConnection==null){
			customerDBConnection=new CustomerDBConnection();
		}
		return customerDBConnection;
	}
	public ArrayList<Customer>getCustomerList(){
		return customerList;
	}
       

   
}

