/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.io.*;
import java.net.*;
/**
 *
 * @author a1562339
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        
        Socket clientSocket = new Socket();
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader InFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        sentence = inFromUser.readLine();
        outToServer.writeBytes(sentence /*+*/ );
        modifiedSentence = InFromServer.readLine();
        
        System.out.println(modifiedSentence);
        clientSocket.close();
    }
    
}
