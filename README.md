# Port Scanner

## Overview

This is a simple port scanner written in Java. It scans a range of ports on a specified IP address to determine if each port is open or closed. The scanner uses basic socket connections to check port availability and outputs the results to the console.

## Features

- Scans a specified range of ports on a given IP address.
- Prints out whether each port is open or closed.

## Project Structure

The project consists of the following files:

- `Main.java`: The entry point of the application. It parses command-line arguments and initiates the port scanning process.
- `PortScanner.java`: Contains the logic for scanning ports on the specified IP address.
- `PortScanResult.java`: Represents the result of a port scan, indicating whether a port is open or closed.

## Usage

To use the port scanner, follow these steps:

### Prerequisites

Ensure you have Java Development Kit (JDK) installed on your system.

### Compilation

Navigate to the `SimplePortScanner` directory where the `.java` files are located and compile the code:

```bash
javac *.java
```

### Running the Application

Run the compiled `Main` class with the following command:

```bash
java Main <IP Address> <Start Port> <End Port>
```

Replace `<IP Address>`, `<Start Port>`, and `<End Port>` with the IP address you want to scan and the port range you wish to check.

#### Example

To scan ports 80 to 85 on the local machine, use:

```bash
java Main 127.0.0.1 80 85
```

## Code Details

- **PortScanResult.java**: This class stores the port number and whether the port is open.
- **PortScanner.java**: This class performs the port scanning. It attempts to open a socket to each port in the specified range and determines if the port is open.
- **Main.java**: This class processes command-line arguments and invokes the port scanning functionality.

## Contact

For any questions or comments, feel free to contact me at [alruhanyat994@gmail.com].

