/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connessionetcp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author franc
 */
public class Client {
      int port =2000;
        Socket socket = null;
        
         
          try {
              //richiesta connessione al server

              socket = new Socket("127.0.0.1",port);
              System.out.println("Server connesso con il client"+ socket.getRemoteSocketAddress());
             System.out.println("porta client"+ socket.getLocalPort());
          } catch (IOException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          }
             
        }
        
