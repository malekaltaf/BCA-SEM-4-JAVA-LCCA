///////unit2 prog 7 //////////
/*
Abstract class vehicle method numwheels()
subclass car and truck  each impliments this() method.
create
*/
abstract class vehicle{
String vname;
int numofwheels;
abstract void numwheels();
}
class car extends vehicle{
	car(String str,int n){
		vname = str;
		numofwheels = n;
	}
	void numwheels(){
		System.out.println("Vehicle Name "+vname);
		System.out.println("Number of Wheels "+numofwheels);
	}
}
class truck extends vehicle{
	truck(String str,int n){
		vname = str;
		numofwheels = n;
	}
	void numwheels(){
		System.out.println("Vehicle Name "+vname);
		System.out.println("Number of Wheels "+numofwheels);
	}
}
class unit2_prog7{//abstract vehicle 
public static void main(String args[]){
	car cc = new car("CAR",4);
	cc.numwheels();
	truck tt = new truck("TRUCK",16);
	tt.numwheels();
}
}