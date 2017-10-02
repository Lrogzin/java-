package Goods;

import Filter.filter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import SqlConnect.DBHelper;

/**
 *
 * @author 1U02UN
 */
public class Add_g extends javax.swing.JFrame {

    public Add_g() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButton_add);
        initjComboBox_supplier();
        jComboBox_supplier.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_goods = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_kind = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_descpp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_stock = new javax.swing.JTextField();
        jButton_reset = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jComboBox_supplier = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("新增商品");
        setResizable(false);

        jLabel1.setText("商品名称：");

        jLabel2.setText("商品类型：");

        jLabel3.setText("商品单价：");

        jLabel4.setText(" 供应商：");

        jLabel5.setText("商品描述：");

        jLabel6.setText("入库数量：");

        jButton_reset.setText("重置");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jButton_add.setText("添加");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_descpp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_kind))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_goods, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_price)
                            .addComponent(jComboBox_supplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_add)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_reset)
                                .addGap(24, 24, 24))
                            .addComponent(jTextField_stock))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_goods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_kind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_descpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_reset))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // TODO add your handling code here:
        if(checkGoodsInput()){
           String goods=jTextField_goods.getText();
           String kind=jTextField_kind.getText();
           String price=jTextField_price.getText();
           String supplier=jComboBox_supplier.getSelectedItem().toString();
           String descpp=jTextField_descpp.getText();
           String stock=jTextField_stock.getText();
           String sql = "insert into goods(goods,kind,price,supplier,descpp,stock) values('"+goods+"','"+kind+"','"+price+"','"+supplier+"','"+descpp+"','"+stock+"'"+")";  
           DBHelper.update(sql);
           showMessageDialog(this, "商品添加成功！", "提示", javax.swing.JOptionPane.INFORMATION_MESSAGE);			                
           dispose();
           try {
                refresh_g.refreshGoodsTable();
                //init_g.initGoodsTable();
                init_ComboBox.initjComboBox_goods();
                //init_ComboBox.initjComboBox_supplier();
                } catch (SQLException ex) {
                    Logger.getLogger(Add_g.class.getName()).log(Level.SEVERE, null, ex);
                }        
        }              
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        // TODO add your handling code here:
        jTextField_goods.setText("");
        jTextField_kind.setText("");
        jTextField_price.setText("");
        jComboBox_supplier.setSelectedIndex(-1);
        jTextField_descpp.setText("");
        jTextField_stock.setText("");        
    }//GEN-LAST:event_jButton_resetActionPerformed
    
    public boolean checkGoodsInput(){
        if(jTextField_goods.getText().isEmpty()){
           showMessageDialog(this, "商品名称不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_goods.requestFocus();
        }else if(jTextField_kind.getText().isEmpty()){
           showMessageDialog(this, "商品类型不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_kind.requestFocus();
        }else if(jTextField_price.getText().isEmpty()){
           showMessageDialog(this, "商品单价不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_price.requestFocus();
        }else if(jComboBox_supplier.getSelectedIndex()==-1){
           showMessageDialog(this, "供应商不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jComboBox_supplier.requestFocus();
        }else if(jTextField_descpp.getText().isEmpty()){
           showMessageDialog(this, "商品描述不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_descpp.requestFocus();
        }else if(jTextField_stock.getText().isEmpty()){
           showMessageDialog(this, "库存不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
           jTextField_stock.requestFocus();
        }else if(filter.HasInj(jTextField_goods.getText())){
               showMessageDialog(this, "商品名称包含SQL注入敏感字符，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);
               jTextField_goods.requestFocus();
        }else if(filter.HasInj(jTextField_kind.getText())){
               showMessageDialog(this, "商品类型包含SQL注入敏感字符，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);          
               jTextField_kind.requestFocus();
        }else if(!filter.isPrice(jTextField_price.getText())){
               showMessageDialog(this, "商品价格格式输入错误！商品价格格式为最多两位小数！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);           
               jTextField_price.requestFocus();
        }else if(filter.HasInj(jTextField_descpp.getText())){
               showMessageDialog(this, "商品描述包含SQL注入敏感字符，请重新输入！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);            
               jTextField_descpp.requestFocus();
        }else if(!filter.isInt(jTextField_stock.getText())){
               showMessageDialog(this, "商品入库数量输入错误！请输入正整数！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);            
               jTextField_stock.requestFocus();
        }else{
            return true;
            }
        return false;
    }

    public static void initjComboBox_supplier() throws SQLException{
        
        Vector<String> items = new Vector<String>();
        String sql="select name from supplier";
        ResultSet rs= DBHelper.query(sql);
        while(rs.next()){
        System.out.println(rs.getString(1));
        if(!items.contains(rs.getString(1))){
            items.add(rs.getString(1));
            }            
        } 
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
        jComboBox_supplier.setModel(md);
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_reset;
    public static javax.swing.JComboBox<String> jComboBox_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_descpp;
    private javax.swing.JTextField jTextField_goods;
    private javax.swing.JTextField jTextField_kind;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_stock;
    // End of variables declaration//GEN-END:variables
}
