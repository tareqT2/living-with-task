package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Part;
import org.example.utils.PartsUtils;

public class PartsList {

	public static void main(String[] args) {

		List<Part> list = parseParts(args);

		System.out.println(PartsUtils.toList(list));
	}
	
	/**
	 * This method is used to parse an array String to List of Part
	 * @param args the array to parse
	 * @return
	 */
	private static List<Part> parseParts(String[] args) {
		ArrayList<Part> parts = new ArrayList<Part>();
		for (int i = 0; i < args.length; i++) {
			parts.add(Part.valueOf(args[i]));
		}
		return parts;
	}

}
