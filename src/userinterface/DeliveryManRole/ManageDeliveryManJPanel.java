/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.DeliverManRole;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author namangupta
 */
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManJPanel
     */
    
    DeliveryManDirectory deliveryManDirectory;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
    public ManageDeliveryManJPanel(JPanel userProcessContainer, EcoSystem ecosystem, DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        initComponents();
        populateDeliveryManTable(this.deliveryManDirectory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void populateDeliveryManTable(DeliveryManDirectory deliveryManList) {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        model.setRowCount(0);
        if(deliveryManList.getDeliveryManDirectory().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Customer Please add"
                    + "Customer", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (DeliveryMan deliveryMan : deliveryManList.getDeliveryManDirectory()) {
            Object[] row = new Object[5];
            row[0] = deliveryMan;
            row[1] = deliveryMan.getVehicleNumber();
            row[2] = deliveryMan.getContactNumber();
            row[3] = deliveryMan.getEmail();
            row[4] = deliveryMan.getPassword();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        btnUpdateDeliveryMan = new javax.swing.JButton();
        btnDeleteDeliveryMan = new javax.swing.JButton();
        lblUpdateDeliveryMan = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblVehicleNumber = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtVehicleNum = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnViewDeliveryMan = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("MANAGE DELIVERY MAN");

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NAME", "VEHICLE NUMBER", "CONTACT", "EMAIL", "PASSWORD"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryMan);

        btnUpdateDeliveryMan.setText("Update Delivery Man");
        btnUpdateDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeliveryManActionPerformed(evt);
            }
        });

        btnDeleteDeliveryMan.setText("Delete Delivery Man");
        btnDeleteDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDeliveryManActionPerformed(evt);
            }
        });

        lblUpdateDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateDeliveryMan.setText("UPDATE CUSTOMER");

        lblName.setText("NAME:");

        lblVehicleNumber.setText("VEHICLE NUMBER:");

        lblContact.setText("CONTACT:");

        lblEmail.setText("EMAIL:");

        txtName.setText("jTextField1");

        txtVehicleNum.setText("jTextField2");

        txtContact.setText("jTextField3");

        txtEmail.setText("jTextField4");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewDeliveryMan.setText("View Delivery Man");
        btnViewDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDeliveryManActionPerformed(evt);
            }
        });

        lblPassword.setText("PASSWORD:");

        txtPassword.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(239, 239, 239)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeleteDeliveryMan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewDeliveryMan))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(30, 30, 30)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblPassword)
                                    .addComponent(lblContact)
                                    .addComponent(lblVehicleNumber))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblUpdateDeliveryMan)
                            .addComponent(btnUpdateDeliveryMan))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
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
                    .addComponent(btnDeleteDeliveryMan)
                    .addComponent(btnViewDeliveryMan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUpdateDeliveryMan)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleNumber)
                    .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDeliveryMan)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeliveryManActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblDeliveryMan.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        DeliveryMan selectedDeliveryMan = (DeliveryMan) model.getValueAt(selectedRowIndex, 0);

        deliveryManDirectory.deleteDeliveryMan(selectedDeliveryMan);
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(txtName.getText());
        deliveryMan.setVehicleNumber(txtVehicleNum.getText());
        deliveryMan.setContactNumber(Long.parseLong(txtContact.getText()));
        deliveryMan.setEmail(txtEmail.getText());
        deliveryMan.setPassword(txtPassword.getText());

        deliveryManDirectory.addDeliveryMan(deliveryMan);
        this.ecosystem.setDeliveryManDirectory(deliveryManDirectory);

        Employee employee = this.ecosystem.getEmployeeDirectory().createEmployee("RRH");
        this.ecosystem.getUserAccountDirectory().createUserAccount(txtEmail.getText(), txtPassword.getText(), employee, new DeliverManRole());

        JOptionPane.showMessageDialog(this, "Customer Updated", "Update", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
        populateDeliveryManTable(this.ecosystem.getDeliveryManDirectory());
    }//GEN-LAST:event_btnUpdateDeliveryManActionPerformed

    
    public void clearFields(){
        txtName.setText("");
        txtVehicleNum.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }
        
    private void btnDeleteDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDeliveryManActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryMan.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        DeliveryMan selectedDeliveryMan = (DeliveryMan) model.getValueAt(selectedRowIndex, 0);

        deliveryManDirectory.deleteDeliveryMan(selectedDeliveryMan);
        this.ecosystem.setDeliveryManDirectory(deliveryManDirectory);
        JOptionPane.showMessageDialog(this, "Selected Customer Deleted.");
        populateDeliveryManTable(this.ecosystem.getDeliveryManDirectory());
    }//GEN-LAST:event_btnDeleteDeliveryManActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SystemAdminWorkAreaJPanel back = new SystemAdminWorkAreaJPanel(userProcessContainer, this.ecosystem);

        userProcessContainer.add("WorkAreaJPanel", back);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDeliveryManActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryMan.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        DeliveryMan selectedDeliveryMan = (DeliveryMan) model.getValueAt(selectedRowIndex, 0);

        txtName.setText(selectedDeliveryMan.getName());
        txtVehicleNum.setText(selectedDeliveryMan.getVehicleNumber());
        txtContact.setText(String.valueOf(selectedDeliveryMan.getContactNumber()));
        txtEmail.setText(selectedDeliveryMan.getEmail());
        txtPassword.setText(selectedDeliveryMan.getPassword());
    }//GEN-LAST:event_btnViewDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDeliveryMan;
    private javax.swing.JButton btnUpdateDeliveryMan;
    private javax.swing.JButton btnViewDeliveryMan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdateDeliveryMan;
    private javax.swing.JLabel lblVehicleNumber;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtVehicleNum;
    // End of variables declaration//GEN-END:variables
}