
public class Main {

	public static void main(String[] args) {
		
	Course course1 = new Course(1,"Yazýlým Geliþtirici Yazýlým Kampý(C# + Angular)", "Engin DEMÝROÐ", 1 );
	
	Course course2 = new Course(2, "Yazýlým Geliþtirici Yazýlým Kampý(Java + React)", "Engin DEMÝROÐ", 1 );
	
	
	System.out.println("Sizler için hazýrladýðýmýz kurslar");
	
	courseSystem courseSystem = new courseSystem();
	
	courseSystem.addCourseSystem(course1); 
	courseSystem.addCourseSystem(course2); 
	

	}

}
