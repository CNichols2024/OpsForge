//Single Line Comment
/*Multi Line
Comment */


public class Main {
    public static void main(String[] args) {
        String hostname = "Desktop-01";
        int uptimeDays = 3;
        double diskUsage = 45;
        boolean domainConnected = false;
        
        System.out.println("~~~~~OPS FORGE~~~~~"); //Start of program output
        String diskStatus = checkDiskHealth(diskUsage);
        String uptimeStatus = checkUptime(uptimeDays);
        String domainStatus = domaincheck(domainConnected);
        
        System.out.println("~~~~~HEALTH REPORT~~~~~"); //Start of health report
        System.out.println("Overall Health Status: " + overallHealthStatus(diskStatus, uptimeStatus, domainStatus));
        System.out.println("Hostname: " + hostname);
        System.out.println("Uptime: " + uptimeStatus);
        System.out.println("Disk Usage: " + diskStatus);
        System.out.println("Domain Connected: " + domainStatus);

        
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



} //End Public Class Main




