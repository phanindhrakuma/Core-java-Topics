enum Laptop{
    dell(1000), macbook(2000), hp, apple(4000);

    private int Price; // instance variable is private so use getters and setters 
    private Laptop() {
        Price = 500; // default constructor creating the minimum value 
        // id we not assign the price of the enum the minim value is assigned 
    }

    private Laptop(int price) { // constructor for the crices we enter accept in enum
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    

}
public class enumcostructor {
    public static void main(String[] args) {
        Laptop lap = Laptop.macbook;
        System.out.println(lap+"  :  "+lap.getPrice());

        // printinga ll the objects using for llop

        for(Laptop lp: Laptop.values()){
            System.out.println(lp +"  :  "+ lp.getPrice());
        }
    }
}
