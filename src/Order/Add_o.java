package Order;

import Goods.init_g;
import java.awt.event.ItemEvent;
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
public class Add_o extends javax.swing.JFrame {
    String stock="";
    public Add_o() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButton_add);
        initjComboBox_oname();
        //initjComboBox_ogoods();
        //initjComboBox_osupplier();
//        initjComboBox_onum();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_add = new javax.swing.JButton();
        jComboBox_oname = new javax.swing.JComboBox<>();
        jComboBox_ogoods = new javax.swing.JComboBox<>();
        jComboBox_osupplier = new javax.swing.JComboBox<>();
        jComboBox_onum = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ocount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_oprice = new javax.swing.JTextField();
        jRadioButton_by = new javax.swing.JRadioButton();
        jRadioButton_all = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("新增订单");
        setResizable(false);

        jLabel1.setText("客户姓名：");

        jLabel2.setText("商品名称：");

        jLabel3.setText("供应厂商：");

        jLabel4.setText("购买数量：");

        jButton_add.setText("添加订单");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jComboBox_ogoods.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_ogoodsItemStateChanged(evt);
            }
        });

        jComboBox_osupplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_osupplierItemStateChanged(evt);
            }
        });

        jComboBox_onum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_onumItemStateChanged(evt);
            }
        });

        jLabel5.setText("订单总价：");

        jTextField_ocount.setText("0");
        jTextField_ocount.setEnabled(false);

        jLabel6.setText("商品单价：");

        jTextField_oprice.setText("0");
        jTextField_oprice.setEnabled(false);

        jRadioButtonGroup.add(jRadioButton_by);
        jRadioButton_by.setText("根据供应商选择商品");
        jRadioButton_by.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_byItemStateChanged(evt);
            }
        });

        jRadioButtonGroup.add(jRadioButton_all);
        jRadioButton_all.setText("选择所有商品");
        jRadioButton_all.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_allItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_all)
                                .addGap(5, 5, 5)
                                .addComponent(jRadioButton_by))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_oprice))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_onum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_osupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_ogoods, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_ocount))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_oname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_by)
                    .addComponent(jRadioButton_all))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_oname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_ogoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_osupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_onum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_oprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ocount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton_add)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //添加订单按钮被点击后响应事件
    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        if(jComboBox_oname.getSelectedIndex()==-1){
           showMessageDialog(this, "请选择下单客户！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);           
        }else if(jComboBox_ogoods.getSelectedIndex()==-1){
           showMessageDialog(this, "商品不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);                   
        }else if(jComboBox_osupplier.getSelectedIndex()==-1){
           showMessageDialog(this, "供应商不能为空！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);                   
        }else if(jComboBox_onum.getSelectedIndex()==-1||jComboBox_onum.getSelectedIndex()==0){
           showMessageDialog(this, "购买数量应大于0！", "警告",  javax.swing.JOptionPane.WARNING_MESSAGE);                   
        }else{
            try {
                addOrder();
            } catch (SQLException ex) {
                Logger.getLogger(Add_o.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   
    }//GEN-LAST:event_jButton_addActionPerformed
    
    //商品列表框被选中后响应事件
    private void jComboBox_ogoodsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_ogoodsItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            try {
                if(jRadioButton_all.isSelected()){
                 refreshjComboBox_osupplier();
                //如果选择所有商品单选被选中，初始化商品ComboBox
                }
                setStockandPrice();
                getCount();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_jComboBox_ogoodsItemStateChanged
    
   
    //供应商列表框选中后响应事件
    private void jComboBox_osupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_osupplierItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange()==ItemEvent.SELECTED){ 
             try {
                 if(jRadioButton_by.isSelected()){
                    refreshjComboBox_ogoods();
                 }
                 setStockandPrice();
                 getCount();
             } catch (SQLException ex) {
                 Logger.getLogger(Add_o.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_jComboBox_osupplierItemStateChanged

    //购买数量列表框被改变响应事件
    private void jComboBox_onumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_onumItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){ 
            getCount();
        }
    }//GEN-LAST:event_jComboBox_onumItemStateChanged

    // 根据供应商选择商品单选框被选中后响应事件
    private void jRadioButton_byItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_byItemStateChanged

         if(evt.getStateChange() == 1)
        {
            jComboBox_ogoods.setSelectedIndex(-1);
            jComboBox_osupplier.setSelectedIndex(-1);
            jComboBox_onum.setSelectedIndex(-1);
            jTextField_oprice.setText("0");
            jTextField_ocount.setText("0");
            try
            {
                initjComboBox_osupplier();
            }
            catch(SQLException ex)
            {
            }
        }

    }//GEN-LAST:event_jRadioButton_byItemStateChanged

    private void jRadioButton_allItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_allItemStateChanged
        // TODO add your handling code here:
         //选择所有商品单选按钮被选中
         if(evt.getStateChange() == 1)
        {
            jComboBox_ogoods.setSelectedIndex(-1);
            jComboBox_osupplier.setSelectedIndex(-1);
            jComboBox_onum.setSelectedIndex(-1);
            jTextField_oprice.setText("0");
            jTextField_ocount.setText("0");
            try
            {
                initjComboBox_ogoods();
            }
            catch(SQLException ex)
            {
            }
        }
   
        
    }//GEN-LAST:event_jRadioButton_allItemStateChanged

    //初始化客户列表，列出所有客户
    public static void initjComboBox_oname() throws SQLException{        
        Vector<String> items = new Vector<String>();
        String sql="select name from custom";
        ResultSet rs= DBHelper.query(sql);
        while(rs.next()){
        if(!items.contains(rs.getString(1))){
            items.add(rs.getString(1));
            }   
        }        
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
        jComboBox_oname.setModel(md);
        jComboBox_oname.setSelectedIndex(-1);
    }
    
    //初始化商品列表，列出所有商品
    public static void initjComboBox_ogoods() throws SQLException{
        
        Vector<String> items = new Vector<String>();
        String sql="select goods from goods";
        ResultSet rs= DBHelper.query(sql);
        while(rs.next()){
        if(!items.contains(rs.getString(1))){
            items.add(rs.getString(1));
            }   
        }        
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
        jComboBox_ogoods.setModel(md);
        jComboBox_ogoods.setSelectedIndex(-1);
    }
    
    //初始化供应商列表，列出所有供应商
    public static void initjComboBox_osupplier() throws SQLException{
        
        Vector<String> items = new Vector<String>();
        String sql="select name from supplier";
        ResultSet rs= DBHelper.query(sql);
        while(rs.next()){
        if(!items.contains(rs.getString(1))){
            items.add(rs.getString(1));
            }   
        }        
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
        jComboBox_osupplier.setModel(md);
        jComboBox_osupplier.setSelectedIndex(-1);
    }
        
    //选择所有商品单选后，选中商品，供应商发生变化
    public void refreshjComboBox_osupplier() throws SQLException{
            Vector<String> items = new Vector<String>();
            String goods=jComboBox_ogoods.getSelectedItem().toString();
            String sql="select supplier from goods where goods='"+goods+"'";
            ResultSet rs= DBHelper.query(sql);
            while(rs.next()){
            if(!items.contains(rs.getString(1))){
                items.add(rs.getString(1));
                }   
            }        
            javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
            jComboBox_osupplier.setModel(md);              
    }
    
    //根据供应商选择商品单选后，选中供应商，商品发生变化
    public void refreshjComboBox_ogoods() throws SQLException{       
            Vector<String> items = new Vector<String>();
            String supplier=jComboBox_osupplier.getSelectedItem().toString();
            String sql="select goods from goods where supplier='"+supplier+"'";
            ResultSet rs= DBHelper.query(sql);
            while(rs.next()){
                System.out.println(rs.getString(1));
            if(!items.contains(rs.getString(1))){
                items.add(rs.getString(1));
                }   
            }        
            javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
            jComboBox_ogoods.setModel(md);       
    }
    
    //取出选中商品的库存存入购买数量列表框，取出商品单价
    public void setStockandPrice() throws SQLException{
        if(jComboBox_ogoods.getSelectedIndex()!=-1&&jComboBox_osupplier.getSelectedIndex()!=-1){
            String goods=jComboBox_ogoods.getSelectedItem().toString();            
            String sql="select * from goods where goods='"+goods+"'";
            ResultSet rs= DBHelper.query(sql);
            String price="";
            while(rs.next()){
                stock=rs.getString("stock");
                price=rs.getString("price");
            }            
                Vector<String> items = new Vector<String>();
                for(int i=0;i<=Integer.parseInt(stock);i++){
                String s = String.valueOf(i);
                items.add(s);
        }       
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
        jComboBox_onum.setModel(md);
        jTextField_oprice.setText(price);        
        }else{
        jTextField_oprice.setText("0");      
        }
    }
    
    //根据商品单价和数量计算订单总价
    public void getCount(){
        if(jComboBox_onum.getSelectedIndex()!=-1){
            jTextField_ocount.setText("0");
            double price=Double.parseDouble(jTextField_oprice.getText());
            int num=jComboBox_onum.getSelectedIndex();
            System.out.println(num);
            double count=price*num;
            jTextField_ocount.setText(Double.toString(count));                
        }
    }
    
    public void addOrder() throws SQLException{
           String custom=jComboBox_oname.getSelectedItem().toString();
           String goods=jComboBox_ogoods.getSelectedItem().toString();
           String supplier=jComboBox_osupplier.getSelectedItem().toString();
           String num=jComboBox_onum.getSelectedItem().toString();
           String price=jTextField_oprice.getText();
           String countt=jTextField_ocount.getText();

           String sql = "insert into gorder(custom,goods,supplier,num,price,countt) values('"+custom+"','"+goods+"','"+supplier+"','"+num+"','"+price+"','"+countt+"'"+")";  
           DBHelper.update(sql);
           showMessageDialog(this, "订单添加成功！", "提示", javax.swing.JOptionPane.INFORMATION_MESSAGE);			                
           int a=Integer.parseInt(stock)-Integer.parseInt(num);
           String sql2 = "update goods set stock='"+a+"' where goods='"+goods+"'";
           DBHelper.update(sql2);
          init_o.initOrderTable();
           init_g.initGoodsTable();
           dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    public static javax.swing.JComboBox<String> jComboBox_ogoods;
    public static javax.swing.JComboBox<String> jComboBox_oname;
    public static javax.swing.JComboBox<String> jComboBox_onum;
    public static javax.swing.JComboBox<String> jComboBox_osupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.ButtonGroup jRadioButtonGroup;
    private javax.swing.JRadioButton jRadioButton_all;
    private javax.swing.JRadioButton jRadioButton_by;
    private javax.swing.JTextField jTextField_ocount;
    private javax.swing.JTextField jTextField_oprice;
    // End of variables declaration//GEN-END:variables
}
