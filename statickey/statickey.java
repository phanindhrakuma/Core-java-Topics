class phones{
    static String name;// making this is a static that will reamins same for all the objects created 
    int price;  // instance variables presenbt inside the class
    String brand; 
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}
public class statickey {
    public static void main(String[] args) {
        phones ph1 = new phones();
        ph1.name = "apple";
        ph1.price = 100;
        ph1.brand = "smart phone";
        phones ph2 = new phones();
        ph2.name = "m1";
        ph2.price = 100;
        ph2.brand = "smart phone";

        ph1.name = "Phone";
        ph1.show();
        ph2.show();

    }
}
