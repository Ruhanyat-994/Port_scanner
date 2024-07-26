public class Main {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java Main <IP Address> <Start Port> <End Port>\nExample: java Main 127.0.0.1 80 85");
            return;
        }
        String ipAddress = args[0];
        int startPort = Integer.parseInt(args[1]);
        int endPort = Integer.parseInt(args[2]);

        Portscanner portscanner = new Portscanner(ipAddress,startPort,endPort);
        portscanner.scanPort();

    }
}