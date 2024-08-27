/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopprefinal;

/**
 *
 * @author bimya
 */
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class SortingbyNameForm extends JFrame{
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	
	private JLabel titleLabel;
	
	private JButton btnReload; 
	SortingbyNameForm(){
		setSize(400,300);
		setTitle("Sorting By Name Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("Sorting By Name Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
		
		String[] columnsName={"Customer Id","Name","Address","Salary"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		
		add("Center",tablePane);
		
		JPanel buttonPanel=new JPanel(); //Default layout ->JPanel --FlowLAyout
		btnReload=new JButton("Reload");
		btnReload.setFont(new Font("",1,20));
		btnReload.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				for(int i=0; i<CustomerDBConnection.getInstance().getCustomerList().size(); i++){
					Customer customer=CustomerDBConnection.getInstance().getCustomerList().get(i);
					Object[] rowData={customer.getId(), customer.getName(),customer.getAddress(),customer.getSalary()};
					dtm.addRow(rowData);
				}
			}
		});
		buttonPanel.add(btnReload);
		add("South",buttonPanel);
		
	

    
}}
