package modelo;
import java.util.ArrayList;
public class Mascota{
  private String nombre;
  private TipoAnimal tipo;
  private  String raza;
  private String foto;
  private String nacimiento;
  
  public Mascota(String n, TipoAnimal t, String r, String na){
    nombre=n;
    tipo=t;
    raza=r;
    nacimiento=na;
  }
}
  
