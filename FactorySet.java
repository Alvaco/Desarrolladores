import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ivette Cardona 16020
 * @author Alejandro Vásquez 09284
 */

public class FactorySet <E> {
	/**
	 * @param entry
	 * @return Set
	 */
	public Set<E> getSet(String entry){
		if (entry.equals("TS")){
			//System.out.println("Entro TS");
			return new TreeSet<E>();
		}
		else if (entry.equals("HS")){
			//System.out.println("Entro HS");
			return new HashSet<E>();
		}
		
		else if (entry.equals("LHS")){
			//System.out.println("Entro LHS");
			return new LinkedHashSet<E>();
		}
		else
			return null;
		}
}
