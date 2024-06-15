# File-Transfer-System using socket programming in java

This system involves two applications: a client and a server. The client initiates a connection to the server and sends a file. The server receives the file, saves it locally, and can then send a different file back to the client if desired.

Components:

Client:
1. Establishes a socket connection to the server on a specific port.
2. Opens the file to be sent.
3. Reads the file content in chunks and sends them over the socket to the server.
4. Closes the socket connection after sending the complete file.
5. Can wait for a response from the server.

Server:
1. Listens for incoming connections on a specific port.
2. Once a client connects, accepts the connection and establishes a socket.
3. Opens a file for writing (based on filename received from client or pre-determined).
4. Receives the file data sent by the client in chunks.
5. Writes the received data to the opened file.
6. Closes the socket connection after receiving the entire file.
7. Can send a different file back to the client using the established connection.
