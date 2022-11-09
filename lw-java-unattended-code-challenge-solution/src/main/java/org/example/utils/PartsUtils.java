package org.example.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.example.model.Part;

public class PartsUtils {


/**
 * This method is used to get the total weight of parts
 * @param parts list of parts used to calculate the weight
 * @return
 */
	public static double getTotalWeight(List<Part> parts) {
		double totalPrice = 0.0;

		for (Part item : parts) {
			totalPrice += item.getWeight();
		}

		return totalPrice;
	}

/**
 * This method used to append part name and weight for each of the part in the list into a string builder
 * @param list list of parts  
 * @param total 
 * @return
 */
	public static String toList(List<Part> parts) {
		StringBuilder b = new StringBuilder();
		
		//Using of LinkedHasMap to reserve the insertion order
		Map<Part, List<Part>> map = new LinkedHashMap<Part, List<Part>>();
		
		for(Part part: parts) {
			if(!map.containsKey(part))
				map.put(part, new ArrayList<Part>());
			map.get(part).add(part);
			
		}
		
		for(Part key: map.keySet()) {
			b.append((String.format(("%s %s (%.2fg each)" + " : %.2fg\n"), map.get(key).size() ,key.name(), key.getWeight(), getTotalWeight(map.get(key)))));
		}
		
		b.append(String.format("TOTAL WEIGHT : %.2fg\n", getTotalWeight(parts)));
		return b.toString();
	}

}
