// class A extends Thread{ // to  execute bot codes at a time we have to extends the class to thread so the class became thread 
//     // beacuse for normal object and class we are unable to perform both code execute at a time 
//     public void run(){  // we have to make the name of the method is (run) then only it will work 
//         for(int i=0;i<100;i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // this will help to stop the thread execution for 10 milli seconds
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B extends Thread{  // to  execute bot codes at a time we have to extends the class to thread so the class became thread 
//     public void run(){  // we have to make the name of the method is (run) then only it will work 
//         for(int i=0;i<100;i++){
//             System.out.println("hello");
//         }
//     }
// }
// public class threadsmul {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();
//         // obj1.show(); // first this will execute  
//         // obj2.show(); //and second this wil execute
//         // i want bot execute parellaly  so i will use thereads to run both at a time 
//         /*to make them run parellelly we have to extends those classes with threads  */
//         /* after extends the Thread in class we have to call those like below  */


//         System.out.println(obj1.getPriority()); // the threads having the preiority the basic is 5 (0-10)
//         obj2.setPriority(Thread.MAX_PRIORITY); // the max priority is 10 
//         // suggesting the schedula using priority 


//         obj1.start();  // to perform the thread we have to use the start with obj1 
//         try {
//             Thread.sleep(2);
//         } catch (InterruptedException e) {
            
//             e.printStackTrace();
//         }
//         obj2.start();  // to perform the thread we have to use the start with obj2 
//     } 
// }
// threads are used to works ata a same time 


// another method using threads using implements 

// class A implements Runnable{ // to  execute bot codes at a time we have to implements the class to Runnable so the class became thread 
//     // beacuse for normal object and class we are unable to perform both code execute at a time 
//     public void run(){  // we have to make the name of the method is (run) then only it will work 
//         for(int i=0;i<5;i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // this will help to stop the thread execution for 10 milli seconds
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements Runnable{  // to  execute bot codes at a time we have to implements the class to Runnable so the class became thread 
//     public void run(){  // we have to make the name of the method is (run) then only it will work 
//         for(int i=0;i<5;i++){
//             System.out.println("hello");
//         }
//     }
// }
// public class threadsmul {
//     public static void main(String[] args) {
//         Runnable obj1 = new A();  // we have to use the type as Runnable because we implements it 
//         Runnable obj2 = new B();    // we have to use the type as Runnable because we implements it 
//         // obj1.show(); // first this will execute  
//         // obj2.show(); //and second this wil execute
//         // i want bot execute parellaly  so i will use thereads to run both at a time 
//         /*to make them run parellelly we have to extends those classes with threads  */
//         /* after extends the Thread in class we have to call those like below  */
//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();  // to perform the thread we have to use the start with obj1 
//         try {
//             Thread.sleep(2);
//         } catch (InterruptedException e) {
            
//             e.printStackTrace();
//         }
//         t2.start();  // to perform the thread we have to use the start with obj2 
//     } 
// }

// we can write another format using lamda beacue the runnable is the functional interface so we can use lamda 

public class threadsmul {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            public void run(){  // we have to make the name of the method is (run) then only it will work 
                for(int i=0;i<5;i++){
                    System.out.println("hi");
                    try {
                        Thread.sleep(10); // this will help to stop the thread execution for 10 milli seconds
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
            }
        };  // we have to use the type as Runnable because we implements it 
        Runnable obj2 = ()->{  // we have to make the name of the method is (run) then only it will work 
                for(int i=0;i<5;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10); // this will help to stop the thread execution for 10 milli seconds
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
            };    // we have to use the type as Runnable because we implements it 
        // obj1.show(); // first this will execute  
        // obj2.show(); //and second this wil execute
        // i want bot execute parellaly  so i will use thereads to run both at a time 
        /*to make them run parellelly we have to extends those classes with threads  */
        /* after extends the Thread in class we have to call those like below  */
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();  // to perform the thread we have to use the start with obj1 
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        t2.start();  // to perform the thread we have to use the start with obj2 
    } 
}

