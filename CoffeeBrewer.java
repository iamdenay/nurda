import Product;
public class CoffeeBrewer  extends Product{
  private String model;
  private String waterSupply;
  private int numberOfCups;

  public CoffeeBrewer(String code, String desc, double price, Sring model, String waterSupply, int numberOfCups){
    super(code,desc,price);
    model.this = model;
    waterSupply.this = waterSupply;
    numberOfCups.this = numberOfCups;
  }
  public String getModel(){
    return model;
  }
  public String getWaterSupply(){
    return waterSupply;
  }
  public int getNumberOfCups(){
    return numberOfCups;
  }
  public String toString() {
      return super.toString() + "_" + this.getModel() + "_" + this.getWaterSupply() + "_" + this.getNumberOfCups();
  }
}
