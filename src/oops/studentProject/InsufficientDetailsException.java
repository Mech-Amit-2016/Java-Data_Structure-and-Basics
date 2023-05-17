
package oops.studentProject;

public class InsufficientDetailsException extends Exception {
    InsufficientDetailsException(){
        super("invalid mane,please enter minimum two character");
    }
    InsufficientDetailsException(int marks){
        super("invalid mark "+marks+" please enter between 0 and 100");
    }
    InsufficientDetailsException(String message){
        super(message);
    }

}
