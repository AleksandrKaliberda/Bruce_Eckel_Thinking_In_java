package _09_interfaces._267_interfaces.behavior;

//If Interface GoBehavior is not public, it cannot be accesses from outside package
//For example in package _09_interfaces._267_interfaces.human;
//interface GoBehavior {
public interface GoBehavior {

       //Fields in interface are static and final by default, so, must be initialized
       //String x;//NOT OK
       //Compile-time constant:
       String TEST = "STATIC FINAL TEST";//OK, as it static and final, and must be initialized

       //Modifier 'private' is not allowed here
       //private String go();

       //Modifier 'protected' is not allowed here
       //protected String go();

      //Methods in interface is public by default, even if you not write 'public'
      String go();
}
