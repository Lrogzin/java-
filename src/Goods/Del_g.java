package Goods;

//@author 1U02UN

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Shop.mainFrame;
import static Shop.mainFrame.jTable_Goods;
import SqlConnect.DBHelper;


public class Del_g {
    public static void delete_g(){
    
    int result = javax.swing.JOptionPane.showConfirmDialog(null, "是否确定删除该商品？", "提示", javax.swing.JOptionPane.YES_NO_OPTION);
	if (result == 0) {
            String id=jTable_Goods.getValueAt(jTable_Goods.getSelectedRow(),0).toString();
            String sql="delete from goods where id="+id;
            DBHelper.update(sql);
            try {
                init_g.initGoodsTable();
                init_ComboBox.initjComboBox_goods();
            } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
            }
    }
}
