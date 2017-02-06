
public class Car {
	int gear = 1;
	int location;
	int speed = 0;
	final int destination = 250;
	
	public void reverseGear(){
		
		gear = -1;
	
	}
	public void gearUp(){
		if(gear == 6){
			System.out.println("Error");
		}if(gear == -1){
			gear = 1;
			
		}else{
			gear = gear + 1;
		}
	}
	public void gearDown(){
		if(gear == 1){
			System.out.println("It cannot decrease the gear anymore");
		}if(gear == -1){
			System.out.println("It cannot decrease the year because the car is in the reverse gear");
		}else{
			gear = gear -1;
		}
	}
	public int reportGear(){
		return gear;
	}
	public int reportLocation(){
		return location;
	}
	public int reportRemaining(int x){
		return x = destination - location;
	}
}
