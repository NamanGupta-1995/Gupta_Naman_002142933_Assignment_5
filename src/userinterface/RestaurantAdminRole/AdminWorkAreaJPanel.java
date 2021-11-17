

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem ecosystem;
    Restaurant restaurant;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        ArrayList<Restaurant> rlist = ecosystem.getRestaurantDirectory().getRestaurantDirectory();
         for (Restaurant res: rlist) {
             String userName = res.getEmail();
             if(userName.equals(account.getUsername())) {
                 this.restaurant = res;
                 valueLabel.setText(restaurant.getName().toUpperCase());
                 
             }
         }
      
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        btnManageMenu = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME RESTAURANT ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        userJButton.setText("Manage Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 230, -1));

        btnManageMenu.setText("Manage menu");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });
        add(btnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 230, -1));

        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 230, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userJButtonActionPerformed

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed

        ManageMenuJPanel addRestaurant = new ManageMenuJPanel(userProcessContainer, this.ecosystem, this.ecosystem.getRestaurantDirectory(), this.restaurant);

        userProcessContainer.add("WorkAreaJPanel", addRestaurant);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed

    }//GEN-LAST:event_btnManageOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
