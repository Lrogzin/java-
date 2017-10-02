package Goods;

//@author 1U02UN

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import static Shop.mainFrame.jComboBox_kind;
import static Shop.mainFrame.jComboBox_sup;
import SqlConnect.DBHelper;


public class init_ComboBox {
    public static void initjComboBox_sup() throws SQLException{
        
        Vector<String> items = new Vector<String>();
        items.add("全部");
        String sql="select name from supplier";
        ResultSet rs= DBHelper.query(sql);
        while(rs.next()){
        System.out.println(rs.getString(1));
        if(!items.contains(rs.getString(1))){
            items.add(rs.getString(1));
            }            
        } 
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items);
        jComboBox_sup.setModel(md);
    }
    
     public static void initjComboBox_goods() throws SQLException{
        
        Vector<String> items2 = new Vector<String>();
        items2.add("全部");
        String sql="select kind from goods";
        ResultSet rs= DBHelper.query(sql);
        while(rs.next()){
        if(!items2.contains(rs.getString(1))){
            items2.add(rs.getString(1));
            }   
        }        
        javax.swing.DefaultComboBoxModel md=new javax.swing.DefaultComboBoxModel(items2);
        jComboBox_kind.setModel(md);
    }

    static void initjComboBox_supplier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
