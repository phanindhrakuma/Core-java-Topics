class Counter{
    int count =0;
    public synchronized void increament(){ // synchrnized makes not toi loose the data count
        count++; // every time thr for loop calll the method the  count is increament
    }
}
public class threadscount {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = new Runnable() {
            public void run(){  // we have to make the name of the method is (run) then only it will work 
                for(int i=0;i<10000;i++){  // it called the method increament 1000 times 
                    c.increament();
                }
            }
        };  // we have to use the type as Runnable because we implements it 
        Runnable obj2 = ()->{  // we have to make the name of the method is (run) then only it will work 
                for(int i=0;i<10000;i++){// it called the method increament 1000 times 
                    c.increament();
                }                                                                                        // 1000+1000=2000 times it calles 
            };    // we have to use the type as Runnable because we implements it 
        // obj1.show(); // first this will execute  
        // obj2.show(); //and second this wil execute
        // i want bot execute parellaly  so i will use thereads to run both at a time 
        /*to make them run parellelly we have to extends those classes with threads  */
        /* after extends the Thread in class we have to call those like below  */
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();  // to perform the thread we have to use the start with obj1 
        t2.start();  // to perform the thread we have to use the start with obj2 

        t1.join();
        t2.join(); // this join will used for after complement t1 and t2 threasd the finally those two will meet at a point
        // after those two meet the count will print below then only the exact output will get 
        System.out.println(c.count);
    } 
}