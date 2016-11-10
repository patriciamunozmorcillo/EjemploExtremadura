/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploextremadura;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Provincia {
    private String nombre;
    private double extension;
   // private Localidad [] localidades = new Localidad[300];
   // YA NO ME HACE FALTA PARA EL ARRAYLIST private int num_localidades=0;
    
    private ArrayList<Localidad> localidades=new ArrayList<Localidad>();
    

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public Localidad[] getLocalidades() {
        return localidades;
    }

    public void setLocalidades(Localidad[] localidades) {
        this.localidades = localidades;
    }*/

   /* public int getNum_localidades() {
        return num_localidades;
    }

    public void setNum_localidades(int num_localidades) {
        this.num_localidades = num_localidades;
    }*/
    
    /* // YA NO ME HACE FALTA EN EL ARRAYLIST PK TENGO LA FUNCIÓN ADD
    public void anadirLocalidad(Localidad loc){ // recibir una localidad por parametros y la va a poner en el vector de localidad
        if (num_localidades<localidades.length){
            localidades[num_localidades]=loc;
            num_localidades++;
        }
    }
*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public ArrayList<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(ArrayList<Localidad> localidades) {
        this.localidades = localidades;
    }
    
    // Para la segunda manera de añadir  localidades.
    // si usas: provincias.get(0).addLocalidad(loc);
    public void addLocalidad(Localidad localidad){
        this.localidades.add(localidad);
    }
}
