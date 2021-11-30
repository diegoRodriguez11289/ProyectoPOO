package modelo;
import java.util.ArrayList;

public class Administrar{
  public static ArrayList<Concurso> concursos;
  public static ArrayList<DueñoDeMascota> dueños;
  public static ArrayList<Mascota> mascotas;

  public static void mostrarDueños(){
    for (int i = 0; i<dueños.size(); i++) {
      System.out.println(dueños.get(i).getNombresApellidos()+"\n");

    }
  } 

  

  public static void crearListaDueños(){
    Ciudad Guayaquil= new Ciudad("Guayaquil","Guayas");
    dueños= new ArrayList<>();
    DueñoDeMascota dueño1=new DueñoDeMascota("Diego Adriel","Los olivos","0994047722",Guayaquil,"diadrodr@espol.edu.ec","Rodriguez Flores","0924781081");
    dueños.add(dueño1);
    
  }

  public static void mostrarMascotas(){
  
  } 

  public static void crearMascotas(){
  
  } 

}


