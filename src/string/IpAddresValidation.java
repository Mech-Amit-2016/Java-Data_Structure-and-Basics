package string;
import java.util.Arrays;

public class IpAddresValidation {

    public static void main(String[] args) {
        String s = "123.4.23a.135";
        s=s.trim().replace(".", "!");
        System.out.println(s);
        String []strings=s.split("!");
        System.out.println(Arrays.toString(strings));
         for(String string:strings){
             try{
             int n=Integer.parseInt(string);
             if(0>n || n>256){
             System.out.println("Not Ip Address");
             return;
              }
             }
             catch(Exception ex){
                 System.out.println("Not Ip Address, "+ex.getMessage());
                 return;
             }
         }
            System.out.println("IP Address");
//        String s1="Apple",s2="Apple";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        s1="" + s1;
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
        

    }
}

