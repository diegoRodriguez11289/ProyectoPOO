package modelo;
import java.util.ArrayList;

public class Administrar{
  public static ArrayList<Concurso> concursos;
  public static ArrayList<DueñoDeMascota> dueños;
  public static ArrayList<Mascota> mascotas;
  public static ArrayList<Mascota> eliminadas;

  public static void mostrarDueños(){
    for (int i = 0; i<dueños.size(); i++) {
      System.out.println(dueños.get(i).getNombresApellidos()+"\n");

    }
  } 

  

  public static void crearListaDueños(){
    Ciudad Guayaquil= new Ciudad("Guayaquil","Guayas");
    Ciudad Cuenca= new Ciudad("Cuenca","Azogues");
    Ciudad Quito= new Ciudad("Quito","Pichincha");
    dueños= new ArrayList<>();
    DueñoDeMascota dueño1=new DueñoDeMascota("Diego Adriel","Los olivos","0994047722",Guayaquil,"diadrodr@espol.edu.ec","Rodriguez Flores","0924781081");
    DueñoDeMascota dueño2=new DueñoDeMascota("Pedro Carlos","Mi casa","0993038157",Guayaquil,"carlos2@gmail.com","Rodriguez Serra","0945308110");
    dueños.add(dueño1);
    
  }

   public static void crearMascotas(){
     mascotas= new ArrayList<>();
     eliminadas= new ArrayList<>();
     Mascota mascota1 = new Mascota("Pelusa",TipoAnimal.PERRO,"French Puddle","2001", "PePERROFr2001");
     Mascota mascota2 = new Mascota("Manchas",TipoAnimal.GATO,"Mestizo","2003", "MaGATOMe2003");
     Mascota mascota3 = new Mascota("Pipo",TipoAnimal.PERRO,"Husky","2004", "PiPERROHu2004");
     Mascota mascota4 = new Mascota("Misifu",TipoAnimal.GATO,"Persa","2002", "MiGATOPe2002");
     Mascota mascota5 = new Mascota("Ladrador",TipoAnimal.PERRO,"Labrador","2005", "LaPerroLa2005");
     Mascota mascota6 = new Mascota("Nena",TipoAnimal.GATO,"Persa","2010","NeGATOPe2010");
     Mascota mascota7 = new Mascota("Pilita",TipoAnimal.PERRO,"Labrador","2020","PiPERROLa2020");
     Mascota mascota8 = new Mascota("Michu",TipoAnimal.GATO,"Bengali","2015","MiGATOBe2015");
     Mascota mascota9 = new Mascota("Goofy",TipoAnimal.PERRO,"Chihuahua","2017","GoPERROCh2017");
     Mascota mascota10 = new Mascota("Miau",TipoAnimal.GATO,"Esfinge","2012","MiGATOEs2012");

     mascotas.add(mascota1);
     mascotas.add(mascota2);
     mascotas.add(mascota3);
     mascotas.add(mascota4);
     mascotas.add(mascota5);
     mascotas.add(mascota6);
     mascotas.add(mascota7);
     mascotas.add(mascota8);
     mascotas.add(mascota9);
     mascotas.add(mascota10);
  
  } 

}


