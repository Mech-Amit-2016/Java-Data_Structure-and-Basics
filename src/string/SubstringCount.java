
package string;
import java.util.HashSet;

public class SubstringCount {
    public static void main(String[] args) {
        String s="aabab";
        int k=2;
        int count=0;
//        System.out.println(s.substring(0,1));
        HashSet<String> set=new HashSet<>();
//        for(int i=0;i<k-2;i++)
//            set.add(s.substring(i, i+1));
//       for(int i=k-1;i<s.length();i++){
//           set.add(s.substring(k-1,k));
//           if(set.size()==k-1)
//               count++;
//           set.remove(set.);
//       }
//        System.out.println(count);
            set.add("a");
            set.add("abc");
            set.add("ad");
        System.out.println(set);
    }
}
