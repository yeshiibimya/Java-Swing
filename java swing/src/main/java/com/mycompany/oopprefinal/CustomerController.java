/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopprefinal;

/**
 *
 * @author bimya
 */
import java.util.ArrayList;
class CustomerController{
	public static boolean addCustomer(Customer customer){
		ArrayList <Customer>customerList=CustomerDBConnection.getInstance().getCustomerList();
		return customerList.add(customer);	
	}
	public static boolean deleteCustomer(Customer customer){
		CustomerDBConnection.getInstance().getCustomerList().remove(customer);
		return true;
	}
	static Customer searchCustomer(String nameOrPhone) {
        for (Customer customer : CustomerDBConnection.getInstance().getCustomerList()) {
            if (customer.getName().equals(nameOrPhone) ) {
                return customer;
            }
        }
        return null;
    }
        static Customer searchCustomer(Customer searchCustomer) {
        for (Customer customer : CustomerDBConnection.getInstance().getCustomerList()) {
            if (customer.equals(searchCustomer)) {
                return customer;
            }
        }
        return null;
    }
        public static void sortingByName(){
        String[] tempIdArray=new String[CustomerDBConnection.getInstance().getCustomerList().size()];
        String[] tempNameArray=new String[CustomerDBConnection.getInstance().getCustomerList().size()];
        String[] tempAddressArray=new String[CustomerDBConnection.getInstance().getCustomerList().size()];
        double[] tempSalaryArray=new double[CustomerDBConnection.getInstance().getCustomerList().size()];
      
        for(int i=0; i<CustomerDBConnection.getInstance().getCustomerList().size(); i++){
            tempIdArray[i]=CustomerDBConnection.getInstance().getCustomerList().get(i).getId();
            tempNameArray[i]=CustomerDBConnection.getInstance().getCustomerList().get(i).getName();
            tempAddressArray[i]=CustomerDBConnection.getInstance().getCustomerList().get(i).getAddress();
            tempSalaryArray[i]=CustomerDBConnection.getInstance().getCustomerList().get(i).getSalary();
           
        }
        for(int j=1; j<CustomerDBConnection.getInstance().getCustomerList().size(); j++){
            for(int i=0; i<CustomerDBConnection.getInstance().getCustomerList().size()-j; i++){
                if(tempNameArray[i].compareTo(tempNameArray[i+1])>0){
                    String tempName=tempNameArray[i];
                    tempNameArray[i]=tempNameArray[i+1];
                    tempNameArray[i+1]=tempName;

                    String tempId=tempIdArray[i];
                    tempIdArray[i]=tempIdArray[i+1];
                    tempIdArray[i+1]=tempId;

                    
                    String tempAddress = tempAddressArray[i];
                     tempAddressArray[i] = tempAddressArray[i + 1];
                      tempAddressArray[i + 1] = tempAddress;

                    
                    double tempSalary=tempSalaryArray[i];
                    tempSalaryArray[i]=tempSalaryArray[i+1];
                    tempSalaryArray[i+1]=tempSalary;

                    

                }
            }
        }
    ArrayList<Customer> sortedList = new ArrayList<>();
    for (int i = 0; i < CustomerDBConnection.getInstance().getCustomerList().size(); i++) {
        sortedList.add(new Customer(tempIdArray[i], tempNameArray[i], tempAddressArray[i], tempSalaryArray[i]));
    }
    CustomerDBConnection.getInstance().getCustomerList().clear();
    CustomerDBConnection.getInstance().getCustomerList().addAll(sortedList);
    
}
       

    }
       
        


