class veh{
	int maxspeed=120;
}
class car extends veh{
	int maxspeed=180;
	void display(){
		System.out.println(super.maxspeed);
	}
}
class super1{
	public static void main(String args[]){
		car small = new car();
		small.display();
	}
}