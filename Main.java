//Single Line Comment
/*Multi Line
Comment */


public class Main {
    public static void main(String[] args) {
        String hostname = "Desktop-01";
        int uptimeDays = 14;
        double diskUsage = 89.9;
        boolean domainConnected = false;
        

        System.out.println("~~~~~OPS FORGE~~~~~"); //Start of program output
        checkDiskHealth(diskUsage);
        checkUptime(uptimeDays);
        domaincheck(domainConnected);
        

        
        System.out.println("~~~~~HEALTH REPORT~~~~~"); //Start of health report
        System.out.println("Hostname: " + hostname);
        System.out.println("Uptime: " + uptimeDays + " days");
        System.out.println("Disk Usage: " + diskUsage + "%");
        System.out.println("Domain Connected: " + domainConnected);
    } //end main()

    public static void checkDiskHealth(double diskUsage) {
        if (diskUsage >= 90) {
            System.out.println("Disk: CRITICAL!");
            } else if (diskUsage >=80) {
                System.out.println("Disk: Warning!");
            } else {
            System.out.println("Disk: Healthy");
            } 
        } //End checkDiskHealth()

    public static void checkUptime(int uptimeDays) {
        if (uptimeDays <= 7) {
            System.out.println("Uptime: Healthy");
        } else if(uptimeDays > 14) {
            System.out.println("Uptime: CRITICAL");
        } else {
            System.out.println("Uptime: Warning!");
        }
    }//End checkUptime

    public static void domaincheck(boolean domainConnected) {
        if (domainConnected) {
            System.out.println("Domain: Connected");
    } else {
            System.out.println("Domain: Not Connected");
    }

    }



} //End Public Class Main




