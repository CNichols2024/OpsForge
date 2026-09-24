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
        Endpoint pc3 = new Endpoint(
            "DESKTOP-03",
            3,
            45.0,
            false
        );

        ArrayList<Endpoint> computers = new ArrayList<>();
        computers.add(pc1);
        computers.add(pc2);
        computers.add(pc3);
        //System.out.println("Total computer count: " + computers.size());
        
        String target = "DESKTOP-09";
        String separator = "====================";
        
        System.out.println("~~~~~OPS FORGE~~~~~"); //Start of program output
        System.out.println(separator);
        System.out.println("~~~~~HEALTH REPORT~~~~~"); //Start of health report
        System.out.println("Monitored Endpoints: " + computers.size());
        System.out.println(separator);

        findEndpoint(computers, target);
        
            
        for (Endpoint pc : computers) {
            pc.printHealthReport();
            System.out.println(separator);
        }
    } // End main method
    
    // Fixed: Changed to 'static' so it can be called from main, and corrected class scope
    public static void findEndpoint(ArrayList<Endpoint> computers, String target) {
        boolean found = false;
        for (Endpoint pc : computers) {
            if (pc.hostName.equals(target)) {
                pc.printHealthReport();
                found = true;
                break;
            } 
        }
        
        // Fixed: Moved outside the loop so it only prints once if nothing is found
        if (!found) {
            System.out.println("Endpoint not found");
        }
    } // End fndEndpoint()
} // End Public Class Main