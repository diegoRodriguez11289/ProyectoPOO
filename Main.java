import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;
class Main extends Administrar {
  public static void main  (String[] args){

    crearListaDueños();

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
               System.out.println("crear concurso");
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
         System.out.println(MenuMascotas);
         opcion4=sc.nextInt();
         mascotas= new ArrayList<>();
         eliminadas= new ArrayList<>();
         switch(opcion4){
           case 1:
              Administrar.crearMascotas();
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
              mascotas.add(m);
              System.out.println("Registrado, su código es ");
              System.out.println(m.getCodigo());
                         
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