package Shop;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Custom.Add_c;
import Custom.Alter_c;
import Custom.Del_c;
import Goods.Add_g;
import Goods.Alter_g;
import Order.Add_o;
import Order.detail_o;
import Supplier.Add_s;
import Supplier.Alter_s;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import Custom.init_c;
import Custom.search_c;
import Goods.Del_g;
import Goods.init_ComboBox;
import Goods.init_g;
import Goods.refresh_g;
import Goods.search_g;
import Order.Del_o;
import Order.init_o;
import Order.search_o;
import Supplier.Del_s;
import Supplier.init_s;
import Supplier.search_s;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author 1U02UN
 */
public class mainFrame extends javax.swing.JFrame {


    public mainFrame() throws SQLException {
        initComponents();
        setIco();
        jLabel_admin.setText(loginFrame.loginname);
        setLocationRelativeTo(null);
        init_c.initCustomTable();
        init_s.initSupplierTable();
        init_g.initGoodsTable();
        init_o.initOrderTable();
        init_ComboBox.initjComboBox_sup();
        init_ComboBox.initjComboBox_goods();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu_Custom = new javax.swing.JPopupMenu();
        jMenuItem_add = new javax.swing.JMenuItem();
        jMenuItem_alter = new javax.swing.JMenuItem();
        jMenuItem_del = new javax.swing.JMenuItem();
        jPopupMenu_Supplier = new javax.swing.JPopupMenu();
        jMenuItem_addSupplier = new javax.swing.JMenuItem();
        jMenuItem_alterSupplier = new javax.swing.JMenuItem();
        jMenuItem_delSupplier = new javax.swing.JMenuItem();
        jPopupMenu_Goods = new javax.swing.JPopupMenu();
        jMenuItem_addGoods = new javax.swing.JMenuItem();
        jMenuItem_alterGoods = new javax.swing.JMenuItem();
        jMenuItem_delGoods = new javax.swing.JMenuItem();
        jPopupMenu_Order = new javax.swing.JPopupMenu();
        jMenuItem_addOrder = new javax.swing.JMenuItem();
        jMenuItem_delOrder = new javax.swing.JMenuItem();
        jSeparator_order = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Orderdetail = new javax.swing.JMenuItem();
        jTabbedPane_main = new javax.swing.JTabbedPane();
        jPanel_home = new javax.swing.JPanel(){
            ImageIcon img=new ImageIcon(getClass().getResource("/Image/background.png"));
            protected void paintComponent(Graphics g){
                if(img!=null){
                    super.paintComponent(g);
                    g.drawImage(img.getImage(),0,0,getWidth(),getHeight(),null);
                }
            }
        };
        jLabel7 = new javax.swing.JLabel();
        jLabel_admin = new javax.swing.JLabel();
        jPanel_c = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Custom = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search_c = new javax.swing.JTextField();
        jButton_search_c = new javax.swing.JButton();
        jPanel_s = new javax.swing.JPanel();
        jTextField_search_s = new javax.swing.JTextField();
        jButton_search_s = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Supplier = new javax.swing.JTable();
        jPanel_gm = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Goods = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField_search_goods = new javax.swing.JTextField();
        jButton_search_goods = new javax.swing.JButton();
        jComboBox_sup = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_kind = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel_om = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_search_order = new javax.swing.JTextField();
        jButton_search_order = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Order = new javax.swing.JTable();
        jMenuBar_main = new javax.swing.JMenuBar();
        jMenu_SysManage = new javax.swing.JMenu();
        jMenuItem_rePassword = new javax.swing.JMenuItem();
        jMenuItem_exit = new javax.swing.JMenuItem();
        jMenu_About = new javax.swing.JMenu();
        jMenuItem_about = new javax.swing.JMenuItem();
        jMenuItem_help = new javax.swing.JMenuItem();

        jMenuItem_add.setText("增加客户");
        jMenuItem_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addActionPerformed(evt);
            }
        });
        jPopupMenu_Custom.add(jMenuItem_add);

        jMenuItem_alter.setText("修改客户");
        jMenuItem_alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_alterActionPerformed(evt);
            }
        });
        jPopupMenu_Custom.add(jMenuItem_alter);

        jMenuItem_del.setText("删除客户");
        jMenuItem_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_delActionPerformed(evt);
            }
        });
        jPopupMenu_Custom.add(jMenuItem_del);

        jMenuItem_addSupplier.setText("增加供应商");
        jMenuItem_addSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addSupplierActionPerformed(evt);
            }
        });
        jPopupMenu_Supplier.add(jMenuItem_addSupplier);

        jMenuItem_alterSupplier.setText("修改供应商");
        jMenuItem_alterSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_alterSupplierActionPerformed(evt);
            }
        });
        jPopupMenu_Supplier.add(jMenuItem_alterSupplier);

        jMenuItem_delSupplier.setText("删除供应商");
        jMenuItem_delSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_delSupplierActionPerformed(evt);
            }
        });
        jPopupMenu_Supplier.add(jMenuItem_delSupplier);

        jMenuItem_addGoods.setText("增加商品");
        jMenuItem_addGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addGoodsActionPerformed(evt);
            }
        });
        jPopupMenu_Goods.add(jMenuItem_addGoods);

        jMenuItem_alterGoods.setText("修改商品");
        jMenuItem_alterGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_alterGoodsActionPerformed(evt);
            }
        });
        jPopupMenu_Goods.add(jMenuItem_alterGoods);

        jMenuItem_delGoods.setText("删除商品");
        jMenuItem_delGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_delGoodsActionPerformed(evt);
            }
        });
        jPopupMenu_Goods.add(jMenuItem_delGoods);

        jMenuItem_addOrder.setText("新增订单");
        jMenuItem_addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addOrderActionPerformed(evt);
            }
        });
        jPopupMenu_Order.add(jMenuItem_addOrder);

        jMenuItem_delOrder.setText("删除订单");
        jMenuItem_delOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_delOrderActionPerformed(evt);
            }
        });
        jPopupMenu_Order.add(jMenuItem_delOrder);
        jPopupMenu_Order.add(jSeparator_order);

        jMenuItem_Orderdetail.setText("订单详情");
        jMenuItem_Orderdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_OrderdetailActionPerformed(evt);
            }
        });
        jPopupMenu_Order.add(jMenuItem_Orderdetail);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("网上超市信息管理系统");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
        jLabel7.setText("当前登录账户：");

        jLabel_admin.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel_admin.setText("admin");

        javax.swing.GroupLayout jPanel_homeLayout = new javax.swing.GroupLayout(jPanel_home);
        jPanel_home.setLayout(jPanel_homeLayout);
        jPanel_homeLayout.setHorizontalGroup(
            jPanel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_homeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_admin)
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel_homeLayout.setVerticalGroup(
            jPanel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_homeLayout.createSequentialGroup()
                .addGroup(jPanel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 418, Short.MAX_VALUE))
        );

        jTabbedPane_main.addTab("主页", jPanel_home);

        jTable_Custom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Custom.setToolTipText("右键表格内容以编辑");
        jTable_Custom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CustomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Custom);

        jLabel2.setText("客户唯一编号：");

        jTextField_search_c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_search_cKeyPressed(evt);
            }
        });

        jButton_search_c.setText("搜索");
        jButton_search_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_cLayout = new javax.swing.GroupLayout(jPanel_c);
        jPanel_c.setLayout(jPanel_cLayout);
        jPanel_cLayout.setHorizontalGroup(
            jPanel_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cLayout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search_c, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_search_c)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel_cLayout.setVerticalGroup(
            jPanel_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_search_c)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane_main.addTab("客户信息管理", jPanel_c);

        jTextField_search_s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_search_sKeyPressed(evt);
            }
        });

        jButton_search_s.setText("搜索");
        jButton_search_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_sActionPerformed(evt);
            }
        });

        jLabel1.setText("供应商唯一编号：");

        jTable_Supplier.setToolTipText("右键表格内容以编辑");
        jTable_Supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SupplierMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Supplier);

        javax.swing.GroupLayout jPanel_sLayout = new javax.swing.GroupLayout(jPanel_s);
        jPanel_s.setLayout(jPanel_sLayout);
        jPanel_sLayout.setHorizontalGroup(
            jPanel_sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search_s, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_search_s)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        jPanel_sLayout.setVerticalGroup(
            jPanel_sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_search_s)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jTabbedPane_main.addTab("供应商信息管理", jPanel_s);

        jTable_Goods.setToolTipText("右键表格内容以编辑");
        jTable_Goods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_GoodsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Goods);

        jLabel3.setText("商品唯一编号：");

        jTextField_search_goods.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_search_goodsKeyPressed(evt);
            }
        });

        jButton_search_goods.setText("搜索");
        jButton_search_goods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_goodsActionPerformed(evt);
            }
        });

        jComboBox_sup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_supItemStateChanged(evt);
            }
        });

        jLabel4.setText("供应商：");

        jComboBox_kind.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_kindItemStateChanged(evt);
            }
        });

        jLabel5.setText("商品类别：");

        javax.swing.GroupLayout jPanel_gmLayout = new javax.swing.GroupLayout(jPanel_gm);
        jPanel_gm.setLayout(jPanel_gmLayout);
        jPanel_gmLayout.setHorizontalGroup(
            jPanel_gmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_gmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_kind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search_goods, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_search_goods)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        jPanel_gmLayout.setVerticalGroup(
            jPanel_gmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_gmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_gmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_goods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_search_goods)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_kind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jTabbedPane_main.addTab("商品信息管理", jPanel_gm);

        jLabel6.setText("订单编号：");

        jTextField_search_order.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_search_orderKeyPressed(evt);
            }
        });

        jButton_search_order.setText("搜索");
        jButton_search_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_orderActionPerformed(evt);
            }
        });

        jTable_Order.setToolTipText("右键表格内容以编辑");
        jTable_Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_OrderMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_Order);

        javax.swing.GroupLayout jPanel_omLayout = new javax.swing.GroupLayout(jPanel_om);
        jPanel_om.setLayout(jPanel_omLayout);
        jPanel_omLayout.setHorizontalGroup(
            jPanel_omLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(jPanel_omLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_omLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel_omLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_omLayout.createSequentialGroup()
                            .addGap(454, 454, 454)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_search_order, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_search_order))
                        .addComponent(jScrollPane5))
                    .addContainerGap()))
        );
        jPanel_omLayout.setVerticalGroup(
            jPanel_omLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(jPanel_omLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_omLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel_omLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_search_order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_search_order)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane5)
                    .addContainerGap()))
        );

        jTabbedPane_main.addTab("订单信息管理", jPanel_om);

        jMenu_SysManage.setText("系统管理");

        jMenuItem_rePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_rePassword.setText("密码修改");
        jMenuItem_rePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_rePasswordActionPerformed(evt);
            }
        });
        jMenu_SysManage.add(jMenuItem_rePassword);

        jMenuItem_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_exit.setText("退出");
        jMenuItem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_exitActionPerformed(evt);
            }
        });
        jMenu_SysManage.add(jMenuItem_exit);

        jMenuBar_main.add(jMenu_SysManage);

        jMenu_About.setText("关于系统");

        jMenuItem_about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_about.setText("关于作者");
        jMenuItem_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_aboutActionPerformed(evt);
            }
        });
        jMenu_About.add(jMenuItem_about);

        jMenuItem_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_help.setText("使用帮助");
        jMenuItem_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_helpActionPerformed(evt);
            }
        });
        jMenu_About.add(jMenuItem_help);

        jMenuBar_main.add(jMenu_About);

        setJMenuBar(jMenuBar_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_main)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane_main)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_rePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_rePasswordActionPerformed
        try {
            new pwchange().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_rePasswordActionPerformed

    private void jMenuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_exitActionPerformed
        // 退出系统
        int result = javax.swing.JOptionPane.showConfirmDialog(this, "是否确定退出系统？", "提示", javax.swing.JOptionPane.YES_NO_OPTION);
	if (result == 0) {
        System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem_exitActionPerformed

    
    
    
    private void jTable_CustomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CustomMouseClicked
        // TODO add your handling code here:      
         if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {  
           //通过点击位置找到点击为表格中的行  
           int focusedRowIndex = jTable_Custom.rowAtPoint(evt.getPoint());  
           if (focusedRowIndex == -1) {  
               return;  
           }  
           //将表格所选项设为当前右键点击的行  
           jTable_Custom.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);  
           //弹出菜单  
           jPopupMenu_Custom.show(jTable_Custom, evt.getX(), evt.getY());  
       }
          
    }//GEN-LAST:event_jTable_CustomMouseClicked

    private void jMenuItem_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addActionPerformed
        // TODO add your handling code here:
        new Add_c().setVisible(true);
    }//GEN-LAST:event_jMenuItem_addActionPerformed

    private void jMenuItem_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_delActionPerformed
      Del_c.delete_c();
    }//GEN-LAST:event_jMenuItem_delActionPerformed

    private void jMenuItem_alterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_alterActionPerformed
        //修改客户信息
        new Alter_c().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_alterActionPerformed

    private void jTable_SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SupplierMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {  
           //通过点击位置找到点击为表格中的行  
           int focusedRowIndex = jTable_Supplier.rowAtPoint(evt.getPoint());  
           if (focusedRowIndex == -1) {  
               return;  
           }  
           //将表格所选项设为当前右键点击的行  
           jTable_Supplier.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);  
           //弹出菜单  
           jPopupMenu_Supplier.show(jTable_Supplier, evt.getX(), evt.getY());  
       }
        
    }//GEN-LAST:event_jTable_SupplierMouseClicked

    private void jMenuItem_addSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addSupplierActionPerformed
        // TODO add your handling code here:
        new Add_s().setVisible(true);
    }//GEN-LAST:event_jMenuItem_addSupplierActionPerformed

    private void jMenuItem_alterSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_alterSupplierActionPerformed
        // TODO add your handling code here:
        new Alter_s().setVisible(true);
    }//GEN-LAST:event_jMenuItem_alterSupplierActionPerformed

    private void jMenuItem_delSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_delSupplierActionPerformed
        // TODO add your handling code here:
        Del_s.delete_s();
        
    }//GEN-LAST:event_jMenuItem_delSupplierActionPerformed

    private void jButton_search_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_sActionPerformed
        // TODO add your handling code here:
        search_s.search_supplierByID();
    }//GEN-LAST:event_jButton_search_sActionPerformed

    private void jButton_search_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_cActionPerformed
        search_c.search_customByID();
    }//GEN-LAST:event_jButton_search_cActionPerformed

    private void jTextField_search_cKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_cKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            search_c.search_customByID();
        }
    }//GEN-LAST:event_jTextField_search_cKeyPressed

    private void jTextField_search_sKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_sKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            search_s.search_supplierByID();
        }       
    }//GEN-LAST:event_jTextField_search_sKeyPressed

    private void jTextField_search_goodsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_goodsKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            search_g.search_goodsByID();
        }
    }//GEN-LAST:event_jTextField_search_goodsKeyPressed

    private void jButton_search_goodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_goodsActionPerformed
        // TODO add your handling code here:
        search_g.search_goodsByID();
    }//GEN-LAST:event_jButton_search_goodsActionPerformed

    private void jMenuItem_addGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addGoodsActionPerformed
        try {
            // TODO add your handling code here:
            new Add_g().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_addGoodsActionPerformed

    private void jMenuItem_alterGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_alterGoodsActionPerformed
        try {
            // TODO add your handling code here:
            new Alter_g().setVisible(true);
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem_alterGoodsActionPerformed

    private void jMenuItem_delGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_delGoodsActionPerformed
        // TODO add your handling code here:
        Del_g.delete_g();
        
    }//GEN-LAST:event_jMenuItem_delGoodsActionPerformed

    private void jTable_GoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_GoodsMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
            //通过点击位置找到点击为表格中的行
            int focusedRowIndex = jTable_Goods.rowAtPoint(evt.getPoint());
            if (focusedRowIndex == -1) {
                return;
            }
            //将表格所选项设为当前右键点击的行
            jTable_Goods.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);
            //弹出菜单
            jPopupMenu_Goods.show(jTable_Goods, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable_GoodsMouseClicked

    private void jComboBox_kindItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_kindItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            refresh_g.refreshGoodsTable();
        }      
    }//GEN-LAST:event_jComboBox_kindItemStateChanged

    private void jComboBox_supItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_supItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            refresh_g.refreshGoodsTable();
        }
    }//GEN-LAST:event_jComboBox_supItemStateChanged

    private void jTextField_search_orderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_orderKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            search_o.search_ordersByID();
        }  
        
    }//GEN-LAST:event_jTextField_search_orderKeyPressed

    private void jButton_search_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_orderActionPerformed
        // TODO add your handling code here:
        search_o.search_ordersByID();
    }//GEN-LAST:event_jButton_search_orderActionPerformed

    private void jTable_OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_OrderMouseClicked
        // TODO add your handling code here:
                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
            //通过点击位置找到点击为表格中的行
            int focusedRowIndex = jTable_Order.rowAtPoint(evt.getPoint());
            if (focusedRowIndex == -1) {
                return;
            }
            //将表格所选项设为当前右键点击的行
            jTable_Order.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);
            //弹出菜单
            jPopupMenu_Order.show(jTable_Order, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable_OrderMouseClicked

    private void jMenuItem_addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addOrderActionPerformed
        try {
            // TODO add your handling code here:
            new Add_o().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_addOrderActionPerformed

    private void jMenuItem_delOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_delOrderActionPerformed
        // TODO add your handling code here:
        Del_o.delete_o();
    }//GEN-LAST:event_jMenuItem_delOrderActionPerformed

    private void jMenuItem_OrderdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_OrderdetailActionPerformed
        try {
            // TODO add your handling code here:
            new detail_o().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_OrderdetailActionPerformed

    
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
        
    private void jMenuItem_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_helpActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, "右键表格内任意记录以编辑。", "Help",  javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem_helpActionPerformed

    private void jMenuItem_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_aboutActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, "作者：1U02UN\n组名：nu1l\n有任何使用问题请联系作者QQ：228975838 ", "About",  javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem_aboutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int result = javax.swing.JOptionPane.showConfirmDialog(this, "是否确定退出系统？", "提示", javax.swing.JOptionPane.YES_NO_OPTION);
	if (result == 0) {
        System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_search_c;
    private javax.swing.JButton jButton_search_goods;
    private javax.swing.JButton jButton_search_order;
    private javax.swing.JButton jButton_search_s;
    public static javax.swing.JComboBox<String> jComboBox_kind;
    public static javax.swing.JComboBox<String> jComboBox_sup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel_admin;
    private javax.swing.JMenuBar jMenuBar_main;
    private javax.swing.JMenuItem jMenuItem_Orderdetail;
    private javax.swing.JMenuItem jMenuItem_about;
    private javax.swing.JMenuItem jMenuItem_add;
    private javax.swing.JMenuItem jMenuItem_addGoods;
    private javax.swing.JMenuItem jMenuItem_addOrder;
    private javax.swing.JMenuItem jMenuItem_addSupplier;
    private javax.swing.JMenuItem jMenuItem_alter;
    private javax.swing.JMenuItem jMenuItem_alterGoods;
    private javax.swing.JMenuItem jMenuItem_alterSupplier;
    private javax.swing.JMenuItem jMenuItem_del;
    private javax.swing.JMenuItem jMenuItem_delGoods;
    private javax.swing.JMenuItem jMenuItem_delOrder;
    private javax.swing.JMenuItem jMenuItem_delSupplier;
    private javax.swing.JMenuItem jMenuItem_exit;
    private javax.swing.JMenuItem jMenuItem_help;
    private javax.swing.JMenuItem jMenuItem_rePassword;
    private javax.swing.JMenu jMenu_About;
    private javax.swing.JMenu jMenu_SysManage;
    private javax.swing.JPanel jPanel_c;
    private javax.swing.JPanel jPanel_gm;
    private javax.swing.JPanel jPanel_home;
    private javax.swing.JPanel jPanel_om;
    private javax.swing.JPanel jPanel_s;
    private javax.swing.JPopupMenu jPopupMenu_Custom;
    private javax.swing.JPopupMenu jPopupMenu_Goods;
    private javax.swing.JPopupMenu jPopupMenu_Order;
    private javax.swing.JPopupMenu jPopupMenu_Supplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator_order;
    private javax.swing.JTabbedPane jTabbedPane_main;
    public static javax.swing.JTable jTable_Custom;
    public static javax.swing.JTable jTable_Goods;
    public static javax.swing.JTable jTable_Order;
    public static javax.swing.JTable jTable_Supplier;
    public static javax.swing.JTextField jTextField_search_c;
    public static javax.swing.JTextField jTextField_search_goods;
    public static javax.swing.JTextField jTextField_search_order;
    public static javax.swing.JTextField jTextField_search_s;
    // End of variables declaration//GEN-END:variables
}
