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
public class EjemploExtremadura {

    // private static Provincia[] provincias = new Provincia[2];
    public static ArrayList<Provincia> provincias = new ArrayList<Provincia>();

    public static void rellenarDatos() {

        /* //DE UNA MANERA
        provincias[0]=new Provincia();
        provincias[0].setNombre("Badajoz");
        provincias[0].setExtension(21766);
        provincias[1]=new Provincia();
        provincias[1].setNombre("Cáceres");
        provincias[1].setExtension(19868);*/
 /* //DE OTRA MANERA
           Provincia p;  
           p= new Provincia();
           p.setNombre("Badajoz");
           p.setExtension(21766);
           p= new Provincia();
           p.setNombre("Caceres");
           p.setExtension(19868);*/
 /* Localidad localidad;
           for (int p=0;p<provincias.length;p++){
               for(int lo=0;lo<300;lo++){
                localidad=new Localidad();
               
                localidad.setNombre("Cachorrilla"+lo);
                localidad.setHabitantes(lo+p);
                localidad.setExtension(1000);
                
                provincias[p].anadirLocalidad(localidad);           
                }

           }*/
        //EJEMPLO CON ARRAYLIST:
        // Introducimos los datos de provincias, como solo son dos se hace de una en una:
        Provincia p = new Provincia();
        p.setNombre("Badajoz");
        p.setExtension(21766);
        provincias.add(p);

        p = new Provincia();
        p.setNombre("Caceres");
        p.setExtension(19868);
        provincias.add(p);

        // Introducimos las localidades
        Localidad loc;
        ArrayList<Localidad> aux1 = new ArrayList<Localidad>();
        ArrayList<Localidad> aux2 = new ArrayList<Localidad>();
        for (int i = 0; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("Medellín " + i);
            loc.setHabitantes(150 + (i * 2));
            loc.setExtension(100 * i);
            aux1.add(loc);

            loc = new Localidad();
            loc.setNombre("Plasencia " + i);
            loc.setHabitantes(50 + (i * 2));
            loc.setExtension(80 * i);
            aux2.add(loc);

            //provincias.get(0).addLocalidad(loc);
        }
        provincias.get(0).setLocalidades(aux1);
        provincias.get(1).setLocalidades(aux2);
        // get(0) es solo para añadir localidades a badajoz
    }

    public static void ejercicio01() {
        // Mostrar nombre de provincias
        /*// DE UNA MANERA
           System.out.println(provincias[0].getNombre());
           System.out.println(provincias[1].getNombre());
         */
 /* // DE OTRA MANERA
        for(int i=0;i<provincias.length;i++){
               System.out.println(provincias[i].getNombre());
           }*/

 // CON ARRAY LIST DE DOS MANERAS
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
        }
        /* IMPORTANTE; ESTO ES LO MISMO QUE LO DE ARRIBA:
        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
        }
        */
    }

    public static void ejercicio02() {
        // Mostrar nombre de las localidades.

        /* for(int i=0;i<provincias.length;i++){
                System.out.println(provincias[i].getNombre());
                for(int j=0;j<provincias[i].getNum_localidades();j++){
                    System.out.println(provincias[i].getLocalidades()[j].getNombre());
                }
            }*/
        
        // CON ARRAYLIST
        /*for (int i = 0; i < provincias.size(); i++) {
            for (int j = 0; j < provincias.get(i).getLocalidades().size(); j++) {
                System.out.println(provincias.get(i).getLocalidades().get(j).getNombre());
            }
        }*/
        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
            for (Localidad l : p.getLocalidades()) {
                System.out.println(l.getNombre());
            }
        }

    }

    public static void ejercicio03() {
        // Mostrar número de habitantes por provincia.
        /*
           // Mostrar el número total de habitantes de Extremadura
           int total=0;
            for(int i=0;i<provincias.length;i++){
                for(int j=0;j<provincias[i].getNum_localidades();j++){
                    total=total+provincias[i].getLocalidades()[j].getHabitantes();
                }
            }
            System.out.println("Total de habitantes "+total);
         */

 /* int total=0;
          for(int i=0;i<provincias.length;i++){
                 System.out.println(provincias[i].getNombre());
                for(int j=0;j<provincias[i].getNum_localidades();j++){
                    total=total+provincias[i].getLocalidades()[j].getHabitantes();
                }
                System.out.println("Total de habitantes "+total);
                total=0;
            }*/
        int total=0;
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
            int contador=0;
            for (int j = 0; j < provincias.get(i).getLocalidades().size(); j++) {
                contador=contador+(provincias.get(i).getLocalidades().get(j).getHabitantes());
                total=total+(provincias.get(i).getLocalidades().get(j).getHabitantes());
                
            }
            System.out.println(contador);
        }
        System.out.println("Total Extremadura "+total);
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        rellenarDatos();

       // ejercicio01();

        ejercicio02();
        
        //ejercicio03();
    }

}
