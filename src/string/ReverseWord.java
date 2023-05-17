
package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str="this is Shivank",str1="";
        String []string=str.split(" ");
        for(String s:string){
            str1=s+" "+str1;
        }
        System.out.println(str1);
    }
    
}
