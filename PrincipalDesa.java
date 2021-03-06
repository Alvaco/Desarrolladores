import java.util.Scanner;

/**
 * @author Ivette Cardona 16020
 * @author Alejandro Vásquez 09284
 */

public class PrincipalDesa {
	/**
	 * @param args
	 */
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String entrada;
		entrada = null;
		int bandera = 1;
		int eleccion = -1; 
		int seleccion = -1; 
		int inciso = 0;
		int decision = -1;
		 
		try{
			 //Bienvenida
			 System.out.println("Bienvenido");
			 System.out.println("Instrucciones: por favor solo ingrese el entero correspondiente"
			 		+ " a la accion que desee realizar");
			 
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
			 
			 ConjuntosDesarrolladores misDesarrolladores = new ConjuntosDesarrolladores(entrada);
			 //FactorySet miFactory = new FactorySet(entrada);
			 
			 while (bandera == 1){
				//Menu para el usuario
				 System.out.println("Qué desea hacer? :\n1.- Guardar un nombre" +
							"\n2.- Ver incisos\n" +
							"3.- Salir");
				//Obtener la respuesta del usuario
				decision = Integer.parseInt(sc.nextLine()); 
		
				//Switch para las diferentes opciones
				switch(decision){
				case 1: 
					//El usuario eligio guardar su nombre
					System.out.println("Escribe el nombre: ");
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
			
						//Switch para las diferentes opciones
						switch(seleccion){
						case 1: 
							//El usuario eligio entrar en el grupo de Desarrolladores Java
							misDesarrolladores.agregarDesarrollador(1, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 2: 
							//El usuario eligio entrar en el grupo de Desarrolladores Android
							misDesarrolladores.agregarDesarrollador(2, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 3: 
							//El usuario eligio entrar en el grupo de Desarrolladores iOS
							misDesarrolladores.agregarDesarrollador(3, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 4: 
							//El usuario eligio entrar en el grupo de Desarrolladores Java y Android
							misDesarrolladores.agregarDesarrollador(4, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 5: 
							//El usuario eligio entrar en el grupo de Desarrolladores Java y iOS
							misDesarrolladores.agregarDesarrollador(5, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 6: 
							//El usuario eligio entrar en el grupo de Desarrolladores Android y iOS
							misDesarrolladores.agregarDesarrollador(6, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 7: 
							//El usuario eligio entrar en el grupo de Desarrolladores Java, Android y iOS
							misDesarrolladores.agregarDesarrollador(7, nombre);
							System.out.println(nombre + " se ha agregado satisfactoriamente al grupo de desarrolladores");
							break;
						case 0: 
							//El usuario eligio salir
							System.out.println("Gracias");
							bandera = -2;
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
						break;
						
				case 2: 
					//El usuario eligio ver incisos
					System.out.println("Elija inciso que quiera corroborar:" +
							"\n1.- Inciso 1. Desarrolladores con experiencia en Java, Android y iOS" +
							"\n2.- Inciso 2. Desarrolladores con experiencia en Java pero que no tengan experiencia en Android\n" +
							"3.- Inciso 3. Desarrolladores con experiencia en Android y iOS pero que no tengan experiencia en Java \n" +
							"4.- Inciso 4. Desarrolladores con experiencia en Android o iOS pero que no tengan experiencia en Java\n" +
							"5.- Inciso 5. Determinar si el conjunto de desarrolladores Java es un subconjunto de Desarrolladores Android\n" +
							"6.- Inciso 6. El conjunto que tenga la cantidad más grande de desarrolladores (con nombres)\n" +
							"7.- Inciso 7. Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en orden ascendente\n" +
							"0.- Salir");
						//Obtener la respuesta del usuario
						inciso = Integer.parseInt(sc.nextLine()); 
					
						//Ejemplo de switch case en Java
						switch(inciso){
						case 1: 
							//El usuario eligio el inciso 1
							System.out.println(misDesarrolladores.expEnLosTres());
							break;
						case 2: 
							//El usuario eligio el inciso 2
							System.out.println(misDesarrolladores.expJavaNoAndroid());
							break;
						case 3: 
							//El usuario eligio el inciso 3
							System.out.println(misDesarrolladores.expiOSandAndroid());
							break;
						case 4: 
							//El usuario eligio el inciso 4
							System.out.println(misDesarrolladores.expiOSorAndroid());
							break;
						case 5: 
							//El usuario eligio el inciso 5
							System.out.println(misDesarrolladores.javaSubConjAndroid());
							break;
						case 6: 
							//El usuario eligio el inciso 6
							System.out.println(misDesarrolladores.nombresConjuntoMayor());
							break;
						case 7: 
							//El usuario eligio el inciso 7
							//Corregir esto
							misDesarrolladores.ordenAscendente();
							System.out.println();
							break;
						case 0: 
							//El usuario eligio salir 
							System.out.println("Gracias");
							bandera = -2;
							break;
						default:
							//El usuario eligio un numero erroneo
							System.out.println("Número no reconocido");
							//Vuelve a darle al usuario el menu
							System.out.println("Elija inciso que quiera corroborar:\n1.- Inciso 1" +
											"\n2.- Inciso 2\n" +
											"3.- Inciso 3\n" +
											"4.- Inciso 4\n" +
											"5.- Inciso 5\n" +
											"6.- Inciso 6\n" +
											"7.- Inciso 7\n" +
											"0.- Salir");
							//Obtener la respuesta del usuario
							inciso = Integer.parseInt(sc.nextLine()); 
						}
					break;
				case 3: 
					//El usuario eligio salir
					System.out.println("Gracias");
					bandera = -2;
					break;	
				}
			 }
				System.out.println("\n"); //Espacio
				
			}catch(Exception e){
				//Mensaje de Error
				System.out.println("Error");
			}
		 }
}
