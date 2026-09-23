

public class Endpoint {
    String hostName;
    int uptimeDays;
    double diskUsage;
    boolean domainConnected;

    
    public Endpoint(String hostName, int uptimeDays, double diskUsage, boolean domainConnected) {
        this.hostName = hostName;
        this.uptimeDays = uptimeDays;
        this.diskUsage = diskUsage;
        this.domainConnected = domainConnected;
    }
}
