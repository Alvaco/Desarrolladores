import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;




public class FactorySet <E> {
	public Set<E> getSet(String entry){
		if (entry.equals("TS"))
			return new TreeSet<E>();
		
		else if (entry.equals("HS"))
			return new HashSet<E>();
		
		else
			return new LinkedHashSet<E>();
		}
}
