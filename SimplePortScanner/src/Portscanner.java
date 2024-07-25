import java.net.Socket;

public class Portscanner {

    private String ipAddress;
    private int startPort;
    private  int endPort;

    public Portscanner(String ipAddress, int startPort, int endPort) {
        this.ipAddress = ipAddress;
        this.startPort = startPort;
        this.endPort = endPort;
    }
    public PortScanResults scanPort(int port){
        try (Socket socket = new Socket(ipAddress,port)){
            return new PortScanResults(port,true);
        }
        catch (Exception e){
            return new PortScanResults(port,false);

        }


    }
    public void scanPort(){
        for(int port = startPort ; port <= endPort;port++){
            PortScanResults results = scanPort(port);
            System.out.println(results);
        }

    }
}
