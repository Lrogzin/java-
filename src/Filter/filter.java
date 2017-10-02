package Filter;

//@author 1U02UN

import static com.sun.javafx.util.Utils.split;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class filter {
    //对敏感字符过滤，防止SQL注入
    public static boolean HasInj(String str)
    {
    String inj_str = "'|and|exec|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|;|or|-|+|,";
    String inj_stra[] = split(inj_str,"|");
        for (int i=0 ; i < inj_stra.length ; i++ ){
            if (str.indexOf(inj_stra[i])>=0)
            {
                return true;
            }
        }
    return false;
    }
    
    public static boolean isInt(String s){
         try {  
            return Integer.parseInt(s)>0;  
        } catch (Exception e) {  
            return false;  
        }    
    }
    
    public static boolean isPrice(String s){
         try {  
            return Double.parseDouble(s)*100%1==0;  
        } catch (Exception e) {  
            return false;  
        }    
    }
    
    public static boolean isPhone(String s){
        if(s.length()>=3&&s.length()<=11){
          String phone_str = "[0-9]*";
        Pattern p=Pattern.compile(phone_str);
        Matcher m=p.matcher(s);
        return m.matches();  
        }else{
        return false;
        }  
    }
    
    public static boolean isEmail(String email){  
        boolean isExist = false;  
       
        Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}");  
        Matcher m = p.matcher(email);  
        boolean b = m.matches();  
        if(b) {  
            System.out.println("有效邮件地址");  
            isExist=true;  
        } else {  
            System.out.println("无效邮件地址");  
        }  
        return isExist;  
    }  
/**
 * 正则表达式解释  "\\w+@(\\w+.)+[a-z]{2,3}"
 * 在正则表达式中\w表示任意单个字符范围是a-z,A-Z,0-9,因为在java中\本来就是转义符 
号，如果只写为\w则会发生歧义，甚至错误，因此要写为：\\w 
+的意思就是出现一次以上，所以\\w+就代表任意长度的字符串，但不包括其他特殊字符 
，如_,-,$,&,*等

@必须出现，而且只准出现一次，因此直接写成@就行了 

\\w+.任意字符串后面加上DOT，大家都知道这是域名的特点，另外就是我写成了 
(\\w+.)+，为什么呢，因为邮件服务器有可能是二级域名，三级域名，或者…… 
如果不带()+的话，abc@sina.com有效，而abc@mail.sina.com就是无效的了，因此这个 
是必须的。 

最后是[a-z]{2,3}，考虑到一般的域名最后不会出现数字，大写也很少见（我想一般应 
该忽略大小写的），并且最少不少于两位，如cn,us,等，最多不超过三位，如com,org, 
等，所以就写成了如上形式
* */
}
