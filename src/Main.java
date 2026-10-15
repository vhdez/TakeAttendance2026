class Main {
	public static void main(String[] args) {
		int numberPresent = 0;

		System.out.println("Let's take attendance!");
		
		System.out.println("Write Present if you are present");

		System.out.println("Mr. Hernandez is Present!");
		numberPresent++;

		System.out.println("Cesia is Present!");
		// use the ++ operator
		// numberPresent = numberPresent + 1; is very verbose
		numberPresent++;

		System.out.println("There are " + numberPresent + " people present.");
	}
}