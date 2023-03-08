import java.util.*;

public class Actividad2 {

	public static double gradeAverage(double[] grades) {
		double sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum = sum + grades[i];
		}
		
		sum = sum/5;
		
		return sum;
	}
	
	public static char gradeFinal(double average) {
		char gradeLetter = 'F';
		
		if (average <= 50) {
			gradeLetter = 'F';
		}
		else if (average <= 60) {
			gradeLetter = 'E';
		}
		else if (average <= 70) {
			gradeLetter = 'D';
		}
		else if (average <= 80) {
			gradeLetter = 'C';
		}
		else if (average <= 90) {
			gradeLetter = 'B';
		}
		else if (average <= 100) {
			gradeLetter = 'A';
		}
		
		return gradeLetter;
	}
	
	public static void Format(String name, double average, char gradeFinal) {
		System.out.println("Promedio: " + average);
		System.out.println("Calificacion Final: " + gradeFinal);
	}
	
	public static void main(String[] args) {
		String Name = new String();
		double[] gradeArray = new double[5];
		Scanner s = new Scanner(System.in);
		
		System.out.println("CALIFICACIONES");
		
		System.out.print("Nombre del estudiante: ");
		Name = s.next();
		
		for(int i = 0; i < 5; i++) {
			int i2 = i + 1;
			System.out.print("Calificacion " +i2 +": ");
			gradeArray[i] = s.nextInt();
		}
		
		double average = gradeAverage(gradeArray);
		char gradeF = gradeFinal(average);
		Format(Name,average,gradeF);
	}

}