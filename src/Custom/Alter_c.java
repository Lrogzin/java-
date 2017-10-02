package Custom;

import Filter.filter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import static Shop.mainFrame.jTable_Custom;
import SqlConnect.DBHelper;

/**
 *
 * @author 1U02UN
 */
public class Alter_c extends javax.swing.JFrame {

    public Alter_c() {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButton_alter);
        getCustomInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField(10);
        jTextField_phone = new javax.swing.JTextField(20);
        jTextField_mail = new javax.swing.JTextField(20);
        jTextField_address = new javax.swing.JTextField(50);
        jButton_alter = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("客户信息修改");
        setResizable(false);

        jLabel1.setText("客户姓名：");

        jLabel2.setText("电话号码：");

        jLabel3.setText("邮箱地址：");

        jLabel4.setText("地址信息：");

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });

        jButton_alter.setText("修改");
        jButton_alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterActionPerformed(evt);
            }
        });

        jButton_reset.setText("重置");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_alter)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_reset)
                                .addGap(23, 23, 23))
                            .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_alter)
                    .addComponent(jButton_reset))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jButton_alterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterActionPerformed
        // TODO add your handling code here:
        if(checkCustomInput()){
            String name=jTextField_name.getText();
            String phone=jTextField_phone.getText();
            String mail=jTextField_mail.getText();
            String address=jTextField_address.getText();
            String id=jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),0).toString();
            String sql = "update custom set name='"+name+"',phone='"+phone+"',email='"+mail+"',address='"+address+"' where id="+id;
            DBHelper.update(sql);
            javax.swing.JOptionPane.showMessageDialog(this, "客户信息修改成功！", "提示", javax.swing.JOptionPane.INFORMATION_MESSAGE);			                
            dispose();    
            try {
                    init_c.initCustomTable();
                } catch (SQLException ex) {
                    Logger.getLogger(Alter_c.class.getName()).log(Level.SEVERE, null, ex);
                }        
        }       
    }//GEN-LAST:event_jButton_alterActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        // TODO add your handling code here:
        jTextField_name.setText("");
        jTextField_phone.setText("");
        jTextField_mail.setText("");
        jTextField_address.setText("");
        jTextField_name.requestFocus();
    }//GEN-LAST:event_jButton_resetActionPerformed

    //对输入内容进行检查，检查通过则返回为真
    public boolean checkCustomInput(){
        if(jTextField_name.getText().isEmpty()){
           showMessageDialog(this, "客户姓名不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_name.requestFocus();
        }else if(jTextField_phone.getText().isEmpty()){
           showMessageDialog(this, "客户电话不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_phone.requestFocus();
        }else if(jTextField_mail.getText().isEmpty()){
           showMessageDialog(this, "邮箱地址不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_mail.requestFocus();
        }else if(jTextField_address.getText().isEmpty()){
           showMessageDialog(this, "地址信息不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_address.requestFocus();
        }else if(filter.HasInj(jTextField_name.getText())){
               showMessageDialog(this, "客户姓名包含SQL注入敏感字符，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
               jTextField_name.requestFocus();
        }else if(!filter.isPhone(jTextField_phone.getText())){
               showMessageDialog(this, "客户电话格式输入错误，请输入3-11位数字！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);          
               jTextField_phone.requestFocus();
        }else if(!filter.isEmail(jTextField_mail.getText())){
               showMessageDialog(this, "邮箱地址格式输入错误，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);           
               jTextField_mail.requestFocus();
        }else if(filter.HasInj(jTextField_address.getText())){
               showMessageDialog(this, "地址信息包含SQL注入敏感字符，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);           
               jTextField_address.requestFocus();
        }else{
            return true;
            }
        return false;
    }    
    
    //获取要修改的客户信息装载进文本框
    public void getCustomInfo(){
        String name=jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),1).toString();
        String phone=jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),2).toString();
        String mail=jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),3).toString();
        String address=jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),4).toString();
        jTextField_name.setText(name);
        jTextField_phone.setText(phone);
        jTextField_mail.setText(mail);
        jTextField_address.setText(address);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_alter;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}
