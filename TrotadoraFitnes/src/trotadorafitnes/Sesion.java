
package trotadorafitnes;
import javax.swing.JOptionPane;

public class Sesion {
    
    
       
        public static void OnOff(String estado){

            int horas = 0,minutos = 0,segundos = 0;

            while(estado.equals("on")){

                for(minutos=0; minutos<60; minutos++){            
                    for (segundos=0; segundos<60; segundos++){
                        System.out.println(horas+":"+minutos+":"+segundos);
                        delaySegundo();
                    }            
                }
            horas+=1;
            }
        }

        private static void delaySegundo(){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    
}
    
    

