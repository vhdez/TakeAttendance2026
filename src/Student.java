public class Student {
    // Fields
    String name;
    boolean present = false;
    int grade;// 9,  , 10, 11,11.5, 12
    char score1 = 'A';
    String score2 = "A+ and B+";
    Teacher myTeacher;

    // Methods
    void announcePresent() {
        present = true;
        String lowerCaseScore = score2.toLowerCase();
        System.out.println(name + " grade " + lowerCaseScore + " is present!");
    }

    void turnInHomework() {
        System.out.println("Student " + name + " turned in HW to " + myTeacher.name);
    }

    void askBathroom() {
        System.out.println("Student " + name + " asks " + myTeacher.name + " to go to Bathroom.");
        myTeacher.bathroomRequest();
    }
}
