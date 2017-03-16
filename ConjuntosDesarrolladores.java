import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class ConjuntosDesarrolladores<E> {
	private Set<E> DesJava;
	private Set<E> DesiOS;
	private Set<E> DesAndroid;
	
	//Constructor
	public ConjuntosDesarrolladores(String entry){
		FactorySet sfactory = new FactorySet();
		DesJava = sfactory.getSet(entry);
		DesAndroid = sfactory.getSet(entry);
		DesiOS = sfactory.getSet(entry);
		}
	
	//Se guarda el nombre ingresado por el usuario en el main, dependiendo del conjunto de desarrolladores
	/**
	 * @param seleccion
	 * @param name
	 */
	public void agregarDesarrollador(int seleccion, E name){
		if (seleccion == 1)
			DesJava.add(name);
		else if (seleccion == 2)
			DesAndroid.add(name);
		else if (seleccion == 3)
			DesiOS.add(name);
		else if (seleccion == 4){
			DesJava.add(name);
			DesAndroid.add(name);
		}
		else if (seleccion == 5){
			DesJava.add(name);
			DesiOS.add(name);
		}
		else if (seleccion == 6){
			DesAndroid.add(name);
			DesiOS.add(name);
		}
		else if (seleccion == 7){
			DesAndroid.add(name);
			DesiOS.add(name);
			DesJava.add(name);
		}
	}
	
	//Desarrolladores con experiencia en Java, Android y iOS
	/**
	 * @return desTodo: interseccion
	 */
	public Set<E> expEnLosTres(){
		Set<E> desTodo = DesJava;
		desTodo.retainAll(DesAndroid);
		desTodo.retainAll(DesiOS);
		return desTodo;
	}

	/**
	 * @return Desarrolladores con experiencia en Java pero que no tengan experiencia en Android
	 */
	public Set<E> expJavaNoAndroid(){
		Set<E> desJavaNoAndroid = DesJava;
		desJavaNoAndroid.removeAll(DesAndroid);
		return desJavaNoAndroid;
	}
	
	/**
	 * @return Desarrolladores con experiencia en Android y iOS pero que no tengan experiencia en Java
	 */
	public Set<E> expiOSandAndroid(){
		Set<E> desiOSandAndroid = DesiOS;
		desiOSandAndroid.retainAll(DesAndroid);
		desiOSandAndroid.removeAll(DesJava);
		return desiOSandAndroid;
	}

	/**
	 * @return Desarrolladores con experiencia en Android o iOS pero que no tengan experiencia en Java
	 */
	public Set<E> expiOSorAndroid(){
		Set<E> desiOSorAndroid = DesiOS;
		desiOSorAndroid.addAll(DesAndroid);
		desiOSorAndroid.removeAll(DesJava);
		return desiOSorAndroid;
	}
	
	/**
	 * @return conjunto de desarrolladores Java es un subconjunto de Desarrolladores Android
	 */
	public String javaSubConjAndroid(){
		if(DesAndroid.containsAll(DesJava)== true)
			return "Si";
		else
			return "No";
	}
	
	/**
	 * @return El conjunto que tenga la cantidad más grande de desarrolladores (con nombres)
	 */
	public Iterator<E> nombresConjuntoMayor(){
		int a = DesJava.size();
		int b = DesiOS.size();
		int c = DesAndroid.size();
		if(a>b && a>c)
			return DesJava.iterator();
		else if (b>a && b>c)
			return DesiOS.iterator();
		else if (c>a && b>c)
			return DesAndroid.iterator();
		else
			return null;
		}
	
	//Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en orden ascendente
	public void ordenAscendente(){
		Set<String> orden = new TreeSet<String>();
		
		int androides = DesAndroid.size();
		int javades = DesJava.size();
		int iosdes = DesiOS.size();
		
		if(androides > javades && javades >= iosdes || iosdes >= javades){
			for(E element: DesAndroid){
				orden.add((String) element);
			}
		}
		else if(javades > androides && androides >= iosdes || iosdes >= androides){
			for(E element: DesJava){
				orden.add((String) element);
			}
		}
		else if(iosdes > androides && androides >= javades || javades >= androides){
			for(E element: DesiOS){
				orden.add((String) element);
			}
		}
		System.out.println("Orden ascendente del grupo de desarrolladores con mas datos: ");
		System.out.println(orden);
	}			
}
