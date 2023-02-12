package concesionario;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		int menu = 0; 
		String brand = ""; 
		String model = ""; 
		
		ArrayList<Coche> arrayCoches = new ArrayList<>(); 
		arrayCoches.add(new Coche("Volvo", "S40", 1200, 130)); 
		arrayCoches.add(new Coche("Audi", "TT", 1500, 140));
		arrayCoches.add(new Coche("Fiat", "500", 1000, 100));
		arrayCoches.add(new Coche("Seat", "Leon", 1100, 120));
		arrayCoches.add(new Coche("Mazda", "3", 1300, 110));
		arrayCoches.add(new Coche("Opel", "Astra", 1400, 150));
		arrayCoches.add(new Coche("Opel", "Corsa", 1400, 120));
		arrayCoches.add(new Coche("Seat", "Ibiza", 1100, 140));
		arrayCoches.add(new Coche("Audi", "A4", 1500, 170));
		arrayCoches.add(new Coche("Seat", "Panda", 1000, 100));
		arrayCoches.add(new Coche("Seat", "Panda", 1000, 100));
		
		do {
			System.out.println("Escoje qué opción quieres realizar del menú siguiente:\r\n"
					+ "1. Coches de más de 100 cv de potencia.\r\n" 
					+ "2. Coches de una marca y modelo.\r\n" 
					+ "3. Media de los caballos de todos los coches.\r\n" 
					+ "4. Cantidad de coches de una marca en concreto.\r\n" 
					+ "5. Todos los coches diferentes de una marca.\r\n"
					+ "6. Primer coche de una marca.\r\n"
					+ "7. Último coche de una marca.\r\n"
					+ "0. Salir de la aplicación.\r\n" + "Tria (0 -7):"); 
			menu = input.nextInt(); 
			
			switch (menu) {
			case 0: 
				System.out.println("¡Hasta la próxima!");
				break; 
			case 1: 
				System.out.println(Lambda.moreThan100(arrayCoches));
				break; 
			case 2: 
				System.out.println("Especifica la marca:"); 
				input.nextLine(); 
				brand = input.nextLine(); 
				System.out.println("Especifica el modelo:"); 
				model = input.nextLine(); 
				System.out.println(Lambda.brandAndModel(arrayCoches, brand, model));
				break; 
			case 3: 
				System.out.println(Lambda.averageCv(arrayCoches));
				break; 
			case 4: 
				System.out.println("Especifica la marca:");
				input.nextLine(); 
				brand = input.nextLine(); 
				System.out.println(Lambda.quantityBrand(arrayCoches, brand));
				break; 
			case 5: 
				System.out.println("Especifica la marca:");
				input.nextLine(); 
				brand = input.nextLine(); 
				System.out.println(Lambda.differentBrand(arrayCoches, brand));
				break; 
			case 6: 
				System.out.println("Especifica la marca:");
				input.nextLine(); 
				brand = input.nextLine(); 
				System.out.println(Lambda.firstCocheBrand(arrayCoches, brand));
				break; 
			case 7: 
				System.out.println("Especifica la marca:");
				input.nextLine(); 
				brand = input.nextLine(); 
				System.out.println(Lambda.lastCocheBrand(arrayCoches, brand));
				break; 
			default: 
				System.out.println("Error. Introduce un número correcto del 0 al 7.\r\n");
			}
			
			
		} while (menu != 0); 
		
		input.close();
	}

}
