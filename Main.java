import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;
class Main extends Administrar {
  public static void main  (String[] args){

    crearListaDueños();
    crearMascotas();


    String cedula;

    String nombres;
    String xapellidos;
    String xdireccion;
    String xtelefono;
    String xprovincia;
    String xciudad;
    String xemail;
    String xci;
    


   Scanner sc = new Scanner(System.in);
   Scanner sn = new Scanner(System.in);
   Scanner sd = new Scanner(System.in);
   Scanner se = new Scanner(System.in);
   Scanner sg = new Scanner(System.in);
   Scanner sh = new Scanner(System.in);


    boolean salir=false;
    boolean salir2=false;
    boolean salir3=false;
    boolean salir4=false;
    boolean salir5=false;
    
    int opcion;
    int opcion2;
    int opcion3;
    int opcion4;
    int opcion5;

    String nnombre;
    String napellidos;
    String ndireccion;
    String ntelefono;
    String nomciudad;
    String nprovincia;
    String nemail;
    
     DirigidoAnimal dirigidoAb;
     Auspiciante auspiciante;


    String mainMenu = ("escoge una opcion del  menú: \n" 
            + "1. Administrar concursos\n" 
            + "2. Administrar dueños\n"
            + "3. Administrar mascotas\n" 
            );
    String MenuConcursos = ("escoge una opcion del  menú: \n" 
            + "1. Crear concurso\n" 
            + "2. Inscribir participante\n"
            + "3. Regresar al menú principal\n" 
            );
    String MenuDueños = ("escoge una opcion del  menú: \n" 
            + "1. Crear dueño\n" 
            + "2. Editar dueño\n"
            + "3. Regresar al menú principal\n" 
            );
    String MenuMascotas = ("escoge una opcion del  menú: \n" 
            + "1. Crear mascota\n" 
            + "2. eliminar mascota\n"
            + "3. Regresar al menú principal\n" 
            );
    
    String MenuEditarDueño = ("escoge el area a editar: \n" 
            + "1. Nombres\n" 
            + "2. Apellidos\n"
            + "3. direccion\n" 
            + "4. telefono\n"
            + "5. Ciudad\n "
            + "6. provincia\n"
            + "7. email\n"
            + "8. Salir\n "
            );
   while(!salir){
     salir2=false;
     salir3=false;
     salir4=false;
     
     System.out.println(mainMenu);
     System.out.println("ingrese el numero de la opcion a ejecutar");
     opcion=sc.nextInt();
     switch(opcion){
       
       case 1:
 
      
       while(!salir2){
         //administrar concursos
         System.out.println(MenuConcursos);
          opcion2=sc.nextInt();
          switch(opcion2){
            case 1:
              Scanner sca=new Scanner(System.in);
               System.out.println("Crear concurso");
               System.out.println("Ingresar nombre para concurso");
               String nombreC=sca.nextLine();
               System.out.println("Ingresar fecha del evento");
               String fechaE=sca.nextLine();
               System.out.println("Ingresar hora del evento");
               String horaE=sca.nextLine();
               System.out.println("Ingresar fecha de inicio de inscripcion");
               String fechaII=sca.nextLine();
               System.out.println("Ingresar fecha de cierre de inscripcion");
               String fechaCI=sca.nextLine();
               System.out.println("Ingresar ciudad del evento");
               String ciudadE=sca.nextLine();
               System.out.println("Ingresar provincia del evento");
               String provinciaE=sca.nextLine();
               Ciudad coE=new Ciudad(ciudadE,provinciaE);
               System.out.println("Ingresar lugar del evento");
               String lugarE=sca.nextLine();
               System.out.println("Ingresar premios del evento");
               System.out.println("Los premios tienen auspiciante?");
              //Variable para indicar si el premio tiene auspiciantes y arraylist para guardar los premios
              ArrayList<Premio> premios=new ArrayList<>();
              if (sc.nextBoolean()){
                  System.out.println("Describa los premios para el primer lugar");
                  String premio1=sca.nextLine();
                  Premio p1=new Premio("Primer Lugar",premio1);
                  premios.add(p1);
                  System.out.println("Describa los premios para el segundo lugar");
                  String premio2=sca.nextLine();
                  Premio p2=new Premio("Segundo Lugar",premio2);
                  premios.add(p2);
                  System.out.println("Describa los premios para el tercer lugar");
                  String premio3=sca.nextLine();
                  Premio p3=new Premio("Tercer Lugar",premio3);
                  premios.add(p3);
                  System.out.println("Nombre del auspiciante:");
                  String nAsp=sca.nextLine();
                  System.out.println("Direccion del auspiciante:");
                  String dAsp=sca.nextLine();
                  System.out.println("Telefono del auspiciante:");
                  String tAsp=sca.nextLine();
                  System.out.println("Ciudad del auspiciante:");
                  String cAsp=sca.nextLine();
                  System.out.println("Provincia del auspiciante:");
                  String pAsp=sca.nextLine();
                  System.out.println("Email del auspiciante:");
                  String eAsp=sca.nextLine();
                  System.out.println("WebPage del auspiciante:");
                  String wAsp=sca.nextLine();
                  System.out.println("Codigo del auspiciante:");
                  String codAsp=sca.nextLine();
                  Ciudad ocAsp=new Ciudad(cAsp,pAsp);
                  auspiciante=new Auspiciante(nAsp,dAsp,tAsp,ocAsp,eAsp,wAsp,codAsp);
              System.out.println("Ingresar a que tipo de animal va dirigido");
               String dAnimal=sc.nextLine();
               DirigidoAnimal dirigidoAB= DirigidoAnimal.valueOf(dAnimal.toUpperCase());
               Concurso concurso=new Concurso(nombreC,fechaE,horaE,fechaII,fechaCI,coE,lugarE,premios,auspiciante,dirigidoAB);

               }
               else{
                 System.out.println("Describa los premios para el primer lugar");
                  String premio1=sca.nextLine();
                  Premio p1=new Premio("Primer Lugar",premio1);
                  premios.add(p1);
                  System.out.println("Describa los premios para el segundo lugar");
                  String premio2=sca.nextLine();
                  Premio p2=new Premio("Segundo Lugar",premio2);
                  premios.add(p2);
                  System.out.println("Describa los premios para el tercer lugar");
                  String premio3=sca.nextLine();
                  Premio p3=new Premio("Tercer Lugar",premio3);
                  premios.add(p3);
                   System.out.println("Ingresar a que tipo de animal va dirigido");
               String dAnimal=sc.nextLine();
               DirigidoAnimal dirigidoAB= DirigidoAnimal.valueOf(dAnimal.toUpperCase());
               Concurso concurso=new Concurso(nombreC,fechaE,horaE,fechaII,fechaCI,coE,lugarE,premios,dirigidoAB);
               }
                
              
      
               
  //aqui lo tienes que copiar

              break;
            case 2:
               System.out.println("inscribir");
               break;
            case 3:
               salir2=true;
               salir3=true;
               salir4=true;
               break;
          }
           

       }
       

       case 2:



       while(!salir3){
         //administrar dueños
         mostrarDueños();
         System.out.println(MenuDueños);
         opcion3=sc.nextInt();
         switch(opcion3){
           case 1:
           
             
              System.out.println("crear dueño");
              System.out.println("escriba sus nombres:");
              nombres=sn.nextLine();
              System.out.println("escriba sus apellidos:");
              xapellidos=sn.nextLine();
              System.out.println("escriba su direccion:");
              xdireccion=sn.nextLine();
              System.out.println("escriba su numero de telefono:");
              xtelefono=sn.nextLine();
              System.out.println("escriba el nombre de su provincia:");
              xprovincia=sn.nextLine();
              System.out.println("escriba el nombre de su ciudad:");
              xciudad=sn.nextLine();
              Ciudad c1= new Ciudad(xciudad,xprovincia);
              System.out.println("escriba su email:");
              xemail=sn.nextLine();
              System.out.println("escriba su cedula de identidad:");
              xci=sn.nextLine();
              DueñoDeMascota d1= new DueñoDeMascota(nombres, xdireccion, xtelefono, c1, xemail, xapellidos, xci);
              dueños.add(d1);



              
              break;
           
           case 2:
              
              System.out.println("editar dueño");
              System.out.println("ingrese el numero de cedula:");
              cedula=sd.nextLine();
              
            for (int i = 0; i<dueños.size(); i++){  
              
              if (dueños.get(i).getCI().equals(cedula)) {
               
              
                
                while(!salir5) {

                  System.out.println(MenuEditarDueño);
                  System.out.println(dueños.get(i).toString());
                  
                  
                    opcion5=sh.nextInt();
                    
                    
                    switch(opcion5){
                      case 1:
                         System.out.println("ingrese el nuevo nombre ");
                         nnombre=sd.nextLine();
                         dueños.get(i).setNombre(nnombre);
                         
                         break;
                      case 2:
                         System.out.println("ingrese los nuevos apellidos ");
                         napellidos=sg.nextLine();
                         dueños.get(i).setApellidos(napellidos);
                         break;
                      case 3:
                         System.out.println("ingrese la nueva direccion ");
                         ndireccion=sg.nextLine();
                         dueños.get(i).setDireccion(ndireccion);
                         break;
                      case 4:
                         System.out.println("ingrese el nuevo telefono ");
                         ntelefono=sg.nextLine();
                         dueños.get(i).setTelefono(ntelefono);
                         break;
                      case 5:
                        System.out.println("ingrese el nuevo nombre de la ciudad ");
                        nomciudad=sg.nextLine();
                        dueños.get(i).getCiudad().setNombre(nomciudad);
                        break;   
                      case 6:
                        System.out.println("ingrese el nuevo nombre de la provincia ");
                        nprovincia=sg.nextLine();
                        dueños.get(i).getCiudad().setProvincia(nprovincia);
                        break;   
                      case 7:
                        System.out.println("ingrese el nuevo email ");
                        nemail=sg.nextLine();
                        dueños.get(i).setEmail(nemail);
                        break; 
                      case 8:
                        salir5=true;
                        break;
                      
                      
                         



                         
                      

                    }
                }
              }
                  



                
            }
              
              break;
           case 3:
              
              salir3=true;
              salir2=true;
              salir4=true;
              break;
             

         }

       }

       case 3:
       //administrar mascotas
       while(!salir4){
         mostrarMascotas();
         System.out.println(MenuMascotas);
         opcion4=sc.nextInt();
         switch(opcion4){
           case 1:
              System.out.println("Crear Mascota");
              System.out.println("Escriba el nombre de su mascota: ");
              String nombre=sn.nextLine();
              System.out.println("Escriba si es PERRO o GATO: ");
              String tipo=sn.nextLine();
              TipoAnimal tipoA = TipoAnimal.valueOf(tipo.toUpperCase());
              System.out.println("Escriba la raza: ");
              String raza=sn.nextLine();
              System.out.println("Escriba el año de nacimiento: ");
              String nacimiento=sn.nextLine();
              Mascota m=new Mascota(nombre, tipoA, raza, nacimiento);
              String code= m.generarCodigo(nombre, tipoA, raza, nacimiento); 
              m=new Mascota(nombre, tipoA, raza, nacimiento, code);
              if(eliminadas.contains(m)){
                System.out.println("No se puede volver a registrar");
              }

              else {
                mascotas.add(m);
                System.out.println("Registrado, su código es ");
                System.out.println(m.getCodigo());

              }  

            

           

                         
              break;

           case 2:
              System.out.println("Eliminar Mascota");
              System.out.println("Ingresar código ID: ");
              String id=sn.nextLine();
              for (int i = 0; i<mascotas.size(); i++) {
                if(mascotas.get(i).getCodigo().equals(id)){
                    eliminadas.add(mascotas.get(i));
                    mascotas.remove(i);
                }
                else{
                  System.out.println("Código no existente");
                }
              }
              break;
           case 3:
               salir4=true;
               break;

         }
       }
       
  


     }
   
   }






   
  }
}