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
	
	private UpdateCustomerForm updateCustomerForm;
	private DeleteCustomerForm deleteCustomerForm;
	private AddCustomerForm addCustomerForm;
	private ViewCustomerForm viewCustomerForm;
        
                private SortCustomerForm sortCustomerForm;
	
	private JButton btnAddCustomer;	
	private JButton btnSearchCustomer;	
	private JButton btnDeleteCustomer;	
	private JButton btnUpdateCustomer;	
	private JButton btnViewCustomer;	
        private JButton btnSortCustomer;
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
		
		btnDeleteCustomer=new JButton("Delete Customer");
		btnDeleteCustomer.setFont(new Font("",1,25));
		
                btnDeleteCustomer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
				if(deleteCustomerForm==null){
					deleteCustomerForm=new DeleteCustomerForm();
				}
				deleteCustomerForm.setVisible(true);
			}
		});
		buttonPanel.add(btnDeleteCustomer);
                
                
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
                btnUpdateCustomer=new JButton("Update Customer");
		btnUpdateCustomer.setFont(new Font("",1,25));
		
                btnUpdateCustomer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
				if(updateCustomerForm==null){
					updateCustomerForm=new UpdateCustomerForm();
				}
				updateCustomerForm.setVisible(true);
			}
		});
		buttonPanel.add(btnUpdateCustomer);
		
	
                 btnSortCustomer=new JButton("Sort Customer");
                btnSortCustomer.setFont(new Font("",1,25));
		
                btnSortCustomer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
				if(sortCustomerForm==null){
					sortCustomerForm=new SortCustomerForm();
				}
				sortCustomerForm.setVisible(true);
			}
		});
		buttonPanel.add( btnSortCustomer);
		
	
		
		add("Center",buttonPanel);
        }  
                
	
	public static void main(String args[]){
		new CustomerMainForm().setVisible(true);
	}
}
