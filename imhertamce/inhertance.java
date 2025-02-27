public class inhertance {
    public static void main(String[] args) {
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int r1 = obj1.add(5,10);
        int r2 = obj1.sub(5,10);
        int r3 = obj1.div(5,10);
        int r4 = obj1.mul(5,10);
        double r5 = obj1.pow(5,10);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
