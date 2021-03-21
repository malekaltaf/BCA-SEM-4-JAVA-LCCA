class person{
	person(){
		System.out.println("person");
	}
}
class student extends person{
	student(){
		System.out.println("Student");
	}
}
class super3{
	public static void main(String args[]){
	student t = new student();
	}
}