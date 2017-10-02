package Goods;

//@author 1U02UN

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static Shop.mainFrame.jTable_Goods;
import SqlConnect.DBHelper;


public class init_g {
    public static void initGoodsTable() throws SQLException{
        String sql="select * from goods";
        ResultSet rs= DBHelper.query(sql);
        
	DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column) {	
            return false; 
            }
        };
	model.setRowCount(0);//初始化表格
	//表格内居中
	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	jTable_Goods.setDefaultRenderer(Object.class, renderer);
        String[] titles = new String[] { "唯一编号","商品名称","价格","类型","供应商","库存","描述"};
        model.setColumnIdentifiers(titles);
        while(rs.next()){
            String  tid=rs.getString("id").trim();
            String  tgoods=rs.getString("goods").trim();
            String  tprice=rs.getString("price").trim();
            String  tkind=rs.getString("kind").trim(); 
            String  tsupplier=rs.getString("supplier").trim();
            String  tdescribe=rs.getString("descpp").trim();
            String  tstock=rs.getString("stock").trim(); 
            model.addRow(new Object[] { tid, tgoods, tprice, tkind, tsupplier,tstock,tdescribe});     
                        }
        jTable_Goods.setModel(model);
    }
}
