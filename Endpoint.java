public class Endpoint {
    String hostName;
    int uptimeDays;
    double diskUsage;
    boolean domainConnected;
    String separator =  "====================";

    public Endpoint(String hostName, int uptimeDays, double diskUsage, boolean domainConnected) {
        this.hostName = hostName;
        this.uptimeDays = uptimeDays;
        this.diskUsage = diskUsage;
        this.domainConnected = domainConnected;
    }

    public void printHealthReport() {
        System.out.println("Hostname: " + this.hostName);
        String diskStatus = checkDiskHealth(this.diskUsage);
        String uptimeStatus = checkUptime(this.uptimeDays);
        String domainStatus = domaincheck(this.domainConnected);
        String overallStatus = overallHealthStatus(
            diskStatus, 
            uptimeStatus, 
            domainStatus
        );
        
        System.out.println("Overall Status: " + overallStatus);
        System.out.println(this.hostName); //First host
        System.out.println("Uptime: " + uptimeStatus);
        System.out.println("Disk Status: " + diskStatus);
        System.out.println("Domain: " + domainStatus);
        System.out.println(separator);
    } //end printHealthReport()

    public String overallHealthStatus(String diskStatus, String uptimeStatus, String domainStatus) {
        if (diskStatus.equals("CRITICAL") || uptimeStatus.equals("CRITICAL") || domainStatus.equals("CRITICAL")) {
            return "CRITICAL";
        } else if (diskStatus.equals("WARNING") || uptimeStatus.equals("WARNING") || domainStatus.equals("WARNING")) {
            return "WARNING";
        } else {
            return "HEALTHY";
        }
    } //End overallHealthStatus()
                
    public String checkDiskHealth(double diskUsage) {
        if (diskUsage >= 90) {
            return "CRITICAL";
        } else if (diskUsage >= 80) {
            return "WARNING";
        } else {
            return "HEALTHY";
        } 
    } //End checkDiskHealth()

    public String checkUptime(int uptimeDays) {
        if (uptimeDays <= 7) {
            return "HEALTHY";
        } else if (uptimeDays > 14) {
            return "CRITICAL";
        } else {
            return "WARNING";
        }
    }//End checkUptime()

    public String domaincheck(boolean domainConnected) {
        if (domainConnected) {
            return "HEALTHY";
        } else {
            return "CRITICAL";
        }
    } //End domaincheck()
     
} //End public class Endpoint