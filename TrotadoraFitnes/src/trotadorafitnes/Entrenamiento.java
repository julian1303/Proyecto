
package trotadorafitnes;

import trotadorafitnes.NewJFrame;

public class Entrenamiento extends Thread{
    
    private NewJFrame frame;
    private int seg;
    private int min;
    private int hora;
    double caloriasPorMinuto=0;
    double caloriasTotales=0;
    double distanciaRecorridaS=0;
    double distanciaRecorridaM=0;
    double distanciaRecorridaTotal=0;
    
    
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
                frame.imprimirVelocidad();
                frame.imprimirInclinacion();
                frame.imprimirTiempo(hora, min, seg);
                distanciaRecorridaS=frame.estad.distanciaRecorrida(frame.km, seg);
                distanciaRecorridaTotal=distanciaRecorridaM+distanciaRecorridaS;
                frame.imprimirDistacia(distanciaRecorridaTotal);
                
            }else{
                 seg=0;
                 frame.resetSeg();
                 distanciaRecorridaM+=distanciaRecorridaS;
                 if(min!=59){            
                    min=frame.aumentMin();
                    caloriasPorMinuto=frame.estad.calculoDeCalorias(frame.user.getSexo(), frame.user.getPeso(), frame.user.getEdad(), frame.km, frame.gr);
                    caloriasTotales+=caloriasPorMinuto;
                    frame.imprimirCalorias(caloriasTotales);
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
