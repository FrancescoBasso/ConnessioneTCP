/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connessionetcp;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;

/**
 *
 * @author franc
 */
public class ConnessioneTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
           int port =2000;
    
        int time =5000;
    
    ServerSocket sSocket = null;
    
    Socket socket = null;
    
    
    
        try {
            //1) apertura porta
            // il server si mette in ascolto
            sSocket = new ServerSocket(port);
            System.out.println("in attesa di connessione");
            //2)
           
            socket = sSocket.accept();
            System.out.println("Server connesso con il client"+ socket.getRemoteSocketAddress());
            
            socket.getInputStream();
            socket.getOutputStream();
            //3
        } catch (BindException ex) {
            System.err.println("Server già avviato");
            Logger.getLogger(ConnessioneTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
             try {
                 //4)CHiusura socket
                if (socket != null){
                    socket.close();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(ConnessioneTCP.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
     
    }
    
}
