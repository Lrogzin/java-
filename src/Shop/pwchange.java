package Shop;


import Filter.filter;
import java.sql.ResultSet;
import java.sql.SQLException;
import SqlConnect.DBHelper;

public class pwchange extends javax.swing.JFrame {
    public String altername;
    public String alterpw;
    public pwchange() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButton_enter);
        altername=loginFrame.loginname;
        String sql="select password from user where username='"+altername+"'";
        ResultSet rs= DBHelper.query(sql);
        while (rs.next()) {//遍历结果集
            alterpw=rs.getString("password");
            }
	DBHelper.close();//释放资源
        jTextField_user.setText(altername);   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_user = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jLabel_pw = new javax.swing.JLabel();
        jLabel_newpw = new javax.swing.JLabel();
        jLabel_newpw2 = new javax.swing.JLabel();
        jPasswordField_pw = new javax.swing.JPasswordField();
        jPasswordField_newpw = new javax.swing.JPasswordField();
        jPasswordField_newpw2 = new javax.swing.JPasswordField();
        jButton_enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("管理员信息修改");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel_user.setText("用户名：");

        jTextField_user.setToolTipText("请输入要修改的用户名");

        jLabel_pw.setText("原密码：");

        jLabel_newpw.setText("新密码：");

        jLabel_newpw2.setText("新密码：");

        jPasswordField_pw.setToolTipText("请输入修改账户原密码");

        jPasswordField_newpw.setToolTipText("请输入修改账户新密码");

        jPasswordField_newpw2.setToolTipText("请确认新密码");

        jButton_enter.setText("确认修改");
        jButton_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_newpw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_newpw))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_pw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_pw))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_newpw2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_newpw2)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_enter)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_user)
                    .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pw)
                    .addComponent(jPasswordField_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_newpw)
                    .addComponent(jPasswordField_newpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_newpw2)
                    .addComponent(jPasswordField_newpw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_enter)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enterActionPerformed
        if(alterpw.equals(jPasswordField_pw.getText())){
            if(jPasswordField_newpw.getText().equals(jPasswordField_newpw2.getText())){
                if(filter.HasInj(jPasswordField_newpw.getText())||filter.HasInj(jTextField_user.getText())){
                         javax.swing.JOptionPane.showMessageDialog(this, "输入的内容包含SQL注入敏感字符，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE );
                }else{
                    String newpw=jPasswordField_newpw.getText();
                    String user=jTextField_user.getText();
                    String sql2 = "update user set password='"+newpw+"',username='"+user+"'";
                    DBHelper.update(sql2);
                    javax.swing.JOptionPane.showMessageDialog(this, "密码修改成功", "提示",  javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    loginFrame.loginname=user;
                    mainFrame.jLabel_admin.setText(user);
                    dispose();
                }             
                
            }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "两次输入的新密码不同，请重新输入！", "提示",  javax.swing.JOptionPane.ERROR_MESSAGE);
                    jPasswordField_newpw.setText("");
                    jPasswordField_newpw2.setText("");
                    jPasswordField_newpw.requestFocus();
            }
        }else{
        javax.swing.JOptionPane.showMessageDialog(this, "原密码输入错误，请重新输入！", "提示",  javax.swing.JOptionPane.ERROR_MESSAGE);
        jPasswordField_pw.setText("");
        jPasswordField_pw.requestFocus();
        }			
    }//GEN-LAST:event_jButton_enterActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_enter;
    private javax.swing.JLabel jLabel_newpw;
    private javax.swing.JLabel jLabel_newpw2;
    private javax.swing.JLabel jLabel_pw;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JPasswordField jPasswordField_newpw;
    private javax.swing.JPasswordField jPasswordField_newpw2;
    private javax.swing.JPasswordField jPasswordField_pw;
    private javax.swing.JTextField jTextField_user;
    // End of variables declaration//GEN-END:variables
}
