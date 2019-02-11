package appstacks.vpn.core.event;

public class TrafficStats {
    private String receiveTraffic;
    private String sendTraffic;
    private String diffReceive;
    private String diffSend;

    public TrafficStats(String receiveTraffic, String sendTraffic, String diffReceive, String diffSend) {
        this.receiveTraffic = receiveTraffic;
        this.sendTraffic = sendTraffic;
        this.diffReceive = diffReceive;
        this.diffSend = diffSend;
    }

    public String getReceiveTraffic() {
        return receiveTraffic;
    }

    public String getSendTraffic() {
        return sendTraffic;
    }

    public String getDiffReceive() {
        return diffReceive;
    }

    public String getDiffSend() {
        return diffSend;
    }

    @Override
    public String toString() {
        return "TrafficStats{" +
                "receiveTraffic='" + receiveTraffic + '\'' +
                ", sendTraffic='" + sendTraffic + '\'' +
                ", diffReceive='" + diffReceive + '\'' +
                ", diffSend='" + diffSend + '\'' +
                '}';
    }
}
