import java.util.Iterator;
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
	
	public Set<E> expEnLosTres(){
		Set<E> desTodo = DesJava;
		desTodo.retainAll(DesAndroid);
		desTodo.retainAll(DesiOS);
		return desTodo;
	}
	
	public Set<E> expJavaNoAndroid(){
		Set<E> desJavaNoAndroid = DesJava;
		desJavaNoAndroid.removeAll(DesAndroid);
		return desJavaNoAndroid;
	}
	
	public Set<E> expiOSandAndroid(){
		Set<E> desiOSandAndroid = DesiOS;
		desiOSandAndroid.retainAll(DesAndroid);
		desiOSandAndroid.removeAll(DesJava);
		return desiOSandAndroid;
	}
	
	public Set<E> expiOSorAndroid(){
		Set<E> desiOSorAndroid = DesiOS;
		desiOSorAndroid.addAll(DesAndroid);
		desiOSorAndroid.removeAll(DesJava);
		return desiOSorAndroid;
	}
	
	public String javaSubConjAndroid(){
		if(DesAndroid.containsAll(DesJava)== true)
			return "Si";
		else
			return "No";
	}
	
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
	
	public void ordenAscendente(){
		Set<String> setMasGrande = null;
		
		/*
		int a = DesJava.size();
		int b = DesiOS.size();
		int c = DesAndroid.size();
		if(a>b && a>c)
			setMasGrande = (Set<String>) DesJava.iterator();
		else if (b>a && b>c)
			setMasGrande = (Set<String>) DesiOS.iterator();
		else if (c>a && b>c)
			setMasGrande = (Set<String>) DesAndroid.iterator();
		else
			setMasGrande = null;
			*/
		if (DesAndroid.size() > DesJava.size() && DesAndroid.size() > DesiOS.size()){
			setMasGrande = (Set<String>) DesAndroid;
		}else if (DesJava.size() > DesAndroid.size() && DesJava.size() > DesiOS.size()){
			setMasGrande = (Set<String>) DesJava;
		}else if (DesiOS.size() > DesAndroid.size() && DesiOS.size() > DesJava.size()){
			setMasGrande = (Set<String>) DesiOS;
		}
		
		if(setMasGrande != null){
			Iterator<String> itr = setMasGrande.iterator();
			Object[] desarrolladores = new Object[setMasGrande.size()];
			int contador = 0;
			while (itr.hasNext()){
				Object element = itr.next();
				desarrolladores[contador] = element;
				contador++;
			}
			System.out.println("Los nombres de los desarrolladores del conjunto mas en orden ascendente son:");
			for (int i = desarrolladores.length-1; i > -1 ; i--){
				System.out.println(desarrolladores[i]);
			}
		}

	}
		
	
}
