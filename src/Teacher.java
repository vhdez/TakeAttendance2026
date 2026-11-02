public class Teacher {
    // Fields
    String name;
    String classTaught;
    int studentsPresent;
    Student myFavoriteStudent;

    void greetStudents() {
        System.out.println(name + " says: Hello " + myFavoriteStudent.name + "!");
    }

    // Methods
    void takeAttendance() {
        //for () {
        //    totalPresent = totalPresent + 1;
        //}
        System.out.println(name + " says: There are " + studentsPresent + " students present in " + classTaught);
    }

    void collectHW() {
        System.out.println(name + " says: Students, turn in HW.");
    }

    void giveLesson() {
        System.out.println(name + " says: Let's learn about...");
    }

    void bathroomRequest() {
        System.out.println(name + " says: No!  Go during lunch.");
    }
}