import java.util.Set;


public class ConjuntosDesarrolladores<E> {
	private Set<E> DesJava;
	private Set<E> DesiOS;
	private Set<E> DesAndroid;
	
	
	public ConjuntosDesarrolladores(String entry){
		FactorySet sfactory = new FactorySet();
		DesJava = sfactory.getSet(entry);
		DesAndroid = sfactory.getSet(entry);
		DesiOS = sfactory.getSet(entry);
		}
	
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
	
}
