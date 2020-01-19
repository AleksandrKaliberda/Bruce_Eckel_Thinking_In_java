package _06_access_control._199_protected_access.european;

import _06_access_control._199_protected_access.asian.Asian;
import _06_access_control._199_protected_access.human.Human;

public class European extends Human {

    protected String europeanEating(){

        //Human's method humanEating() is available in European, because it's protected level abd extends Human
        return humanEating() + "By spoon. ";
    }

    public static void main(String[] args) {

        European european = new European();
        System.out.println(european.europeanEating());
    }
}