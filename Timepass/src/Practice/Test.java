package Practice;




 class InvalidEgeException extends Exception{

	public InvalidEgeException(String msg) {
		super(msg);
	}
}

 class Test{
	 
	 public void checkAge(int age) throws InvalidEgeException{
		 if(age<18) {
			 throw new InvalidEgeException("You are Bollow 18");
		 } else {
			 System.out.println("Hii");
		 }
	 }
	 
	 public static void main(String[] args) {
		int age=5;
		try {
			new Test().checkAge(age);
		} catch(InvalidEgeException e) {
			System.out.println(e.getMessage());
		}
	}
 }