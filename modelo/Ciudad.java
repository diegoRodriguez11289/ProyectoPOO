package modelo;
public class Ciudad{
  private String nombre;
  private String provincia;

  public Ciudad(String n, String p){
    nombre=n;
    provincia=p;
  }

  public String getNomCiudad(){
    return nombre;
  }

  public String getNomProvincia(){
    return provincia;
  }

   public void setNombre(String n) {
        nombre = n;
    }

    public void setProvincia(String p) {
        provincia = p;
    }

  public String toString(){
    return ", ciudad: "+nombre+", Provincia: "+provincia;
  }

}
