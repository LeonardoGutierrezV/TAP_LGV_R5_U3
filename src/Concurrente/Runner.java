/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrente;
import Buffer.Buffer;
import Hilos.ThreadRunner;

/**
 *
 * @author Leonardo Gutierrez Velez
 */
public class Runner {
    private String name;
    private int speed;
    private ThreadRunner theRunner;
    private Thread theTread;
        
    public String getName(){
        return this.name;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setName(String name){   
        this.name = name;
        this.speed= (int)(Math.random()*30);        
    }
    
    public Runner (String name){
        this.name = name;
        this.speed= (int)(Math.random()*30);
    }
    
    public void theRunner(Buffer buffer, javax.swing.JTextArea outList ){
         this.theRunner = new ThreadRunner (buffer,this, outList ) ;  
         this.theTread = new Thread(theRunner);
         System.out.println("Hilo nuevo");
    }
    
    public void runForestRun(){
        this.theTread.start();
    }
    
}
