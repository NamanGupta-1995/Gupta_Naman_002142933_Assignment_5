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
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author namangupta
 */
public class AddCustomerJPanel extends javax.swing.JPanel {

    /** Creates new form AddCustomerJPanel */
    
    EcoSystem ecosystem;
    CustomerDirectory customerDirectory;
    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public AddCustomerJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, CustomerDirectory customerDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.customerDirectory = customerDirectory;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddCustomer = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCustomerAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblCustomerContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblCustomerEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        lblNameError = new javax.swing.JLabel();
        lblAddressError = new javax.swing.JLabel();
        lblContactError = new javax.swing.JLabel();
        lblEmailError = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        lblAddCustomer.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAddCustomer.setText("ADD CUSTOMER");

        lblCustomerName.setText("NAME:");

        txtName.setBackground(new java.awt.Color(255, 255, 204));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        lblCustomerAddress.setText("ADDRESS:");

        txtAddress.setBackground(new java.awt.Color(255, 255, 204));

        lblCustomerContact.setText("CONTACT NUMBER:");

        txtContact.setBackground(new java.awt.Color(255, 255, 204));
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });

        lblCustomerEmail.setText("EMAIL ID:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnAddCustomer.setBackground(new java.awt.Color(255, 255, 204));
        btnAddCustomer.setText("ADD");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        txtPassword.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCustomerName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCustomerAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCustomerContact, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCustomerEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(txtContact)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNameError)
                    .addComponent(lblAddressError)
                    .addComponent(lblContactError)
                    .addComponent(lblEmailError))
                .addGap(100, 100, 100))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtContact, txtEmail, txtName, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameError))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressError))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactError))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailError))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddCustomer)
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtContact, txtEmail, txtName, txtPassword});

    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        // TODO add your handling code here:
        if(checkFormValidity()){
        
        Employee employee = this.ecosystem.getEmployeeDirectory().createEmployee(txtName.getText());
        
        Customer customer = new Customer();
        customer.setName(txtName.getText());
        customer.setAddress(txtAddress.getText());
        customer.setContactNumber(Long.parseLong(txtContact.getText()));
        customer.setEmailId(txtEmail.getText());
        customer.setPassword(txtPassword.getText());
        

        this.userAccount = this.ecosystem.getUserAccountDirectory().createUserAccount(txtEmail.getText(), txtPassword.getText(), employee, new CustomerRole());
        customer.setUserAccount(userAccount);
        customerDirectory.addCustomer(customer);
        
        this.ecosystem.setCustomerDirectory(customerDirectory);
        JOptionPane.showMessageDialog(this, "Customer Added", "Update", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please resolve all errors and fill all the fields", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
                
        SystemAdminWorkAreaJPanel back = new SystemAdminWorkAreaJPanel(userProcessContainer, this.ecosystem);

        userProcessContainer.add("WorkAreaJPanel", back);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        Pattern patt=Pattern.compile("^[0-9]{10}{12}$");
        Matcher match=patt.matcher(txtContact.getText());
        if (!match.matches()) {
            lblContactError.setText("Number should be 10 digits");
        }else{
            lblContactError.setText("");
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        Pattern patt=Pattern.compile("^[a-zA-Z ]{0,40}$");
        Matcher match=patt.matcher(txtName.getText());
        if (!match.matches()) {
            lblNameError.setText("You can only use alphabets(a-z) and maximum length is 40");
        }else{
            lblNameError.setText("");
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private Boolean checkFormValidity(){
        if(txtAddress.getText().length() != 0 && txtContact.getText().length() != 0 && txtEmail.getText().length() != 0 
                && txtName.getText().length() != 0 && txtPassword.getText().length() != 0 && lblNameError.getText().length() == 0
                && lblContactError.getText().length() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void clearFields(){
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddCustomer;
    private javax.swing.JLabel lblAddressError;
    private javax.swing.JLabel lblContactError;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerContact;
    private javax.swing.JLabel lblCustomerEmail;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

}
