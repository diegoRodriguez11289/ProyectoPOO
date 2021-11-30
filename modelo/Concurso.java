package modelo;
import java.util.ArrayList;
public class Concurso{
  private String nombre;
  private String fecha;
  private String hora;
  private String fechaInicio;
  private String fechaCierre;
  private Ciudad ciudad;
  private String lugar;
  private ArrayList<Premio> premios;
  private Auspiciante auspiciante;
  private DirigidoAnimal dirigidoA;

 public Concurso(String nombre, String fecha, String hora, String fechaInicio, String fechaCierre, Ciudad ciudad, String lugar, ArrayList<Premio> premios, DirigidoAnimal dirigidoA) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.dirigidoA = dirigidoA;
  }

 public Concurso(String nombre, String fecha, String hora, String fechaInicio, String fechaCierre, Ciudad ciudad, String lugar, ArrayList<Premio> premios, Auspiciante auspiciante, DirigidoAnimal dirigidoA) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.auspiciante = auspiciante;
        this.dirigidoA = dirigidoA;
  }

   public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


    public Auspiciante getAuspiciante() {
        return auspiciante;
    }

    public void setAuspiciante(Auspiciante auspiciante) {
        this.auspiciante = auspiciante;
    }

    public DirigidoAnimal getDirigidoA() {
        return dirigidoA;
    }

    public void setDirigidoA(DirigidoAnimal dirigidoA) {
        this.dirigidoA = dirigidoA;
}
}