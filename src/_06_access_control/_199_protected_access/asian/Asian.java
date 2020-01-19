package _06_access_control._199_protected_access.asian;

import _06_access_control._199_protected_access.european.European;
import _06_access_control._199_protected_access.human.Human;

public class Asian extends Human {

    //Even Asian is in another package
    //Human's method humanEating() is available in Asian, because it's protected level abd extends Human
    protected String asianEating(){
        return humanEating() + "By chopsticks. ";
    }

    public static void main(String[] args) {
        Asian asian = new Asian();
        System.out.println(asian.asianEating());

    }
}
