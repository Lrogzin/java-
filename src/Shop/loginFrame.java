package Shop;


import java.awt.Image;
import java.io.IOException;
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import SqlConnect.DBHelper;

public class loginFrame extends javax.swing.JFrame {
    static String loginname;
    public String loginpw;
    
    public loginFrame() throws SQLException {     
        initComponents();       
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButton_submit);
        setIco();
	String sql="select * from user";
	ResultSet rs= DBHelper.query(sql);
	while (rs.next()) {//遍历结果集
	loginname=rs.getString("username");
        loginpw=rs.getString("password");
	}
	DBHelper.close();//释放资源
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jButton_submit = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jPasswordField_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("欢迎登录网上商城管理系统");
        setResizable(false);

        jLabel_username.setText("用户名：");

        jLabel_password.setText("密  码：");

        jButton_submit.setText("提交");
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
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
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_password)
                    .addComponent(jLabel_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_username)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_password)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_submit)
                    .addComponent(jButton_reset))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submitActionPerformed
        if(jTextField_username.getText().isEmpty()){
		javax.swing.JOptionPane.showMessageDialog(null, "用户名不能为空，请输入用户名！", "登录失败", javax.swing.JOptionPane.ERROR_MESSAGE);			        
                jTextField_username.requestFocus();
        }else if(jPasswordField_password.getText().isEmpty()){
		javax.swing.JOptionPane.showMessageDialog(null, "密码不能为空，请输入密码！", "登录失败", javax.swing.JOptionPane.ERROR_MESSAGE);			        
                jPasswordField_password.requestFocus();
        }else if(loginname.equals(jTextField_username.getText())&&loginpw.equals(jPasswordField_password.getText())){
                 this.dispose();
                try {
                    new mainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(loginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else {
		javax.swing.JOptionPane.showMessageDialog(null, "用户名或密码错误，请重新输入！", "登录失败", javax.swing.JOptionPane.ERROR_MESSAGE);			
		jTextField_username.setText("");
                jPasswordField_password.setText("");
                jTextField_username.requestFocus();
		 }

    }//GEN-LAST:event_jButton_submitActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        jTextField_username.setText("");
	jPasswordField_password.setText("");
    }//GEN-LAST:event_jButton_resetActionPerformed
    
    private void setIco(){
    //设置程序图标
        try {
            String src = "/image/shop.png";     //图片路径
            Image image=ImageIO.read(this.getClass().getResource(src));
            this.setIconImage(image);          //设置图标
            } catch (IOException e) {
                    e.printStackTrace();
            }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_reset;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
