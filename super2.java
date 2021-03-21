class person{
	void msg(){
		System.out.println("person");
	}
}
class student extends person{
	void msg(){
		System.out.println("Student");
	}
	void display(){
		msg();
		super.msg();
	}
}
class super2{
	public static void main(String []args){
		student s = new student();
		s.display();
	}
}