//Single Line Comment
/*Multi Line Comment */


public class Main {
    
    public static void main(String[] args) {
        
        
        Endpoint pc1 = new Endpoint(
            "DESKTOP-01",
            14,
            89.9,
            true
        );
        Endpoint pc2 = new Endpoint(
            "DESKTOP-02",
            3,
            45.0,
            false
        );
        String separator =  "====================";
        System.out.println("~~~~~OPS FORGE~~~~~"); //Start of program output
        System.out.println(separator);
        System.out.println("~~~~~HEALTH REPORT~~~~~"); //Start of health report
        pc1.printHealthReport();
        pc2.printHealthReport();
    }
    
    

        
    }



 //End Public Class Main




