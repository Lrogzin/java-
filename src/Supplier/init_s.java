package Supplier;

//@author 1U02UN

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static Shop.mainFrame.jTable_Supplier;
import SqlConnect.DBHelper;


public class init_s {
    public static void initSupplierTable() throws SQLException{
        String sql="select * from supplier";
        ResultSet rs= DBHelper.query(sql);
        
	DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column) {	
            return false; 
            }
        };
	model.setRowCount(0);//初始化表格
	//表格内居中
	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	jTable_Supplier.setDefaultRenderer(Object.class, renderer);
        String[] titles = new String[] { "唯一编号","姓名","电话","邮箱","地址"};
        model.setColumnIdentifiers(titles);
        while(rs.next()){
            String  tid=rs.getString("id").trim();
            String  tname=rs.getString("name").trim();
            String  tphone=rs.getString("phone").trim(); 
            String  tmail=rs.getString("email").trim();
            String  taddress=rs.getString("address").trim();        
            model.addRow(new Object[] { tid, tname, tphone, tmail,taddress});     
                        }
    jTable_Supplier.setModel(model);
    }
}
