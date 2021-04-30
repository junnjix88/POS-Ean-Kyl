
package kylpos;

import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cecilio
 */
public class surveylogin2 extends javax.swing.JFrame {
java.sql.Connection conn = null;
ResultSet rs = null;
Statement st;
int curRow = 0;
PreparedStatement pst=null;
public static String stid = null;
public static String usrname = null;
public static String pass_word = null;
public String userid12 = null;
private JFrame frame;

    public surveylogin2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jbtnLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("By: Cecilio D M Jr.");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exam login");
        setBackground(new java.awt.Color(170, 40, 58));
        setSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username6.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordicon7.png"))); // NOI18N

        jbtnLogin.setText("Login");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jbtnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnLoginKeyPressed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtPassword)
                    .addComponent(jtxtUsername))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jbtnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jButton3.setText("Main");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1842, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bakall2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        surveylogin2.this.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jtxtUsername.setText(null);
        jtxtPassword.setText(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed

        String username = jtxtUsername.getText();
        String password = jtxtPassword.getText();
        usrname = username;
        pass_word = password;
        try {
            int log = 1;
            conn = DriverManager.getConnection("jdbc:mariadb://YourDB_IP/Ceciliodb","Cecilio","YourPassword");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from SURVEYUSER where USERNAME ='"+usrname+"' && PASSWORD='"+pass_word+"'");
            
            
            while (rs.next())
            {
                if (rs.getString(4).equals("@dmin2!4ever"))
                {
                    log = 0;
                    break;                                     
                }
             
            }
            if(log==0)
            {

                CloseMe();
                
   
        Date d = new Date();
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
        jLabel3.setText(b.format(d)); 
        
        Date c = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
        jLabel4.setText(f.format(c));
        rs.close(); st.close(); conn.close();
            }
           
            else
        try{
            conn = DriverManager.getConnection("jdbc:mariadb://YourDB_IP/Ceciliodb","Cecilio","YourPassword");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from SURVEYUSER where USERNAME ='"+usrname+"' && PASSWORD='"+pass_word+"'");
            
            while (rs.next())
            {
                           
           if (rs.getString(4).equals("Student"))
                {

                    log = 2;
                    break;
                }
            }

            if(log==2)
            {
                stid = rs.getString(1);
                FeesSystem window3 = new FeesSystem();
                FeesSystem.jlblCashier.setText(stid);
                window3.setVisible(true);
                CloseMe();

                
        Date d = new Date();
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
        jLabel3.setText(b.format(d)); 
        
        Date c = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
        jLabel4.setText(f.format(c));
        rs.close(); st.close(); conn.close();

            }
                       
           else
        try{
            conn = DriverManager.getConnection("jdbc:mariadb://YourDB_IP","Cecilio","YourPassword");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from SURVEYUSER where USERNAME ='"+usrname+"' && PASSWORD='"+pass_word+"'");
            
            while (rs.next())
            {
                           
            if (rs.getString(4).equals("teacher"))
                {
                    log = 3;
                    break;
                }
            }

            if(log==3)
            {

//                new teacherpage().setVisible(true);
                CloseMe();
                
        Date d = new Date();
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
        jLabel3.setText(b.format(d)); 
        
        Date c = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
        jLabel4.setText(f.format(c));
        rs.close(); st.close(); conn.close();
            }
                       
            
            else
            JOptionPane.showMessageDialog(null,"Connection failed","Login System",JOptionPane.ERROR_MESSAGE);
            jtxtPassword.setText("");
            jtxtUsername.grabFocus();   
        
        }
        
        catch (SQLException ex){
            Logger.getLogger(surveylogin2 .class.getName()).log(Level.SEVERE,null,ex);
        }
            
               
        
        }
        
        catch (SQLException ex){
            Logger.getLogger(surveylogin2 .class.getName()).log(Level.SEVERE,null,ex);
        }
            
                   
            rs.close(); st.close(); conn.close();
        }

        catch (SQLException ex){
            Logger.getLogger(surveylogin2 .class.getName()).log(Level.SEVERE,null,ex);
        }
        

    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnLoginKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
         
        String username = jtxtUsername.getText();
        String password = jtxtPassword.getText();
        usrname = username;
        pass_word = password;
        try {
            int log = 1;
            conn = DriverManager.getConnection("jdbc:mariadb://YourDB_IP/Ceciliodb","Cecilio","YourPassword");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from SURVEYUSER");
            
            
            while (rs.next())
            {
                if (rs.getString(2).equals(username)&& rs.getString(3).equals(password)&& rs.getString(4).equals("@dmin2!4ever"))
                {
                    log = 0;
                    break;                                     
                }
             
            }
            if(log==0)
            {
                CloseMe();
                
   
        Date d = new Date();
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
        jLabel3.setText(b.format(d)); 
        
        Date c = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
        jLabel4.setText(f.format(c));
        rs.close(); st.close(); conn.close();
            }
           
            else
        try{
            conn = DriverManager.getConnection("jdbc:mariadb://YourDB_IP/Ceciliodb","Cecilio","YourPassword");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from SURVEYUSER");
            
            while (rs.next())
            {
                           
            if (rs.getString(2).equals(username)&& rs.getString(3).equals(password)&& rs.getString(4).equals("Student"))
                {
                    log = 2;
                    break;
                }
            }

            if(log==2)
            {

                stid = rs.getString(1);

                CloseMe();
                
        Date d = new Date();
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
        jLabel3.setText(b.format(d)); 
        
        Date c = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
        jLabel4.setText(f.format(c));
        rs.close(); st.close(); conn.close();

            }
                       
           else
        try{
            conn = DriverManager.getConnection("jdbc:mariadb://YourDB_IP/Ceciliodb","Cecilio","YourPassword");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from SURVEYUSER");
            
            while (rs.next())
            {
                           
            if (rs.getString(2).equals(username)&& rs.getString(3).equals(password)&& rs.getString(4).equals("teacher"))
                {
                    log = 3;
                    break;
                }
            }

            if(log==3)
            {

                CloseMe();
                
        Date d = new Date();
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
        jLabel3.setText(b.format(d)); 
        
        Date c = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
        jLabel4.setText(f.format(c));
        rs.close(); st.close(); conn.close();
            }
                       
            
            else
            JOptionPane.showMessageDialog(null,"Connection failed","Login System",JOptionPane.ERROR_MESSAGE);
            jtxtUsername.grabFocus();   
        
        }
        
        catch (SQLException ex){
            Logger.getLogger(surveylogin2 .class.getName()).log(Level.SEVERE,null,ex);
        }
            
               
        
        }
        
        catch (SQLException ex){
            Logger.getLogger(surveylogin2 .class.getName()).log(Level.SEVERE,null,ex);
        }
            
                   
            rs.close(); st.close(); conn.close();
        }

        catch (SQLException ex){
            Logger.getLogger(surveylogin2 .class.getName()).log(Level.SEVERE,null,ex);
        }
        
         
         }
    }//GEN-LAST:event_jbtnLoginKeyPressed

    private void CloseMe()
    {
        WindowEvent meClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(surveylogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(surveylogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(surveylogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(surveylogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new surveylogin2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables




}
