//Single Line Comment
/*Multi Line
Comment */


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
        System.out.println("~~~~~OPS FORGE~~~~~"); //Start of program output
        System.out.println("====================");

        System.out.println("~~~~~HEALTH REPORT~~~~~"); //Start of health report
        printHealthReport(pc1);
        printHealthReport(pc2);
        
        

    } //end main()

    public static String overallHealthStatus(String diskStatus, String uptimeStatus, String domainStatus) {
            if (diskStatus.equals("CRITICAL") || uptimeStatus.equals("CRITICAL") || domainStatus.equals("CRITICAL")) {
                return "CRITICAL";
            } else if (diskStatus.equals("WARNING") || uptimeStatus.equals("WARNING") || domainStatus.equals("WARNING")) {
                return "WARNING";
            } else {
                return "HEALTHY";
            }
        }
                

    public static String checkDiskHealth(double diskUsage) {
        if (diskUsage >= 90) {
            return "CRITICAL";
            } else if (diskUsage >=80) {
                return "WARNING";
            } else {
           return "HEALTHY";
            } 
        } //End checkDiskHealth()

    public static String checkUptime(int uptimeDays) {
        if (uptimeDays <= 7) {
            return "HEALTHY";
        } else if(uptimeDays > 14) {
            return "CRITICAL";
        } else {
            return "WARNING";
        }
    }//End checkUptime

    public static String domaincheck(boolean domainConnected) {
        if (domainConnected) {
            return "HEALTHY";
    } else {
            return "CRITICAL";
    }

    } //End Domain Check

    public static void printHealthReport(Endpoint pc) {
        String diskStatus = checkDiskHealth(pc.diskUsage);
        String uptimeStatus = checkUptime(pc.uptimeDays);
        String domainStatus = domaincheck(pc.domainConnected);
        String overallStatus = overallHealthStatus(
            diskStatus, 
            uptimeStatus, 
            domainStatus
        );

        System.out.println(pc.hostName); //First host
        System.out.println("Status: " + overallStatus);
        System.out.println("Uptime: " + uptimeStatus);
        System.out.println("Disk Status: " + diskStatus);
        System.out.println("Domain: " + domainStatus);
    }

} //End Public Class Main




