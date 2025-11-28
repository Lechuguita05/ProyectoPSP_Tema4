/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Diurno
 */
public class HiloServ1 extends Thread{
    BufferedReader fentrada;
    PrintWriter fsalida;
    ServerSocket socket = null;
    Socket caballoConectado = null;
    JOptionPane panelPop;

    public HiloServ1(ServerSocket s, JOptionPane p) {
        socket = s;
        panelPop = p;
    }
    
    @Override
    public void run() {
        
        try {
            caballoConectado = new Socket();
            caballoConectado = socket.accept();
            System.out.println("Caballo conectado.\nHost: " + caballoConectado.getInetAddress() + "\n");
            String linea = "";
            
            while (!linea.trim().equals(" *")) {                
                panelPop.setMessage("SE HA CONECTADO EL JUGADOR " + socket.toString());
                linea = fentrada.readLine();
                fsalida.println(linea.trim().toUpperCase());
            }
            System.out.println("FIN CON: " + socket.toString());
            fsalida.close();
            fentrada.close();
            socket.close();
        
        } catch (IOException ex) {
            System.err.println("Error de Entrada o Salida");
        }
        
    }
    
}
