public class Student {
    // Fields
    String name;
    boolean present = false;
    int grade;

    // Methods
    void announcePresent() {
        present = true;
        System.out.println(name + " grade " + grade + " is present!");
    }

}
