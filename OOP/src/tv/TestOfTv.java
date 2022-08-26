package tv ;
public class TestOfTv {
    
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        System.out.println("For tv1: Channel no:"+ tv1.channel+ " Volume: "+ tv1.volumeLevel);
        tv1.setChannel(9);
        tv1.setvolume(3);
        System.out.println("For tv1: Channel no:"+ tv1.channel+ " Volume: "+ tv1.volumeLevel);
        tv2.turnOn();
        tv2.volumeUp();
        tv2.channelUp();
        System.out.println("For tv2: Channel no:"+ tv2.channel+ " Volume: "+ tv2.volumeLevel);
        tv2.turnOff();
        System.out.println("For tv2: Channel no:"+ tv2.channel+ " Volume: "+ tv2.volumeLevel);

}
}