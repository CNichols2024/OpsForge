//Single Line Comment
/*Multi Line Comment */

import java.util.ArrayList;
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
        Endpoint pc3 = new Endpoint (
            "DESKTOP-03",
            3,
            45.0,
            false
        );

        ArrayList<Endpoint> computers = new ArrayList<>();
        computers.add(pc1);
        computers.add(pc2);
        computers.add(pc3);
        System.out.println(computers.size());

        String separator =  "====================";
        System.out.println("~~~~~OPS FORGE~~~~~"); //Start of program output
        System.out.println(separator);
        System.out.println("~~~~~HEALTH REPORT~~~~~"); //Start of health report
        System.out.println("Monitored Endpoints: " + computers.size());
        for (Endpoint pc : computers) {
            pc.printHealthReport();
        }
    }
    
    

        
    }



 //End Public Class Main




