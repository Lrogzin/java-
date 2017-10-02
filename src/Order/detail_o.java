package Order;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.sql.ResultSet;
import java.sql.SQLException;
import static Shop.mainFrame.jTable_Order;
import SqlConnect.DBHelper;

/**
 *
 * @author 1U02UN
 */
public class detail_o extends javax.swing.JFrame {
    String detail="";
    public detail_o() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButton_close);
        getDetail();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel_orderId = new javax.swing.JLabel();
        jLabel_order_count = new javax.swing.JLabel();
        jLabel_custom = new javax.swing.JLabel();
        jLabel_goods = new javax.swing.JLabel();
        jLabel_num = new javax.swing.JLabel();
        jLabel_kind = new javax.swing.JLabel();
        jLabel_supplier = new javax.swing.JLabel();
        jLabel_descpp = new javax.swing.JLabel();
        jLabel_phone = new javax.swing.JLabel();
        jLabel_mail = new javax.swing.JLabel();
        jLabel_address = new javax.swing.JLabel();
        jButton_close = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("订单详情");
        setResizable(false);

        jLabel1.setText("订单编号：");

        jLabel2.setText("订单总价：");

        jLabel3.setText("客户姓名：");

        jLabel4.setText("商品名称：");

        jLabel5.setText("购买数量：");

        jLabel6.setText("商品类型：");

        jLabel7.setText("供应商：");

        jLabel8.setText("商品描述：");

        jLabel9.setText("客户电话：");

        jLabel10.setText("客户邮箱：");

        jLabel11.setText("客户地址：");

        jLabel_orderId.setText("null");

        jLabel_order_count.setText("null");

        jLabel_custom.setText("null");

        jLabel_goods.setText("null");

        jLabel_num.setText("null");

        jLabel_kind.setText("null");

        jLabel_supplier.setText("null");

        jLabel_descpp.setText("null");

        jLabel_phone.setText("null");

        jLabel_mail.setText("null");

        jLabel_address.setText("null");

        jButton_close.setText("复制并关闭");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        jLabel12.setText("下单时间：");

        jLabel_time.setText("null");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_time, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_descpp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_orderId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_order_count, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_custom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_goods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_kind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_close)
                                .addComponent(jLabel_address, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_orderId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_order_count))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_custom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_goods))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_kind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_supplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_descpp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel_mail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel_address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton_close)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        // TODO add your handling code here:
        
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable td=new StringSelection(detail);
        clipboard.setContents(td, null);
        dispose();
    }//GEN-LAST:event_jButton_closeActionPerformed
    
    public void getDetail() throws SQLException{
        String orderId=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),0).toString();
        String custom=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),1).toString();
        String goods=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),2).toString();
        String num=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),4).toString();
        String supplier=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),5).toString();
        String countt=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),6).toString();
        String ttime=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),7).toString();
        String phone="";
        String mail="";
        String address="";
        String kind="";
        String descpp="";
        String sql_custom="select * from custom where name='"+custom+"'";
	ResultSet rs= DBHelper.query(sql_custom);
        while(rs.next()){
            phone=rs.getString("phone");
            mail=rs.getString("email");
            address=rs.getString("address");
        }
        String sql_goods="select * from goods where goods='"+goods+"'";
	ResultSet rs2= DBHelper.query(sql_goods);
        while(rs2.next()){
            kind=rs2.getString("kind");
            descpp=rs2.getString("descpp");
        }
        
        jLabel_address.setText(address);
        jLabel_custom.setText(custom);
        jLabel_descpp.setText(descpp);
        jLabel_goods.setText(goods);
        jLabel_kind.setText(kind);
        jLabel_mail.setText(mail);
        jLabel_num.setText(num);
        jLabel_orderId.setText(orderId);
        jLabel_order_count.setText(countt);
        jLabel_phone.setText(phone);
        jLabel_supplier.setText(supplier);
        jLabel_time.setText(ttime);
        detail="订单编号："+orderId+"\n订单总价："+countt+"\n客户姓名："+custom+"\n商品名称："+goods+"\n购买数量："
                +num+"\n商品类型："+kind+"\n供应商："+supplier+"\n商品描述："+descpp+"\n客户电话："+phone+"\n客户邮箱："
                +mail+"\n客户地址："+address+"\n下单时间："+ttime;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_custom;
    private javax.swing.JLabel jLabel_descpp;
    private javax.swing.JLabel jLabel_goods;
    private javax.swing.JLabel jLabel_kind;
    private javax.swing.JLabel jLabel_mail;
    private javax.swing.JLabel jLabel_num;
    private javax.swing.JLabel jLabel_orderId;
    private javax.swing.JLabel jLabel_order_count;
    private javax.swing.JLabel jLabel_phone;
    private javax.swing.JLabel jLabel_supplier;
    private javax.swing.JLabel jLabel_time;
    // End of variables declaration//GEN-END:variables
}
