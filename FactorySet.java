import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ivette Cardona 16020
 * @author Alejandro 
 */

public class FactorySet <E> {
	/**
	 * @param entry: se envia como parametro lo que el usuario escriba en el principal
	 * @return Set
	 */
	public Set<E> getSet(String entry){
		//En caso de que el usuario desee implementar el TreeSet
		if (entry.equals("TS")){
			//System.out.println("Entro TS");
			return new TreeSet<E>();
		}
		//En caso de que el usuario desee implementar HashSet
		else if (entry.equals("HS")){
			//System.out.println("Entro HS");
			return new HashSet<E>();
		}
		//En caso de que el usuario desee implementar el LinkedHashSet
		else if (entry.equals("LHS")){
			//System.out.println("Entro LHS");
			return new LinkedHashSet<E>();
		}
		//Si no es ninguna de las anteriores, que no regrese nada
		else
			return null;
		}
}
