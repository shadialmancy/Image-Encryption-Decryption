package image.protection;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewJFrame extends javax.swing.JFrame {

   
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jLabel1.setText("Password:");

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });

        jLabel2.setText("Confirm Passowrd:");

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Password Checked");

        jLabel4.setText("Password doesn't match");

        jButton3.setText("Encrypt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Please fill the Field Text");

        jLabel7.setText("File Name:");

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField2)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);

        jTabbedPane1.addTab("Encrypt", jPanel1);

        jButton4.setText("Choose");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Decrypt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyTyped(evt);
            }
        });

        jLabel6.setText("Password:");

        jButton6.setText("Check");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setText("File Name:");

        jCheckBox1.setText("Delete Encrypted image file");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel8))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Decrypt", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        jTextField1.setText(f.getAbsolutePath());
        jTextField2.setText(chooser.getName(f));
        
        jPasswordField1.setText("");
        jPasswordField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         JFrame frame;
        frame=new JFrame();
        
        if (jPasswordField1.getText().equals(jPasswordField2.getText())){
            if(jPasswordField1.getText().equals("")&&jPasswordField2.getText().equals("")){
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(true);
            }else if(!(jPasswordField1.getText().length()==6)){
            JOptionPane.showMessageDialog(frame,"The password must be 6 digits only.");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            }else{
            jLabel3.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            }
        } else {
        jLabel4.setVisible(true);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        if (!jPasswordField1.getText().equals(jPasswordField2.getText()))
            JOptionPane.showMessageDialog(null,"Please check the password.");
        else if(jTextField1.getText().equals(""))
            JOptionPane.showMessageDialog(null,"The Text bar is empty. Please choose the file.");
        else if(jPasswordField1.getText().equals("")||jPasswordField2.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please write the password.");
        else{
        try{
            /*FileWriter writer=new FileWriter("Encrypted "+jTextField2.getText()+".txt");
            writer.write(jPasswordField1.getText());
            writer.close();*/
            
            //URL STRING
            //please note: change the url,user and pass to ur sql server.
            //user and pass are for SQL Authentication.
            //what you need to change in the url is "DESKTOP-Q72593E" to your server name , "MSSQLSERVER" to your instance name, "Image Protection" to your database name.
            
            
            String url="jdbc:sqlserver://DESKTOP-Q72593E\\MSSQLSERVER;databaseName=Image Protection";
            String user="sa";
            String pass="abc123";
            FileInputStream file = new FileInputStream(jTextField1.getText());
            FileOutputStream outStream = new FileOutputStream("Encrypted "+jTextField2.getText());
            byte k[]="CooL2116NiTh5252".getBytes();
            SecretKeySpec key = new SecretKeySpec(k, "AES");
            Cipher enc = Cipher.getInstance("AES");
            
            enc.init(Cipher.ENCRYPT_MODE, key);
            CipherOutputStream cos = new CipherOutputStream(outStream, enc);
            byte[] buf = new byte[1024];
            int read;
            while((read=file.read(buf))!=-1){
                cos.write(buf,0,read);
            }
            
            file.close();
            outStream.flush();
            cos.close();
            
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stat=conn.createStatement();
            stat.executeUpdate("INSERT INTO encrypt VALUES ('Encrypted "+jTextField2.getText()+"','"+jPasswordField1.getText()+"')");
            JOptionPane.showMessageDialog(null, "The file encrypted Successfully");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"An error occurred.","Alert",JOptionPane.WARNING_MESSAGE);
        }
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        char c=evt.getKeyChar();
        Toolkit t = Toolkit.getDefaultToolkit();
        if(!(Character.isDigit(c)) && !(c==KeyEvent.VK_BACK_SPACE)){
        t.beep();
        evt.consume();  
        }
         if (jPasswordField1.getText().length() > 5) {
                String s = jPasswordField1.getText().substring(0, 5);
                jPasswordField1.setText(s);
        }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        char c=evt.getKeyChar();
        Toolkit t = Toolkit.getDefaultToolkit();
        if(!(Character.isDigit(c)) && !(c==KeyEvent.VK_BACK_SPACE)){
        t.beep();
        evt.consume();  
        }
         if (jPasswordField2.getText().length() > 5) {
                String s = jPasswordField2.getText().substring(0, 5);
                jPasswordField2.setText(s);
        }
    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        jTextField3.setText(f.getAbsolutePath());
        jTextField2.setText(chooser.getName(f));
        jPasswordField3.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPasswordField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyTyped
          char c=evt.getKeyChar();
        Toolkit t = Toolkit.getDefaultToolkit();
        if(!(Character.isDigit(c)) && !(c==KeyEvent.VK_BACK_SPACE)){
        t.beep();
        evt.consume();  
        }
        if (jPasswordField3.getText().length() > 5) {
                String s = jPasswordField3.getText().substring(0, 5);
                jPasswordField3.setText(s);
        }
    }//GEN-LAST:event_jPasswordField3KeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   
        try {
      if(jTextField3.getText().equals(""))
      JOptionPane.showMessageDialog(null,"Choose a image to Decrypt.");
      else{
          //URL STRING
            //please note: change the url,user and pass to ur sql server.
            //user and pass are for SQL Authentication.
            //what you need to change in the url is "DESKTOP-Q72593E" to your server name , "MSSQLSERVER" to your instance name, "Image Protection" to your database name.
        String url="jdbc:sqlserver://DESKTOP-Q72593E\\MSSQLSERVER;databaseName=Image Protection";
        String user="sa";
        String pass="abc123";
        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement stat=conn.createStatement();
        ResultSet rs=stat.executeQuery("SELECT imagePassword FROM encrypt WHERE imagePassword='"+jPasswordField3.getText()+"' AND imageName='"+jTextField2.getText()+"'");
        
              if (rs.next())
                  JOptionPane.showMessageDialog(null, "Correct Password.");
                  else
                  JOptionPane.showMessageDialog(null,"Incorrect Password.","Alert",JOptionPane.WARNING_MESSAGE);  
           
          } 
            } catch (SQLException ex) {
              Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);     
            }
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      try {
      if(jTextField3.getText().equals(""))
      JOptionPane.showMessageDialog(null,"Choose a image to Decrypt.");
      else if(jPasswordField3.getText().equals(""))
      JOptionPane.showMessageDialog(null,"Please write the passowrd.");   
      else{
          /* File f2= new File(jTextField3.getText());
          File f1 = new File(jTextField3.getText()+".txt");
          Scanner sc = new Scanner(f1);
          String data=sc.nextLine();*/
        String url="jdbc:sqlserver://DESKTOP-Q72593E\\MSSQLSERVER;databaseName=Image Protection";
        String user="sa";
        String pass="almancy190";
        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement stat=conn.createStatement();
        ResultSet rs=stat.executeQuery("SELECT imagePassword FROM encrypt WHERE imagePassword='"+jPasswordField3.getText()+"' AND imageName='"+jTextField2.getText()+"'");
        
       if (rs.next()){
       try{
           FileOutputStream outStream;
           CipherOutputStream cos;
           try (FileInputStream file = new FileInputStream(jTextField3.getText())) {
               outStream = new FileOutputStream("Decrypt.jpg");
               byte k[]="CooL2116NiTh5252".getBytes();
               SecretKeySpec key = new SecretKeySpec(k, "AES");
               Cipher enc = Cipher.getInstance("AES");
               enc.init(Cipher.DECRYPT_MODE, key);
               cos = new CipherOutputStream(outStream, enc);
               byte[] buf = new byte[1024];
               int read;
               
               while((read=file.read(buf))!=-1)
                   cos.write(buf,0,read);
               
           }
           
            outStream.flush();
            cos.close();
            JOptionPane.showMessageDialog(null, "The image was decrypted successfully");
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"Decrypt.jpg");
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error occurred.");
        }
       stat.executeUpdate("DELETE FROM encrypt WHERE imagePassword='"+jPasswordField3.getText()+"' AND imageName='"+jTextField2.getText()+"'");
       
      } else
           
           JOptionPane.showMessageDialog(null,"Error occurred \n Check if your password is correct or you have chosen the UNENCRYPTED file.","Alert",JOptionPane.WARNING_MESSAGE); 
       
        
            }   
    } catch (SQLException ex) {      
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }   
      File f1= new File(jTextField2.getText());
      if(jCheckBox1.isEnabled()==true)
          f1.delete();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed

    }//GEN-LAST:event_jPasswordField3KeyPressed

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}