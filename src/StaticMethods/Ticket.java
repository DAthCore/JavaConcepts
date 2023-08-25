package StaticMethods;

/*** @author DAthCore */

public class Ticket {
	
	public static int numTicketSold = 0; //Shared
	private int ticketNum; //One per object
	
	public Ticket() {
		numTicketSold++;
		ticketNum = numTicketSold;
	}
	
	public static int getNumTicketSold() {
		return numTicketSold;
	}

	public int getTicketNum() {
		return ticketNum;
	}

	public String getInfo() {
		return "Ticket # " + ticketNum + ";" + numTicketSold + "ticket(s) sold.";
	}
	
	public static void main(String[] args) {
		System.out.println("Number Of Tickets Sold: " + Ticket.getNumTicketSold());
		
		Ticket t1 = new Ticket();
		System.out.println("Ticket Number: " + t1.getTicketNum());
		
		Ticket t2 = new Ticket();
		System.out.println("Ticket Number: " + t2.getTicketNum());
		
		System.out.println("Number Of Tickets Sold: " + Ticket.getNumTicketSold());
	}

}
