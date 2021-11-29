import modelo.*;
import java.util.Scanner;
class Main extends Administrar {
  public static void main  (String[] args){


   Scanner sc = new Scanner(System.in);
    boolean salir=false;
    boolean salir2=false;
    boolean salir3=false;
    boolean salir4=false;
    int opcion;
    int opcion2;
    int opcion3;
    int opcion4;

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
         System.out.println(MenuDueños);
         opcion3=sc.nextInt();
         switch(opcion3){
           case 1:
              System.out.println("crear dueño");
              break;
           case 2:
              System.out.println("editar dueño");
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
         switch(opcion4){
           case 1:
              System.out.println("crear mascota");
              break;
           case 2:
              System.out.println("eliminar mascota");
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