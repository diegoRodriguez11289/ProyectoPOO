package modelo;
import java.util.ArrayList;
public class Mascota{
  private String nombre;
  private TipoAnimal tipo;
  private String raza;
  private String foto;
  private String nacimiento;
  
  public Mascota(String n, TipoAnimal t, String r, String na){
    nombre=n;
    tipo=t;
    raza=r;
    nacimiento=na;
  }

   public void setNombre(String n) {
       nombre = n;
    }

    public void setTipo(TipoAnimal t) {
        tipo = t;
    }

    public void setRaza(String r) {
        raza = r;
    }

    public void setFoto(String f) {
        foto = f;
    }

    public void setNacimiento(String na) {
        nacimiento = na;
    }

    public void generarCodigo(String n, TipoAnimal t, String r, String na) {
      String n1=n.substring(0,2);
      String r1=r.substring(0,2);
      System.out.print(n1+t+r1+na);
    }

    

    



    
  
}
  
