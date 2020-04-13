package de.claus.pattern.builder;

public class PartnerTest {
	public static void main(String[] args) {
	    Partner user1 = new Partner.PartnerBuilder("Lokesh", "Gupta")
	    .age(30)
	    .phone("1234567")
	    .address("Fake address 1234")
	    .build();
	 
	    System.out.println(user1);
	 
	    Partner user2 = new Partner.PartnerBuilder("Jack", "Reacher")
	    .age(40)
	    .phone("5655")
	    //no address
	    .build();
	 
	    System.out.println(user2);
	 
	    Partner user3 = new Partner.PartnerBuilder("Super", "Man")
	    //No age
	    //No phone
	    //no address
	    .build();
	 
	    System.out.println(user3);
	}
}
