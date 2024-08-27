/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopprefinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeleteCustomerForm extends JFrame {
    private JLabel titleLabel;
    private JButton btnDelete;
    private JButton btnCancel;
    private JButton btnSearch;

    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblAddress;
    private JLabel lblSalary;
    private JLabel lblNameOrPhone;

    private JLabel lblIdResult;
    private JLabel lblNameResult;
    private JLabel lblAddressResult;
    private JLabel lblSalaryResult;
    private JTextField txtNameOrPhone;

    private Customer foundCustomer;

    DeleteCustomerForm() {
        setSize(500, 500);
        setTitle("Delete Customer Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Delete Customer Form");
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
           
            public @Override void actionPerformed(ActionEvent evt) {
                String nameOrPhone = txtNameOrPhone.getText();
                foundCustomer = CustomerController.searchCustomer(nameOrPhone);
                
                if (foundCustomer != null) {
                    lblIdResult.setText(foundCustomer.getId());
                    lblNameResult.setText(foundCustomer.getName());
                    lblAddressResult.setText(foundCustomer.getAddress());
                    lblSalaryResult.setText(String.valueOf(foundCustomer.getSalary()));
                }
            }
        });
        buttonPanel.add(btnSearch);

        btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("", Font.BOLD, 20));
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (foundCustomer != null) {
                   CustomerController.deleteCustomer(foundCustomer);
                    
                    clearFields();
                    txtNameOrPhone.setText("");
                } 
            }
        });
        buttonPanel.add(btnDelete);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", Font.BOLD, 20));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DeleteCustomerForm.this.dispose();
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

        JPanel resultPanel = new JPanel(new GridLayout(4, 1));

        lblIdResult = new JLabel();
        lblIdResult.setFont(new Font("", 1, 20));
        resultPanel.add(lblIdResult);

        lblNameResult = new JLabel();
        lblNameResult.setFont(new Font("", 1, 20));
        resultPanel.add(lblNameResult);

        lblAddressResult = new JLabel();
        lblAddressResult.setFont(new Font("",1, 20));
        resultPanel.add(lblAddressResult);

        lblSalaryResult = new JLabel();
        lblSalaryResult.setFont(new Font("", 1, 20));
        resultPanel.add(lblSalaryResult);

        add("Center", resultPanel);
    }

    
   

    private void clearFields() {
        lblIdResult.setText("");
        lblNameResult.setText("");
        lblAddressResult.setText("");
        lblSalaryResult.setText("");
    }
}
