class Main {

	public static void main(String[] args) { // functions ---> NOW: functions are also methods
		// Construct
		Student student1 = new Student();  // object construction
		// Set values in fields
		 student1.name = "Aquil";
		 student1.grade = 12;
		 //student1.present = false;
		 // Call a method.
		 student1.announcePresent();

		Student student2 = new Student();  // object
		student2.name = "Cesia";
		//tudent2.present = false;
		student2.grade = 11;
		student2.announcePresent();

		Student student3 = new Student();  // object
		student3.name = "Jack";
		//student3.present = false;
		student3.grade = 12;
		student3.announcePresent();

		Student student4 = new Student();  // object
		student4.name = "Elena";
		//student4.present = false;
		student4.grade = 11;
		student4.announcePresent();
		//student4.takeAttendance();

		Teacher teacher = new Teacher();  // object
		teacher.name = "Mr. Hernandez";
		teacher.classTaught = "Advanced Computer Science";
		teacher.takeAttendance();





		//
//		//int numberPresent =  0;
//		System.out.println("Let's take attendance!");
//		System.out.println("Write Present if you are present");
//
//		personPresent("Mr. Hernandez");
//		personPresent("Aquil Snipes");
//		personPresent("Cesia");
//		personPresent("Elena");
//		personPresent("Jack");
//
//		System.out.println("Aquil Snipes is Present!");
//        numberPresent = numberPresent + 1;
//
//		System.out.println("Cesia is Present!");
//		numberPresent++;
//		// use the ++ operator
//		// numberPresent = numberPresent + 1; is very verbose
//		System.out.println("Jack is Present!");
//		numberPresent = numberPresent + 1;
//
//		System.out.println("Elena is Present!");
//		numberPresent = numberPresent + 1;
//
//
//
//		System.out.println("There are " + numberPresent + " people present.");

	}


//	static void personPresent(String person) {
//		System.out.println(person + " is Present!");
//		numberPresent = numberPresent + 1;
//	}


}