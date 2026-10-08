class Main {
	// this really should be declared in the class body instead of main()
	// that way it can be referred to from elsewhere
	static int numberPresent = 0;
	public static void main(String[] args) {
		System.out.println("Let's take attendance!");
		
		System.out.println("Write Present if you are present");

		System.out.println("Mr. Hernandez is Present!");
		
		// use the ++ operator
		// numberPresent = numberPresent + 1; is very verbose
		numberPresent++;

		System.out.println("There are " + numberPresent + " people present.");
	}
}