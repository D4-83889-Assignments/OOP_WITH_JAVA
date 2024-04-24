package p1;

public class Invoice {
	public String partNum; 
	public String partDesc; 
	public int partQuant; 
	public double partPrice;
	
	Invoice(){
		
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getPartQuant() {
		return partQuant;
	}

	public void setPartQuant(int partQuant) {
		this.partQuant = partQuant;
	}

	public double getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}
	public double CalculateAmount()
	{
		double amount;
		if(partPrice<0)
		{
			partPrice = 0.0;
		}
		if(partQuant<0)
		{
			partQuant = 0;
		}
		amount = partPrice*partQuant;
		return amount;
		
	}
}
