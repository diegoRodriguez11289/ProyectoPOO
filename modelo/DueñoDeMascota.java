package modelo;
public class DueñoDeMascota extends Persona{
  private String apellidos;
  private String ci;

  public DueñoDeMascota(String n,String d,String t, Ciudad c,String e,String a,String ci){
    super(n,d,t,c,e);
    apellidos=a;
    this.ci=ci;
  }

  public String getNombresApellidos(){
    return nombre +" "+ apellidos;
  }

  public String getCI(){
    return ci;
  }
  
  

  public void setApellidos(String ap){
    apellidos=ap;

  }

  public String toString(){
    return super.toString()+", apellidos: "+apellidos+", cedula: "+ ci;

  }

  

}