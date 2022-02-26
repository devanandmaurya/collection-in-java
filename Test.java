package mutilitypackage.com;
class Human
{
	
}
class Doctore extends Human
{
	
}

class Animal{
	
}

class Dog extends Animal
{
	
}

class Bird{
	
}
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static <T extends Human> void infoshow(T anyobj )
	{
		System.out.println("hey u only human or doctor");
	}
	
	public static void main(String[] args) {
		
		infoshow(new Human());
		infoshow(new Doctore());
	//	infoshow(new Animal());
		System.out.println("d".compareTo("e"));
		System.out.println("e".compareTo("qb"));
		System.out.println("12".compareTo("122"));
		System.out.println(new Integer(12).compareTo(7));
	}
	}
	
