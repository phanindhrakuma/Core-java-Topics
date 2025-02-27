class A{
    public void show(){
        System.out.println(" in A class ");
    }
}
public class demo {
    public static void main(String[] args) {
        System.out.println("hello");

        // A obj = new A();
        var obj = new A(); // we can use var inside the main mahod ( var used local variable ) if we dont knwo the type we can use the (var)
        obj.show();
    }
}


/*sealed class A extends Thread implements Clonable permits B,C {
5
6 non sealed class B extends A {
7
8}
9
10 final class C extends A {
11
12}
13
14 class D extends B {
15
16 }
17
18 sealed interface X permits Y{
19
20 }
21 sealed interface Y extends X {
22
23 }
24
25 public class Demo
26 { */


// we can use the selaed calsses we only give the permission to the percicular class to use that class 