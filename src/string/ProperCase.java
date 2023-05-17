 package string;

public class ProperCase {

    public static void main(String[] args) {
        String s = " mAhenDer SIngH Dhoni".trim().toLowerCase();
//            System.out.println(s);
        String[] strings = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            str[i]=str[i].toLowerCase();
//            System.out.println(str[i]);
//            System.out.println(str[i].length());
////            String st=str[i].substring(0,1);
        int n = strings.length;
//        System.out.println(n);
        String result="";
        for (int i = 0; i <= n - 1; i++) {
            String part = strings[i];
//            System.out.println(part);
            String first = part.substring(0, 1).toUpperCase();
            String last = part.substring(1);
            String total=first+last;
            result=result+" "+total;
//            System.out.println(first + "" + last);
        }
        System.out.println(result);
    }

}
