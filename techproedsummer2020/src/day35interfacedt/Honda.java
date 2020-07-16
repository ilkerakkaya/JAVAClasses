package day35interfacedt;

public class Honda implements Gas, AirCondition{
	
	
	/*
	 1-When u make a concrete class child of an interface use "implement" keyword instead of extends.
	 2-In parent interfaces u can use variables whose names are same when u call the variables u have to use interface names otherwise u will get CTE.
	 
	 */
	

	public static void main(String[] args) {
		
		Honda hondaCar=new Honda();
		
		
		hondaCar.seat();
		hondaCar.cold();
		hondaCar.refresh();
		hondaCar.speed();
		hondaCar.power();
		hondaCar.eco();
		System.out.println(Gas.price);
		System.out.println(Engine.price);
		System.out.println(AirCondition.price);
		
		
	}
	
	public void seat () {
		System.out.println("Leather seat");
	}

	@Override
	public void cold() {
		System.out.println("Colds well");
		
	}

	@Override
	public void refresh() {
		System.out.println("very refresh");
		
	}

	@Override
	public void speed() {
		System.out.println("heel snel");
		
	}

	@Override
	public void power() {
		System.out.println("beygir dolu motor");
	}

	@Override
	public void eco() {
		System.out.println("it is eco car");
		
	}

}
