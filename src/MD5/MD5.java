package MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Archer on 2016/6/5.
 */
public class MD5 {

    public static void main(String[] args)  {
        String password="123456dsfgAASAS..-*/123";

        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] digest = instance.digest(password.getBytes());

            StringBuilder sb=new StringBuilder();
       for (byte b:digest){
           int i=b&0xff;
           String hexString = Integer.toHexString(i);
           //转为16进制，获取低八位
//           System.out.println(hexString);
           if(hexString.length()<2){

               hexString="0"+hexString;

           }
           sb.append(hexString);
       }
            System.out.println(sb.toString());
            System.out.println(sb.toString().length());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
