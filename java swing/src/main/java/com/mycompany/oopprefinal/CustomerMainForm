/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopprefinal;

/**
 *
 * @author bimya
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CustomerMainForm extends JFrame{
	
	
	
	private AddCustomerForm addCustomerForm;
	private ViewCustomerForm viewCustomerForm;
	
	private JButton btnAddCustomer;	
	private JButton btnSearchCustomer;	
	private JButton btnDeleteCustomer;	
	private JButton btnUpdateCustomer;	
	private JButton btnViewCustomer;	
	private JButton btnExit;	
	
	CustomerMainForm(){
		setTitle("Customer mgt System");
		setSize(500,300);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel buttonPanel=new JPanel(new GridLayout(3,2));
		
		btnAddCustomer=new JButton("Add Customer");
		btnAddCustomer.setFont(new Font("",1,25));
		btnAddCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(addCustomerForm==null){
					addCustomerForm=new AddCustomerForm();
				}
				addCustomerForm.setVisible(true);
			}
		});
		buttonPanel.add(btnAddCustomer);
		
		btnUpdateCustomer=new JButton("Update Customer");
		btnUpdateCustomer.setFont(new Font("",1,25));
		buttonPanel.add(btnUpdateCustomer);
		
		btnViewCustomer=new JButton("View Customer");
		btnViewCustomer.setFont(new Font("",1,25));
		buttonPanel.add(btnViewCustomer);
		btnViewCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(viewCustomerForm==null){
					viewCustomerForm=new ViewCustomerForm();
				}
				viewCustomerForm.setVisible(true);
			}
		});
		
		add("Center",buttonPanel);
		
	}
	
	public static void main(String args[]){
		new CustomerMainForm().setVisible(true);
	}
}
