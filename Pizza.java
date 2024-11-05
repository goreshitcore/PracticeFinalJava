public class Pizza 
{

    public static void main(String[] args) {
        Pizza small = new Pizza(Pizza.Size.Small,new Pizza.Topping[] {Pizza.Topping.Pinapple,Pizza.Topping.Salami,Pizza.Topping.Bacon});
        System.out.println("total = "+small.getTotalPrice());
    }

	public enum Topping 
	{

		Salami(5), Mushrooms(2), Ham(6), Pinapple(1), Bacon(4);

		private int price;

		public int getPrice()
		{
			return this.price;
		}

		private Topping(int price)
		{
			this.price = price;
		}		
	}

	public enum Size
	{
		Small(5), Medium(10), Large(12);

		private int basePrice;

		public int getBasePrice()
		{
			return this.basePrice;
		}

		private Size(int basePrice)
		{
			this.basePrice = basePrice;
		}		
	}


	private Size size;
	private Topping[] toppings;

    //1. Complete this method.
	public int getTotalPrice()
	{
        int totalPrice = size.getBasePrice(); 
        //setting the total price to the size of base prices
			    //loop through the toppings

        for ( Topping topping : toppings) {
		 // increment totalprice with the topping price

            totalPrice += topping.getPrice();
        }
		//return the totalprice
        return totalPrice;

	}

	public Pizza(Size size,Topping[] toppings)
	{
		this.size = size;
		this.toppings = new Topping[0];

		if(toppings != null)
		{		
			this.toppings = toppings;
		}		
	}
}
