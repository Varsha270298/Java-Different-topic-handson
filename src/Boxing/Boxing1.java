package Boxing;

public class Boxing1 {

	public static void main(String[] args) {
	byte b=10;//primitive data
	
    short s=20;
   int i = 30;
  long l=40;
 float f=10.0f;
 double d=20.50;
 char c='a';
 boolean b1=false;
// converting primitive data to cooreesponding wrapper class object called boxxing
	Byte obj = Byte.valueOf(b);
	System.out.println(obj);
	Short obj1 = Short.valueOf(s);
	System.out.println(obj1);
	Integer obj2 = Integer.valueOf(i);
	System.out.println(obj2);
	Long obj3 = Long.valueOf(l);
	System.out.println(obj3);
	Float obj4 = Float.valueOf(f);
	System.out.println(obj4);
	Double obj5 = Double.valueOf(d);
	System.out.println(obj5);
	Character obj6 = Character.valueOf(c);
	System.out.println(obj6);
	Boolean obj7 = Boolean.valueOf(b1);
	System.out.println(obj7);
	
	
	
	}

}
