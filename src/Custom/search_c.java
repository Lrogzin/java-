package Custom;

//@author 1U02UN

import static java.awt.Frame.ICONIFIED;
import static Shop.mainFrame.jTable_Custom;
import static Shop.mainFrame.jTextField_search_c;


public class search_c {
    public static void search_customByID(){
        String inid=jTextField_search_c.getText();//取出输入的编号       
        try{
            Integer.parseInt(inid);//转为整形数字判断是否输入的是整数
            String tablestr;
            //遍历table的i行0列，找出编号，与输入的编号对比
            for(int i=0;i<jTable_Custom.getRowCount();i++){
                tablestr=jTable_Custom.getValueAt(i,0).toString();
                if(inid.equals(tablestr)){
                //设置table选中第i行           
                jTable_Custom.changeSelection(i, ICONIFIED, false, false);
                System.out.print(i);
                break;
                }
        }
        }catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "编号格式错误！", "错误", javax.swing.JOptionPane.ERROR_MESSAGE);			
            jTextField_search_c.setText("");
        }
                
        /*ps:   public void changeSelection(int rowIndex,int columnIndex,boolean toggle,boolean extend)
        toggle：false，extend：false。清除以前的选择并确保选定新的单元格。 
        toggle：false，extend：true。将以前的选择从定位点扩展到指定的单元格，清除所有其他选择。 
        toggle：true，extend：false。如果指定的单元格是选定的，则取消选定它。如果它不是选定的，则选定它。 
        toggle：true，extend：true。将定位点的选择状态应用于它与指定单元间的所有单元。 
        */ 
    }
}
