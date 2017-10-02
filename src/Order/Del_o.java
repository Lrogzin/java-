package Order;

//@author 1U02UN

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Shop.mainFrame;
import static Shop.mainFrame.jTable_Order;
import SqlConnect.DBHelper;


public class Del_o {
    public static void delete_o(){
            int result = javax.swing.JOptionPane.showConfirmDialog(null, "是否确定删除该订单？", "提示", javax.swing.JOptionPane.YES_NO_OPTION);
	if (result == 0) {
            String id=jTable_Order.getValueAt(jTable_Order.getSelectedRow(),0).toString();
            String sql="delete from gorder where id="+id;
            DBHelper.update(sql);
            try {
                init_o.initOrderTable();
            } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
            }
    }
}
