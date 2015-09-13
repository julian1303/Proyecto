
package trotadorafitnes;

import trotadorafitnes.NewJFrame;

public class Entrenamiento extends Thread{
    
    private NewJFrame frame;
    private int seg;
    private int min;
    private int hora;
  
    public Entrenamiento( NewJFrame frame){
        this.frame=frame;
        seg = frame.getSeg();
        min = frame.getMin();
        hora = frame.getHora();       
    }
    @Override
    
    public void run() {
        
        for (; ;){
            if (seg!=59){
                seg=frame.aumentSeg();
                frame.imprimirTiempo(hora, min, seg);
            }else{
                 seg=0;
                 frame.resetSeg();
                 if(min!=59){            
                    min=frame.aumentMin();
                 }
                 else{
                    hora=frame.aumentHora();
                    min=0;
                    frame.resetMin();
                 }           
            }
             try {
                sleep(999);
                
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            if(!frame.isContinuar()){
                try {
                    synchronized(this){
                       this.wait(); 
                    } 
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }    
        }       
    }    
    
    public void seguir(){
        synchronized(this){
            notifyAll();
        }
    }   
}
