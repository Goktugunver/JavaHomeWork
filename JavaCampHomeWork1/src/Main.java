
public class Main {

	public static void main(String[] args) {
		
	Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yaz�l�m Kamp�(C# + Angular)", "Engin DEM�RO�", 1 );
	
	Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yaz�l�m Kamp�(Java + React)", "Engin DEM�RO�", 1 );
	
	
	System.out.println("Sizler i�in haz�rlad���m�z kurslar");
	
	courseSystem courseSystem = new courseSystem();
	
	courseSystem.addCourseSystem(course1); 
	courseSystem.addCourseSystem(course2); 
	

	}

}
