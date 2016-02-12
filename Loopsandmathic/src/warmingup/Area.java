package warmingup;

public class Area {

	public void geoarea()
		{
			System.out.println("the area of the given geometric figures is");
		}
		
	public static void main(String[] args)
		{
			Area p=new Area ();
		p.geoarea();
	Area obj=new Triangle();//area is the reference but triangle object
		obj.geoarea();
		Area obj2=new Square();
		obj2.geoarea();	
		Area obj3=new Rect ();
		obj3.geoarea();
		
		}
	  }
class Triangle extends  Area{
		public void geoarea()
			{
			int a=3;
			int b=4;
			int a3=a*b/2;
			System.out.println("the area of the triangle is" +a3);
			}
			}
class Square extends  Area{
		public void geoarea(){
			int k=2;
			int a2=k*k;
			System.out.println("the area of the square is"+a2);
			}
			}
class Rect extends  Area{
		public void geoarea(){
			int l=2;
			int b=4;
			int a=l*b;
			System.out.println("the area of the rectangle is" +a);
			}
			}


