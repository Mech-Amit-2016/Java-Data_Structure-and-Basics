package string;

public class SentenceToInitials {

    public static void main(String[] args) {
        String s = "Mahendra Singh Dhoni";
        String[] strings = s.split(" ");
        int n = strings.length;
        for (String st : strings) {
            System.out.println(st);
        }
        String result = "";
        for (int i = 0; i <= strings.length - 2; i++) {
            result = result + strings[i].substring(0, 1);
        }
        result = result + " " + strings[n - 1];
        System.out.println(result);
    }
}
