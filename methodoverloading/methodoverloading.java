class computer{
    public int add(int n1, int n2,int n3){ // method 1 same name called add
        return n1+n2+n3; 
    }
    public int add(int n1, int n2){// method 3 same name called add
        return n1+n2;
    }
    public double add(double n1, int n2){// method 3 same name called add
        return n1+n2;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        computer com = new computer();
        int result = com.add(1, 5,6); // te output is based oon the input we enter 
        double res  = com.add(1.5, 5);
        System.out.println(result);
        System.out.println(res);
    }
}
