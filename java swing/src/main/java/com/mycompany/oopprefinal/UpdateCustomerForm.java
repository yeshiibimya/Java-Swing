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
import java.awt.*;
import java.awt.event.*;

public class UpdateCustomerForm extends JFrame {
    private JLabel titleLabel;
    private JButton btnUpdate;
    private JButton btnCancel;
    private JButton btnSearch;

    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblAddress;
    private JLabel lblSalary;
    private JLabel lblNameOrPhone;

     private JLabel lblIdresult;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtSalary;
    private JTextField txtNameOrPhone;

    private Customer foundCustomer;

    UpdateCustomerForm() {
        setSize(500, 500);
        setTitle("Update Customer Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Update Customer Form");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("", Font.BOLD, 30));
        add("North", titleLabel);

        JPanel searchPanel = new JPanel(new GridLayout(1, 2));
        lblNameOrPhone = new JLabel("Enter name ");
        lblNameOrPhone.setFont(new Font("", Font.BOLD, 20));
        searchPanel.add(lblNameOrPhone);

        txtNameOrPhone = new JTextField(14);
        txtNameOrPhone.setFont(new Font("", Font.PLAIN, 20));
        searchPanel.add(txtNameOrPhone);
        add("North", searchPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("", Font.BOLD, 20));
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String nameOrPhone = txtNameOrPhone.getText();
                foundCustomer = CustomerController.searchCustomer(nameOrPhone);
                if (foundCustomer != null) {
                    lblIdresult.setText(foundCustomer.getId());
                    String name=txtName.getText();
				String address=txtAddress.getText();
				double salary=Double.parseDouble(txtSalary.getText());
				updateCustomer(foundCustomer);
                                                } 
            }
        });
        buttonPanel.add(btnSearch);

        btnUpdate = new JButton("Update");
        btnUpdate.setFont(new Font("",1, 20));
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (foundCustomer != null) {
                   updateCustomer(foundCustomer);
                   clearFields() ;
                   txtNameOrPhone.setText("");
                    
                } 
            }
        });
        buttonPanel.add(btnUpdate);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", Font.BOLD, 20));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateCustomerForm.this.dispose();
            }
        });
        buttonPanel.add(btnCancel);
        add("South", buttonPanel);

        JPanel labelPanel = new JPanel(new GridLayout(4, 1));

        lblId = new JLabel("Id");
        lblId.setFont(new Font("",1, 20));
        labelPanel.add(lblId);

        lblName = new JLabel("Name");
        lblName.setFont(new Font("", 1, 20));
        labelPanel.add(lblName);

        lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("", 1, 20));
        labelPanel.add(lblAddress);

        lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("", 1, 20));
        labelPanel.add(lblSalary);

        add("West", labelPanel);

        

        JPanel textPanel=new JPanel(new GridLayout(4,1));
		
        lblIdresult = new JLabel();
        lblIdresult.setFont(new Font("",1, 20));
        
	textPanel.add(lblIdresult);
		
		txtName=new JTextField(15);
		txtName.setFont(new Font("",1,20));
		JPanel nameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		nameTextPanel.add(txtName);
		textPanel.add(nameTextPanel);
		
		txtAddress=new JTextField(20);
		txtAddress.setFont(new Font("",1,20));
		JPanel addressTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		addressTextPanel.add(txtAddress);
		textPanel.add(addressTextPanel);
		
		txtSalary=new JTextField(6);
		txtSalary.setFont(new Font("",1,20));
		JPanel salaryTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		salaryTextPanel.add(txtSalary);
		textPanel.add(salaryTextPanel);

        add("Center", textPanel);
    }

    
   private void updateCustomer(Customer customer) {
        customer.setName(txtName.getText());
        customer.setAddress(txtAddress.getText());
        customer.setSalary(Double.parseDouble(txtSalary.getText()));
    }

    private void clearFields() {
        lblIdresult.setText("");
        txtAddress.setText("");
        txtName.setText("");
       txtSalary.setText("");
    }
}

