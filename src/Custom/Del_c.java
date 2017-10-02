package Custom;

//@author 1U02UN

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Shop.mainFrame;
import static Shop.mainFrame.jTable_Custom;
import SqlConnect.DBHelper;


public class Del_c {
    public static void delete_c(){
            // 删除客户
//            int getSelectedColumn() 
//            返回第一个选定列的索引；如果没有选定的列，则返回 -1。
//            int getSelectedRow() 
//            返回第一个选定行的索引；如果没有选定的行，则返回 -1。 
//            Object getValueAt(int row, int column) 
//            返回 row 和 column 位置的单元格值。 
        //if(jTable_Custom.getSelectedRow()!=-1){
        //System.out.println(jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),jTable_Custom.getSelectedColumn()));
        //}
        //System.out.println(jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),0));
        int result = javax.swing.JOptionPane.showConfirmDialog(null, "是否确定删除该客户？", "用户提示", javax.swing.JOptionPane.YES_NO_OPTION);
	if (result == 0) {
            String id=jTable_Custom.getValueAt(jTable_Custom.getSelectedRow(),0).toString();
            String sql="delete from custom where id="+id;
            DBHelper.update(sql);
            try {
                init_c.initCustomTable();
            } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
            } 
    }
}
