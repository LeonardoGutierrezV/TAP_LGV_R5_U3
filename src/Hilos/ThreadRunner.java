/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
import Concurrente.Runner;
import Buffer.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Leonardo Gutierrez Velez
 */
public class ThreadRunner implements Runnable {
    private Buffer buffer;
    javax.swing.JTextArea outList;
    Runner runner;
    /**
     *
     * @param buffer
     */
    public ThreadRunner(Buffer buffer, Runner runner, javax.swing.JTextArea outList ){
        this.buffer = buffer;
        this.outList = outList;
        this.runner = runner;
    }

    @Override
    public void run() {        
        try {
            Thread.sleep( (this.runner.getSpeed()*1000) );
            outList.append(String.valueOf(outList.getLineCount() )+" - "+  runner.getName()+" Tiempo: "+ this.runner.getSpeed()+" segundos  \n" );
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
