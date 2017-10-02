package Order;

//@author 1U02UN

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static Shop.mainFrame.jTable_Order;
import SqlConnect.DBHelper;


public class init_o {
    public static void initOrderTable() throws SQLException{
        String sql="select * from gorder";
        ResultSet rs= DBHelper.query(sql);
        
	DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column) {	
            return false; 
            }
        };
	model.setRowCount(0);//初始化表格
	//表格内居中
	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	jTable_Order.setDefaultRenderer(Object.class, renderer);
        String[] titles = new String[] { "订单号","客户","商品","单价(元)","购买数量","供应商","总价(元)","下单时间"};
        model.setColumnIdentifiers(titles);
        while(rs.next()){
            String  tid=rs.getString("id").trim();
            String  tcustom=rs.getString("custom").trim();
            String  tgoods=rs.getString("goods").trim(); 
            String  tprice=rs.getString("price").trim();
            String  tnum=rs.getString("num").trim();
            String  tsupplier=rs.getString("supplier").trim();
            String  tcount=rs.getString("countt").trim();
            
            Timestamp timestamp = rs.getTimestamp("mktime");
            //Date date = new Date(timestamp.getTime());
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String ttime=df.format( timestamp); 
            
            model.addRow(new Object[] { tid, tcustom, tgoods, tprice,tnum,tsupplier,tcount,ttime});     
                        }
    jTable_Order.setModel(model);
    }
}
