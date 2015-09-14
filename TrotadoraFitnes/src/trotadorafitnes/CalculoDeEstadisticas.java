/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trotadorafitnes;

/**
 *
 * @author Julian Garcia
 */
public class CalculoDeEstadisticas {
    double calorias;
    
    
    public double calculoDeCalorias(String sexo,int peso , int edad,double v,double I){
        
        double k,cv = 0,ci = 0;
        
        if(sexo.equals("masculino")){
        k=10+10*((30-edad)/10)+10*(peso/100);
        k=k+(k*0.1);
        cv=k*(1+((v-5)/10));
        ci=k*(I/12);
        }
        else{
        k=10+10*((30-edad)/10)+10*(peso/100);
        cv=k*(1+((v-5)/10));
        ci=k*(I/12);   
        }
        this.calorias=cv+ci;
        
        return calorias;
    }
    public double distanciaRecorrida(double v,int seg){
        
        double d;
        d=(v*0.2777)*seg;
               
        return d;
    }
    
}
