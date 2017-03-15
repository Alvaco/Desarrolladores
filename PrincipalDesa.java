import java.util.Scanner;

/**
 * @author Ivette Cardona 16020
 * @author Alejandro 
 */

public class PrincipalDesa {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String entrada;
		entrada = null;
		int bandera = 1;
		int eleccion = -1; 
		int seleccion = -1; 
		 
		try{
			 //Bienvenida
			 System.out.println("Bienvenido");
			 
			 //Elegir que Set 
			 System.out.println("Elige que deseas usar:\n1.- TreeSet" +
						"\n2.- HashSet\n" +
						"3.- LinkedHashSet\n" +
						"0.- Salir");
			 //Se guarda el valor
			 eleccion = Integer.parseInt(sc.nextLine()); 
			 
			 switch(eleccion){
				case 1: 
					//El usuario eligio TreeSet
					 entrada = "TS";
					 bandera = 1;
					 break;
				case 2: 
					//El usuario eligio HashSet
					entrada = "HS";
					bandera = 1;
					break;
				case 3: 
					//El usuario eligio LinkedHashSet 
					entrada = "LHS";
					bandera = 1;
					break;
				case 0: 
					//El usuario eligio salir 
					System.out.println("Gracias");
					bandera = 0;
					break;
				default:
					//El usuario eligio un numero erroneo
					System.out.println("Número no reconocido");
					//Vuelve a darle al usuario el menu
					 System.out.println("Elige que deseas usar:\n1.- TreeSet" +
								"\n2.- Desarroladores HashSet\n" +
								"3.- Desarrolladores LinkedHashSet\n" +
								"0.- Salir");
					 //Se guarda el valor
					 eleccion = Integer.parseInt(sc.nextLine()); 
			 }
			 
			 //ConjuntosDesarrolladores misDesarrolladores = new ConjuntosDesarrolladores(entrada);
			 //FactorySet miFactory = new FactorySet(entrada);
			 
			 if (bandera == 1){
				 //Guarda el nombre del usuario 
				 System.out.println("Escribe tu nombre: ");
				 String nombre = sc.nextLine();
				
				 //Menu para elegir en que conjunto de desarrolladores guardarlo
				 System.out.println("Elige opción:\n1.- Desarrolladores Java" +
							"\n2.- Desarroladores Android\n" +
							"3.- Desarrolladores iOS\n" +
							"4.- Desarroladores Java y Android\n" +
							"5.- Desarrolladores Java y iOS\n" +
							"6.- Desarrolladores Android y iOs\n" +
							"7.- Desarrolladores Java, Android y iOS\n" +
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
					case 4: 
						//El usuario eligio entrar en el grupo de Desarrolladores Java y Android
						break;
					case 5: 
						//El usuario eligio entrar en el grupo de Desarrolladores Java y iOS
						break;
					case 6: 
						//El usuario eligio entrar en el grupo de Desarrolladores Android y iOS
						break;
					case 7: 
						//El usuario eligio entrar en el grupo de Desarrolladores Java, Android y iOS
						break;
					case 0: 
						//El usuario eligio salir 
						System.out.println("Gracias");
						break;
					default:
						//El usuario eligio un numero erroneo
						System.out.println("Número no reconocido");
						//Vuelve a darle al usuario el menu
						System.out.println("Elige opción:\n1.- Desarrolladores Java" +
								"\n2.- Desarroladores Android\n" +
								"3.- Desarrolladores iOS\n" +
								"4.- Desarroladores Java y Android\n" +
								"5.- Desarrolladores Java y iOS\n" +
								"6.- Desarrolladores Android y iOs\n" +
								"7.- Desarrolladores Java, Android y iOS\n" +
								"0.- Salir");
						//Obtener la respuesta del usuario
						seleccion = Integer.parseInt(sc.nextLine());
					}
			 }
				
				System.out.println("\n"); //Espacio
				
			}catch(Exception e){
				//Mensaje de Error
				System.out.println("Error");
			}
		 }
}
