class Computer {
    public void playMusic() {
        System.out.println("music playing");
    }

    public String getMeAPen(int cost) {
        // we only want to return pen if the cost is greater than or equal to 10 then
        if(cost >= 10)
        return "Pen";
        else /*we can remove the else keyword then 2 return hoga toh kaun sa print hoga but agar if condition shi h toh pehla jo return
        h uske baad function se bahar nikal jayega compiler
        and agar condition false h toh 2nd wala return hoga*/ 
            return "nothing";
    }
}

public class methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        // now let's pass value less than 10
       String str= obj.getMeAPen(2);
       System.out.println(str);
    }
}