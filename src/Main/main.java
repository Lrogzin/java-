package Main;

//@author 1U02UN

import java.sql.SQLException;
import javax.swing.UIManager;
import Shop.loginFrame;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;


public class main {
    public static void main(String args[]) throws SQLException, Exception {
        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper. FrameBorderStyle.generalNoTranslucencyShadow ;
	org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        UIManager.put("RootPane.setupButtonVisible",false);
        new loginFrame().setVisible(true);       
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        for (int i = 0; i < SwingUtils.DEFAULT_FONT.length; i++){
//            UIManager.put(DEFAULT_FONT[i],new Font("微软雅黑",Font.PLAIN,14));
//            }   
        }
}
