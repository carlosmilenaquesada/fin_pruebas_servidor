package javaapplication145;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPClient;


public class JavaApplication145 {

    public static void main(String[] args) throws ClassNotFoundException {
        FTPClient ftpclien = new FTPClient();
        int puertoSocket = 10000;
        try {
            ServerSocket serverSocket = new ServerSocket(puertoSocket);
            System.out.println("Esperando al cliente...");
            Socket cliente = serverSocket.accept();
            System.out.println("El cliente ha sido aceptado");
            
            while(true){
                ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());
                System.out.println(ois.readObject());
                
                
            }

        } catch (IOException ex) {
            Logger.getLogger(JavaApplication145.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
