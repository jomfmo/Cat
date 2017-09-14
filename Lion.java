import java.awt.Color;

public class Lion extends Cat
{
	private Color maneColor;
	
	public Lion (Color m)
	{
		super ("Leo", 2, "Abigail");
		maneColor = m;
	}
	
	public Color getManeColor()
	{
		return maneColor;
	}
	public void setManeColor(Color m)
	{
		maneColor = m;
	}
	
	public void roar(String roared)
	{
		System.out.println(getName()  + " just " + roared);
	}
}