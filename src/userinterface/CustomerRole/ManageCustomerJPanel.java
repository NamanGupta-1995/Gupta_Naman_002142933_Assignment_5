/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author namangupta
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    CustomerDirectory customerDirectory;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
    public ManageCustomerJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.customerDirectory = customerDirectory;
        this.ecosystem = ecosystem;
        initComponents();
        populateCustomerTable(this.ecosystem.getCustomerDirectory());
    }

    
    private void populateCustomerTable(CustomerDirectory customersList) {
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        model.setRowCount(0);
        if(customersList.getCustomerDirectory().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Customer Please add"
                    + "Customer", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Customer customer : customersList.getCustomerDirectory()) {
            Object[] row = new Object[5];
            row[0] = customer;
            row[1] = customer.getAddress();
            row[2] = customer.getContactNumber();
            row[3] = customer.getEmailId();
            row[4] = customer.getPassword();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        lblUpdateCustomer = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnViewCustomer = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("MANAGE CUSTOMER");

        tblCustomer.setBackground(new java.awt.Color(255, 255, 204));
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NAME", "ADDRESS", "CONTACT", "EMAIL", "PASSWORD"
            }
        ));
        jScrollPane1.setViewportView(tblCustomer);

        btnUpdateCustomer.setBackground(new java.awt.Color(255, 255, 204));
        btnUpdateCustomer.setText("Update Customer");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setBackground(new java.awt.Color(255, 255, 204));
        btnDeleteCustomer.setText("Delete Customer");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        lblUpdateCustomer.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateCustomer.setText("UPDATE CUSTOMER");

        lblName.setText("NAME:");

        lblAddress.setText("ADDRESS:");

        lblContact.setText("CONTACT:");

        lblEmail.setText("EMAIL:");

        txtName.setBackground(new java.awt.Color(255, 255, 204));

        txtAddress.setBackground(new java.awt.Color(255, 255, 204));

        txtContact.setBackground(new java.awt.Color(255, 255, 204));

        txtEmail.setBackground(new java.awt.Color(255, 255, 204));

        btnBack.setBackground(new java.awt.Color(255, 255, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewCustomer.setBackground(new java.awt.Color(255, 255, 204));
        btnViewCustomer.setText("View Customer");
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        lblPassword.setText("PASSWORD:");

        txtPassword.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(lblEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(239, 239, 239)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeleteCustomer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewCustomer))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(373, 373, 373)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtContact)
                                        .addComponent(txtAddress)
                                        .addComponent(txtEmail)
                                        .addComponent(txtName)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(lblUpdateCustomer))))))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(485, 485, 485))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdateCustomer)
                        .addGap(385, 385, 385))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeleteCustomer, btnViewCustomer});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtContact, txtEmail, txtName, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteCustomer)
                    .addComponent(btnViewCustomer))
                .addGap(8, 8, 8)
                .addComponent(lblUpdateCustomer)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateCustomer)
                .addGap(52, 52, 52))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtContact, txtEmail, txtName, txtPassword});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeleteCustomer, btnViewCustomer});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCustomer.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        Customer selectedCustomer = (Customer) model.getValueAt(selectedRowIndex, 0);
        
        customerDirectory.deleteCustomer(selectedCustomer);
        this.ecosystem.setCustomerDirectory(customerDirectory);
        ecosystem.getCustomerDirectory().deleteCustomer(selectedCustomer);
        JOptionPane.showMessageDialog(this, "Selected Customer Deleted.");
        populateCustomerTable(this.ecosystem.getCustomerDirectory());
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCustomer.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        Customer selectedCustomer = (Customer) model.getValueAt(selectedRowIndex, 0);
        
        txtName.setText(selectedCustomer.getName());
        txtAddress.setText(selectedCustomer.getAddress());
        txtContact.setText(String.valueOf(selectedCustomer.getContactNumber()));
        txtEmail.setText(selectedCustomer.getEmailId());
        txtPassword.setText(selectedCustomer.getPassword());
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblCustomer.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        Customer selectedCustomer = (Customer) model.getValueAt(selectedRowIndex, 0);
        
        customerDirectory.deleteCustomer(selectedCustomer);
        ecosystem.getCustomerDirectory().deleteCustomer(selectedCustomer);
        Customer customer = new Customer();
        customer.setName(txtName.getText());
        customer.setAddress(txtAddress.getText());
        customer.setContactNumber(Long.parseLong(txtContact.getText()));
        customer.setEmailId(txtEmail.getText());
        customer.setPassword(txtPassword.getText());
        
        customerDirectory.addCustomer(customer);
        this.ecosystem.setCustomerDirectory(customerDirectory);
        
        Employee employee = this.ecosystem.getEmployeeDirectory().createEmployee("RRH");
        this.ecosystem.getUserAccountDirectory().createUserAccount(txtEmail.getText(), txtPassword.getText(), employee, new CustomerRole());
        
        JOptionPane.showMessageDialog(this, "Customer Updated", "Update", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
        populateCustomerTable(this.ecosystem.getCustomerDirectory());
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SystemAdminWorkAreaJPanel back = new SystemAdminWorkAreaJPanel(userProcessContainer, this.ecosystem);

        userProcessContainer.add("WorkAreaJPanel", back);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public void clearFields(){
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdateCustomer;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
