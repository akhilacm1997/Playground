import java.util.*;

class Item
{
  protected int price;
  public int getPrice() {
	return price;
  }
  public void setPrice(int price) {
	  this.price = price;
  }

}
   
class Customer extends Item
{
  private String product;
  protected int quantity;
  public String getProduct() 
  {
	return product;
  }
  public void setProduct(String product) 
  {
	this.product = product;
  }
  public int getQuantity() 
  {
	return quantity;
  }

  public void setQuantity(int quantity)
  {
	this.quantity = quantity;
  }
  
}

class Bill extends Customer
{
	int amt;
  public int getAmt() {
		return amt;
	}
public void calc()
  {
	   amt=quantity*price;
  }
}
class Main
{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  String a =  sc.nextLine();
	  int b = sc.nextInt();
	  int price =sc.nextInt();
	  Bill obj = new Bill();
     // Item i = new Item();
      obj.setPrice(price);
      //Customer c = new Customer();
      obj.setProduct(a);
      obj.setQuantity(b);
      obj.calc();
      
   System.out.println("Total Price is : "+obj.getAmt());
      
    //write the logic here
  }
}