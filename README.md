# MULTITHREADED-CHAT-APPLICATION

COMPANY:CODETECH IT SOLUTIONS

NAME:PANDRINKI GNANESWARI

INTERN ID:CTIS2947

DOMAIN:JAVA PROGRAMMING

DURATION:4 WEEKS

MENTOR:NEELA SANTHOSH


DESCRIPTION:Multithreaded Chat Application using Java (Client and Server)

This project is a Multithreaded Chat Application developed using Core Java, Socket Programming, and Multithreading concepts. The application demonstrates real-time communication between multiple clients and a 

central server using a client-server architecture. It is designed to help students and beginners understand how network-based applications work and how Java handles concurrent connections efficiently.

Server Side Description

The server component of the application acts as the central communication hub. It listens on a specific port for incoming client connections and manages multiple clients simultaneously. The server uses the 

ServerSocket class to bind to a port and wait for connection requests. When a client connects, the server accepts the connection and creates a new socket dedicated to that client.

To support multiple clients at the same time, the server uses multithreading. Each connected client is handled by a separate thread. This ensures that one client’s communication does not block or interrupt 

others. The server thread continuously listens for messages from its assigned client. When a message is received, the server can process it and forward it to other connected clients, enabling group chat 

functionality.

The server maintains a collection of active client connections. This allows it to broadcast messages received from one client to all other connected clients. Input and output streams are used to read messages 

from clients and send responses back. Proper synchronization techniques can be applied to avoid conflicts when multiple threads access shared resources such as the client list.

Exception handling plays an important role on the server side. Network operations such as accepting connections, reading data, and writing data are prone to runtime errors. The server code handles these 

exceptions gracefully, ensuring stability even if a client disconnects unexpectedly. This makes the server robust and reliable for long-running communication sessions.

Client Side Description

The client component allows users to connect to the chat server and participate in real-time messaging. The client establishes a socket connection using the server’s address (such as localhost) and a predefined 

port number. Once connected, the client can send messages to the server and receive messages from other clients through the server.

The client uses input and output streams for communication. Messages typed by the user in the console are sent to the server using a PrintWriter. Incoming messages from the server are read using a BufferedReader. 

To enable simultaneous sending and receiving of messages, the client application uses multithreading.

A dedicated background thread continuously listens for messages from the server and displays them on the console as soon as they arrive. At the same time, the main thread waits for user input and sends messages 

to the server. This design ensures smooth and uninterrupted communication, providing a real-time chat experience.

The client also includes exception handling to manage scenarios such as server unavailability, network failures, or abrupt disconnections. This prevents the application from crashing and improves the user 

experience.

Learning Outcomes and Use Cases

This project helps learners understand key concepts such as socket programming, multithreading, client-server architecture, and real-time data exchange. These concepts are widely used in real-world applications 

such as instant messaging platforms, online collaboration tools, multiplayer games, and distributed systems.

The application can be extended with additional features like usernames, authentication, private messaging, message timestamps, graphical user interfaces, and encryption for secure communication. Such 

enhancements make the project more realistic and suitable for advanced learning.

Overall, this Multithreaded Chat Application provides a strong foundation for building network-based applications in Java. By working on both the client and server sides, developers gain practical experience in 

handling concurrent users and designing efficient communication systems.

OUTPUT:

<img width="1439" height="123" alt="Image" src="https://github.com/user-attachments/assets/80397fe7-0b24-4986-a2de-d5f95d0b2299" />

