import java.util.ArrayList;

import org.joda.time.DateTime;

public class MainPartB 
{
	
	public static void main(String[] args)
	{
		Student studentA = new Student("Adam", "121", "06091995", 12);
		Student studentB = new Student("Paul", "122", "06091994", 13);
		Student studentC = new Student("Eoin", "123", "06091993", 14);
		Student studentD = new Student("Cian", "124", "06091992", 15);
		Student studentE = new Student("Jack", "125", "06091991", 16);
		Student studentF = new Student("Emma", "126", "06091990", 17);
		Student studentG = new Student("Ewan", "127", "06091996", 11);
		Student studentH = new Student("MAtt", "128", "06091997", 10);
		Student studentI = new Student("Owen", "129", "06091998", 9);
		
		Module moduleA = new Module("Software I", "S11");
		Module moduleB = new Module("Software II", "S12");
		Module moduleC = new Module("Hardware I", "H11");
		Module moduleD = new Module("Hardware II", "H12");
		
		DateTime start = new DateTime(2017, 9, 6, 5, 5);		
		DateTime end =  new DateTime(2018, 8, 6, 5, 5);
		
		
		CourseProgramme eee = new CourseProgramme("EEE", start, end);
		CourseProgramme ece = new CourseProgramme("ECE", start, end);
		CourseProgramme csit = new CourseProgramme("CSIT", start, end);
		
		ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
		
		courses.add(eee);
		courses.add(ece);
		courses.add(csit);
		
		eee.addModule(moduleC);
		eee.addModule(moduleD);
		
		ece.addModule(moduleA);
		ece.addModule(moduleC);
		
		csit.addModule(moduleB);
		csit.addModule(moduleA);
		
		eee.addStudent(studentA);
		eee.addStudent(studentE);
		eee.addStudent(studentB);
		
		ece.addStudent(studentF);
		ece.addStudent(studentG);
		ece.addStudent(studentI);
		
		csit.addStudent(studentC);
		csit.addStudent(studentD);
		csit.addStudent(studentH);
		
		
		for (CourseProgramme c : courses)
		{		
			for(Student a : c.getStudents() )
			{
				System.out.print("Student Name : " + a.getName());
				System.out.print("  Course Name: " + c.getName() + "  Modules: ");
				for(Module b : c.getModules())
				{
					System.out.print(b.getModuleName() + " ");
				}
				System.out.println();
			}
		}
		
	}

	
}
