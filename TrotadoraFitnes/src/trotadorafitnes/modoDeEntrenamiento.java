
package trotadorafitnes;

import javax.swing.JOptionPane;
/**
 *
 * @author carpe
 */
public class modoDeEntrenamiento {

    private String nombre;
    private int NV, vel, incl;
    


    public void Modo(String nombre) {

        switch (nombre) {
            case "modo1": {
                NV = 5;
                vel = 6; // km/h
                incl = 10; // grados
                
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                
                break;
            }
            case "modo2": {
                nombre = "mode 2";
                NV = 6;
                vel = 8; // km/s
                incl = 10; // grados
                
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);            
                break;
            }
            case "modo3": {
                nombre = "mode 3";
                NV = 7;
                vel = 10; // km/s
                incl = 5; // grados
                
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo4": {
                nombre = "mode 4";
                NV = 8;
                vel = 10; // km/s
                incl = 10; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo5": {
                nombre = "mode 5";
                NV = 10;
                vel = 8; // km/s
                incl = 10; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo6": {
                nombre = "mode 6";
                NV = 13;
                vel = 8; // km/s
                incl = 10; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo7": {
                nombre = "mode 7";
                NV = 15;
                vel = 8; // km/s
                incl = 10; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo8": {
                nombre = "mode 8";
                NV = 18;
                vel = 8; // km/s
                incl = 10; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo9": {
                nombre = "mode 9";
                NV = 20;
                vel = 8; // km/s
                incl = 5; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo10": {
                nombre = "mode 10";
                NV = 22;
                vel = 8; // km/s
                incl = 0; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo11": {
                nombre = "mode 11";
                NV = 6;
                vel = 12; // km/s
                incl = 30; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            case "modo12": {
                nombre = "mode 12";
                NV = 8;
                vel = 15; // km/s
                incl = 10; // grados
                setNombre(nombre);
                setNV(NV);
                setVel(vel);
                setIncl(incl);                  
                break;
            }
            
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNV(int NV) {
        this.NV = NV;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public void setIncl(int incl) {
        this.incl = incl;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getNV() {
        return NV;
    }

    public int getVel() {
        return vel;
    }

    public int getIncl() {
        return incl;
    }
    
    public void setModoLibre(){
        JOptionPane.showMessageDialog(null, "digite los valores  a modificar");
        NV = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero de vueltas"));
        vel= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite vel"));
        incl= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Inclinacion"));
         System.out.println("Numero de vueltas:" + NV
                        + "\nVelocidad" + vel + "\n Inclinación" + incl);
        
    }
    
}

