package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMaps {
  public static void main(String[] args) {
	Map<Integer, String> departments= new HashMap<>();
	departments.put(100, "Sales");
	departments.put(110, "Marketing");
	departments.put(120, "It");
	departments.put(200, "Finance");
	
	System.out.println(departments.size());
	System.out.println(departments.get(110));
	
	departments.remove(200);
	System.out.println(departments);
	
	Set<Integer> keys=departments.keySet();
	System.out.println(keys);
	
	Collection<String> values=departments.values();
	System.out.println(values);
	
	List <Map<String,String>> rows=new ArrayList<>();
	
	Map<String,String>rowData=new HashMap<>();
	rowData.put("Region_id", "2342");
	rowData.put("Region_name", "America");
	
	
	
	
	for (Map.Entry<Integer, String> dep : departments.entrySet()) {
		System.out.println(dep.getKey());
		System.out.println(dep.getValue());;
		
	}
  }
}
