package loops.forloop;

public class ForLoop {

    /*
    Initialize
    Condition
    Body
    Incr/decr
    condition
    
    
    
    
    
     */
    static int i;
static void initialize() {
        i = 1;
        System.out.println("Initialize");
    }
    static boolean condition() {
        System.out.println("Condition");
    return i<=3;
    }
    static void body() {
        
        System.out.println("Body " + i);
        
    }
    static void incr() {
        i++;
        System.out.println("Increment");
    }

    public static void main(String[] args) {
        for (initialize(); condition(); incr()) {
            body();
        }
    }

}
