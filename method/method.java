class computer{
    public void music(){   // music method 1
        System.out.println("playing music...");
    }
    public /*visible to public */ String /*return type string */ pen /*pen method name  */ (int cost){  //pen method 2
        String str = "pen";
        if(cost>=10)
        return str;
        else
        return "no pen";
    }
}
public class method{
    public static void main(String[] args) {
        computer com = new computer();
        com.music();
        String str1 = com.pen(1);
        System.out.println(str1);
    }
}
