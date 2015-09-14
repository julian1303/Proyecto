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
public class Usuario {
    
    int IdUsuaurio;
    String Nombre;
    String sexo;
    int peso;
    int edad;

    public void usuarioM(){
        this.sexo="masculino";
        this.peso=75;
        this.edad=20;
    }
    public void usuarioF(){
        this.sexo="femenino";
        this.peso=60;
        this.edad=20;
    }

    public int getIdUsuaurio() {
        return IdUsuaurio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setIdUsuaurio(int IdUsuaurio) {
        this.IdUsuaurio = IdUsuaurio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
