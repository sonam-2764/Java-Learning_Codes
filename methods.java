class Computer {
    public void playMusic() {
        System.out.println("music playing");
    }

    public String getMeAPen(int cost) {
        return "Pen";
    }
}

public class methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
       String str= obj.getMeAPen(10);
       System.out.println(str);
    }
}