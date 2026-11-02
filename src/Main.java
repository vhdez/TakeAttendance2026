class Main {

	// Methods
	public static void main(String[] args) { // functions ---> NOW: functions are also methods
		// Construct
		Student student1 = new Student();  // object construction
		// Set values in fields
		student1.name = "Aquil";
		student1.grade = 12;
		// Call a method.
		student1.announcePresent();

		Student student2 = new Student();  // object
		student2.name = "Cesia";
		student2.grade = 11;
		student2.announcePresent();

		Student student3 = new Student();  // object
		student3.name = "Jack";
		student3.grade = 12;
		student3.announcePresent();

		Student student4 = new Student();  // object
		student4.name = "Elena";
		student4.grade = 11;
		student4.announcePresent();
		//student4.takeAttendance();

		Teacher mrH = new Teacher();  // object
		mrH.name = "Mr. Hernandez";
		mrH.classTaught = "Advanced Computer Science";

		mrH.myFavoriteStudent = student1;
		student1.myTeacher = mrH;
		student2.myTeacher = mrH;
		student3.myTeacher = mrH;
		student4.myTeacher = mrH;

		mrH.greetStudents();
		mrH.takeAttendance();
		mrH.collectHW();
		student1.turnInHomework();
		student2.turnInHomework();
		student3.turnInHomework();
		student4.turnInHomework();
		mrH.giveLesson();
		student2.askBathroom();
	}
}