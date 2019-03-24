package es.unileon.prg.Date;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date tomorrow;

		try{
			today = new Date(07, 02, 1000);
			System.out.println("Fecha 1: " + today.toString());
			tomorrow = new Date(10, 10, 1000);
			System.out.println("Fecha 2: " + tomorrow.toString());
			System.out.println(today.isSameYear(tomorrow));
			System.out.println(today.isSameMonth(tomorrow));
			System.out.println(today.isSameDay(tomorrow));
			System.out.println(today.isSame(tomorrow));
			System.out.println("El nombre del mes de " + today + " es: " + today.getMonthName());
			System.out.println("El nombre del mes de " + tomorrow + " es: " + tomorrow.getMonthName());
			System.out.println("El mes de " + today.getMonthName() + " tiene " + today.getDayOfMonth() + " dias.");
			System.out.println("El mes de " + tomorrow.getMonthName() + " tiene " + tomorrow.getDayOfMonth() + " dias.");
			System.out.println("Estacion fecha 1: " + today.seasonName());
			System.out.println("Estacion fecha 2: " + tomorrow.seasonName());
		}catch(DateException e){
			System.out.println(e.getMessage());
		}
		
	}
}
