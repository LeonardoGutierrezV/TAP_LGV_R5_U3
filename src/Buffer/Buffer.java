/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buffer;

/**
 *
 * @author Leonardo Gutierrez
 */
public class Buffer {
    private int contador;
    
    public Buffer(int contador){
        this.contador=contador;
    }
    
    public int obtenContador(){
        return this.contador;
    }
    
    public void asignaContador(int contador ){
        this.contador = contador;
    }
        
    public /*synchronized*/ void agregar(int cantidad){
        try{
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println(e);
        }
        this.contador += cantidad;
    }
    
    public /*synchronized*/ void remover (int cantidad){
        try{
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println(e);
        }
        this.contador -= cantidad;        
    }
}
