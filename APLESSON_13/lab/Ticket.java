public abstract class Ticket
{
	int serialNo;
	
	public Ticket()
	{
		this.serialNo = (int)(Math.random() *10000000) + 1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo + " Price: " + getPrice();
	}
}