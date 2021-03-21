class parent{
	void show(){
		System.out.println("parent");
	}
}
class child extends parent{
	void show(){
		System.out.println("child");
	}
}
class method_override{
	public static void main(String args[]){
		parent obj1=new parent();
		obj1.show();
		parent obj2=new child();
		obj2.show();
	}
}