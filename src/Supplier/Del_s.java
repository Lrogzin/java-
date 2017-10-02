package Supplier;

//@author 1U02UN

import Goods.init_ComboBox;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Shop.mainFrame;
import static Shop.mainFrame.jTable_Supplier;
import SqlConnect.DBHelper;


public class Del_s {
    public static void delete_s(){
            int result = javax.swing.JOptionPane.showConfirmDialog(null, "是否确定删除该供应商？", "提示", javax.swing.JOptionPane.YES_NO_OPTION);
	if (result == 0) {
            String id=jTable_Supplier.getValueAt(jTable_Supplier.getSelectedRow(),0).toString();
            String sql="delete from supplier where id="+id;
            DBHelper.update(sql);
            try {
                init_s.initSupplierTable();
                init_ComboBox.initjComboBox_sup();
            } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
            } 
    }
}
