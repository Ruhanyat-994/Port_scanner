import socket,sys,pyfiglet

ascii_banner = pyfiglet.figlet_format("RuhanSec\nPort Scanner")
print(ascii_banner)

ip = "{sys.argv[1]}"
open_port = []

ports = range(1,10000)

def probe_port(ip,port,result=1):
    try:
        sock = socket.socket(socket.AF_INET,SOCK_STREAM)
        sock.settimeout(0.5)
        r = sock.connect_ex((ip,port))

        if r == 0:
            result = r
        sock.close()

    except Exception as e:
        pass

    for port in ports:
        sys.stdout.flush()
        response = probe_port(ip,port)
        if response == 0:
            open_port.append(port)

    if open_port:
        print("Open Ports Are:\n++++++++++++++++++++++")
        print(sorted(open_port))
    else:
        print("sorry! no ports are open")