package modelo;

public  class Persona{
  public String nombre;
  public String direccion;
  public String telefono;
  public Ciudad ciudad;
  public String email;

  public Persona(String n,String d,String t, Ciudad c,String e){
    nombre=n;
    direccion=d;
    telefono=t;
    ciudad=c;
    email=e;
  }

  public Ciudad getCiudad(){
    return ciudad;
  }

  public void  setNombre(String nom){
    nombre=nom;
    
  }

  public void setDireccion(String dir){
    direccion=dir;

  }

  public void setTelefono(String tel){
    telefono=tel;
  }

  public void setEmail(String em){
    email=em;
  }

  public void setCiudad(Ciudad ciu){
    ciudad=ciu;
  }

  public String toString(){
    return "nombres: "+nombre+", Direccion:"+direccion+", telefono: "+telefono+ciudad.toString()+", email: "+email;
  }

  


 
  
}