package Alumno;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno("Francisco", 10);
		System.out.println(alumno);
		
		alumno.setNotaMedia(10);
		String datos = alumno.toString();
		
		
		Alumno alumno2 = new Alumno("Pepe", 7.5);
		
		
		Alumno alumno3  = alumno;
		
		System.out.println(alumno3);
		
		
		
		
		
		// Si yo llamo al objeto tal cual y no le pongo nada mas es como si fuera por defecto .toString
		
		System.out.println("1: "+datos);
		System.out.println("2: "+alumno.toString());
		System.out.println("3: "+alumno);

	}

}
