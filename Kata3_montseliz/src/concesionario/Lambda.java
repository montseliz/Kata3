package concesionario;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lambda {

	public static ArrayList<Coche> moreThan100 (ArrayList<Coche> arrayCoches) {
		
		ArrayList<Coche> cochesMoreThan100 = new ArrayList<>(); 
		
		cochesMoreThan100 = (ArrayList<Coche>) arrayCoches.stream()
								.filter(c -> c.getPotencia() > 100)
								.collect(Collectors.toList());
		
		return cochesMoreThan100;
		
	}
	
	public static ArrayList<Coche> brandAndModel (ArrayList<Coche> arrayCoches, String brand, String model) {
		
		ArrayList<Coche> cochesBrandAndModel = new ArrayList<>();
		
		cochesBrandAndModel = (ArrayList<Coche>) arrayCoches.stream()
								.filter(c -> c.getMarca().equalsIgnoreCase(brand))
								.filter(c -> c.getModelo().equalsIgnoreCase(model))
								.collect(Collectors.toList());
		
		return cochesBrandAndModel;
		
	}
	 
	public static int averageCv (ArrayList<Coche> arrayCoches) {
		
		int cochesAverageCv = (int) arrayCoches.stream()
							.mapToInt(Coche::getPotencia)
							.average().orElse(0);	
		
		return cochesAverageCv; 
	}
	
	public static int quantityBrand (ArrayList<Coche> arrayCoches, String brand) {
		
		int cochesQuantityBrand = arrayCoches.stream()
									.filter(c -> c.getMarca().equalsIgnoreCase(brand))
									.mapToInt(i -> 1).sum(); 
		
		return cochesQuantityBrand; 
	}
	
	public static ArrayList<String> differentBrand (ArrayList<Coche> arrayCoches, String brand) {
		
		ArrayList<String> cochesDifferentBrand = new ArrayList<>();
		
		arrayCoches.stream()
				.filter(c -> c.getMarca().equalsIgnoreCase(brand))
				.filter(c -> !cochesDifferentBrand.contains(c.toString()))
				.forEach(c -> cochesDifferentBrand.add(c.toString())); 
		
		return cochesDifferentBrand; 
	}
	
	public static String firstCocheBrand (ArrayList<Coche> arrayCoches, String brand) {
		
		String firstBrand = arrayCoches.stream()
									.filter(c -> c.getMarca().equalsIgnoreCase(brand))
									.findFirst()
									.map(Object::toString)
									.orElse(""); 
			
		return firstBrand; 
	}
	 
	public static Coche lastCocheBrand (ArrayList<Coche> arrayCoches, String brand) {
	
		ArrayList<Coche> lastBrand = new ArrayList<>();
		
		lastBrand = (ArrayList<Coche>) arrayCoches.stream()
				.filter(c -> c.getMarca().equalsIgnoreCase(brand))
				.collect(Collectors.toList()); 
				
		return lastBrand.get(lastBrand.size()-1); 
	}
}
