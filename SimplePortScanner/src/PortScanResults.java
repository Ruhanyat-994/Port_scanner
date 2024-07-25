public class PortScanResults {

    private int port;
    private boolean isOpen; // If tru then open if false then closed

    public PortScanResults(int port, boolean isOpen) {
        this.port = port;
        this.isOpen = isOpen;
    }
    public int getPort(){
        return port;
    }
    public boolean isOpen(){
        return isOpen;
    }

    @Override
    public String toString() {
        return "PortScanResults{" + "port=" + port + ", isOpen=" + isOpen + '}';
    }
}
