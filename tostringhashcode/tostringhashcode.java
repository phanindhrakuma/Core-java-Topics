class Laptop{
    String name;
    int n;
    public String toString(){
        return "kumar";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + n;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (n != other.n)
            return false;
        return true;
    }
}
public class tostringhashcode {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.name="phani";
        obj.n=55;
        Laptop obj1 = new Laptop();
        obj1.name="phani";
        obj1.n=55;
        boolean result = obj.equals(obj1);
        //System.out.println(obj); // it gives the output is hexa string value because by default it like (obj.toString())
        // if we create a method name toString it will execute that method .
        System.out.println(obj); // by default it like obj.toString that is the reasn it will display o/p is kumar
        System.out.println(obj.toString()); // same like calling the method the o/p is kumar
        System.out.println(result);
    }
}
// better to use the comprision using the ide source actions
