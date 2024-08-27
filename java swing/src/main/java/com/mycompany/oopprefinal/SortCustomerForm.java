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
public class SortCustomerForm extends JFrame{
    
    private SortingbyNameForm sortingbyNameForm;
    private JLabel titleLabel;
    private JButton btnSortName;
    private JButton btnCancel;
    private JButton btnsortsalary;
    
             
    private Customer foundCustomer;

    SortCustomerForm() {
        setSize(500, 500);
        setTitle("Sorting Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Sorting Form");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("", Font.BOLD, 30));
        add("North", titleLabel);

        
       
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSortName = new JButton("Sort Name");
        btnSortName.setFont(new Font("", Font.BOLD, 20));
        btnSortName.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent evt) {
               if(sortingbyNameForm==null){
		sortingbyNameForm=new SortingbyNameForm();
				}
				sortingbyNameForm.setVisible(true);
			}
		
            }
        );
        buttonPanel.add(btnSortName);

 btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", Font.BOLD, 20));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SortCustomerForm.this.dispose();
            }
        });
        buttonPanel.add(btnCancel);
        add("South", buttonPanel);


    }    
}
