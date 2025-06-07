package HasARelationship;

public class HotelDriver {

	public static void main(String[] args)
	{
        Hotel h= new Hotel("ABC");
        System.out.println(h.hname);
        h.connection("KARTHIK", 123456);
        System.out.println(h.s.cname);
        System.out.println(h.s.cno);
      
	}

}
