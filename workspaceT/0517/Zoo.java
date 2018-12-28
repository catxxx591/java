public class Zoo{
	public static void main(String args[]){
		Bird b = new Bird();
		b.setName("¤p³¾");
		b.walk();
		System.out.println(b.toString());
		System.out.println(b.hashCode());
		
		Chicken c = new Chicken();
		c.setName("¤pÂû");
		c.walk();
		c.wu();
	}
}
