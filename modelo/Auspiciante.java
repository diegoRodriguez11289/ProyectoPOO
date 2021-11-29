package modelo;
public class Auspiciante extends Persona{  
  private String webpage;
  private String codigo;

  public Auspiciante(String n,String d,String t, Ciudad c,String e, String w){
    super(n,d,t,c,e);
    webpage=w;
  }


}