package Goods;

//@author 1U02UN

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Shop.mainFrame;
import static Shop.mainFrame.jComboBox_kind;
import static Shop.mainFrame.jComboBox_sup;
import static Shop.mainFrame.jTable_Goods;
import SqlConnect.DBHelper;


public class refresh_g {
    public static void refreshGoodsTable(){
    String kind=jComboBox_kind.getSelectedItem().toString();
        String sup=jComboBox_sup.getSelectedItem().toString();
        String sql="select * from goods";
        if(kind=="全部"&&sup=="全部"){
            try {
                init_g.initGoodsTable();
            } catch (SQLException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(kind=="全部"&&sup!="全部"){
            sql="select * from goods where supplier='"+sup+"'";
        }else if(sup=="全部"&&kind!="全部"){
            sql="select * from goods where kind='"+kind+"'";
        }else{
            sql="select * from goods where kind='"+kind+"' and supplier='"+sup+"'";
        }
        ResultSet rs= DBHelper.query(sql); 
        
	DefaultTableModel model = new DefaultTableModel();
	model.setRowCount(0);//初始化表格
	//表格内居中
	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	jTable_Goods.setDefaultRenderer(Object.class, renderer);
        String[] titles = new String[] { "唯一编号","商品名称","价格","类型","供应商","库存","描述"};
        model.setColumnIdentifiers(titles);
        try {
            while(rs.next()){
                 //System.out.println(rs);
                String  tid=rs.getString("id").trim();
                String  tgoods=rs.getString("goods").trim();
                String  tprice=rs.getString("price").trim();
                String  tkind=rs.getString("kind").trim();
                String  tsupplier=rs.getString("supplier").trim();
                String  tdescribe=rs.getString("descpp").trim();
                String  tstock=rs.getString("stock").trim();
                model.addRow(new Object[] { tid, tgoods, tprice, tkind, tsupplier,tstock,tdescribe});
            }
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable_Goods.setModel(model);
    }
}
