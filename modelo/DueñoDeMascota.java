package modelo;
public class DueñoDeMascota extends Persona{
  private String apellidos;
  private String ci;

  public DueñoDeMascota(String n,String d,String t, Ciudad c,String e,String a,String ci){
    super(n,d,t,c,e);
    apellidos=a;
    this.ci=ci;
  }
}