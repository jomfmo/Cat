import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat("blake", 2, "Abigail");
		blake.setName("Blake");
		blake.setAge(2);
		blake.setOwner("Abigail");
		blake.eat("cat food");
		
		Lion leo = new Lion(Color.YELLOW);
		//leo.setName("Leo");
		//leo.setManeColor();
		leo.roar("roared");
	}
}