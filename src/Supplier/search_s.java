package Supplier;

//@author 1U02UN

import static java.awt.Frame.ICONIFIED;
import static Shop.mainFrame.jTable_Supplier;
import static Shop.mainFrame.jTextField_search_s;


public class search_s {
    public static void search_supplierByID(){
        
        String inid=jTextField_search_s.getText();//取出输入的编号       
        try{
            Integer.parseInt(inid);//转为整形数字判断是否输入的是整数
            String tablestr;
            //遍历table的i行0列，找出编号，与输入的编号对比
            for(int i=0;i<jTable_Supplier.getRowCount();i++){
                tablestr=jTable_Supplier.getValueAt(i,0).toString();
                if(inid.equals(tablestr)){
                //设置table选中第i行           
                jTable_Supplier.changeSelection(i, ICONIFIED, false, false);
                System.out.print(i);
                break;
                }
        }
        }catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "编号格式错误！", "错误", javax.swing.JOptionPane.ERROR_MESSAGE);			
            jTextField_search_s.setText("");
        }
    }
}
