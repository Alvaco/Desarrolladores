import java.util.Scanner;

public class PrincipalDesa {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int seleccion = -1; 
		 try{
			 //Guarda el nombre del usuario 
			 System.out.println("Escribe tu nombre: ");
			 String nombre = sc.nextLine();
			
			 //Menu para elegir en que conjunto de desarrolladores guardarlo
			 System.out.println("Elige opción:\n1.- Desarrolladores Java" +
						"\n2.- Desarroladores Android\n" +
						"3.- Desarrolladores iOS\n" +
						"0.- Salir");
				//Obtener la respuesta del usuario
				seleccion = Integer.parseInt(sc.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(seleccion){
				case 1: 
					//El usuario eligio entrar en el grupo de Desarrolladores Java
					break;
				case 2: 
					//El usuario eligio entrar en el grupo de Desarrolladores Android
					break;
				case 3: 
					//El usuario eligio entrar en el grupo de Desarrolladores iOS
					break;
				case 0: 
					//El usuario eligio salir 
					System.out.println("Gracias");
					break;
				default:
					//El usuario eligio un numero erroneo
					System.out.println("Número no reconocido");
					System.out.println("Elige opción:\n1.- Desarrolladores Java" +
							"\n2.- Desarroladores Android\n" +
							"3.- Desarrolladores iOS\n" +
							"0.- Salir");
					//Obtener la respuesta del usuario
					seleccion = Integer.parseInt(sc.nextLine());
				}
				
				System.out.println("\n"); //Espacio
				
			}catch(Exception e){
				System.out.println("Error");
			}
		 }
}
