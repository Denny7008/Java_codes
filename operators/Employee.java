public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String args[]) {
       
        /* int age = 35.5;
           System.out.println(age); */
         
        // error: incompatible types: possible lossy conversion from double to int

        // We can avoid this error using Narrowing casting

        double age = 35.5;
        int myAge = (int)age;
        System.out.println(myAge);
        System.out.println("Successfully Started");
    }
}
 

