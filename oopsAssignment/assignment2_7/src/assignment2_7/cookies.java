package assignment2_7;

public class cookies extends dessertItem{
	float quantity;
	public cookies(float q)
	{
		quantity=q;
	}

	public float getcost() {
		float cost = quantity*3f*7;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}
