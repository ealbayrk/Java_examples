package quiz;


public class Ball implements Bounceable {
    public  double size;


    public Ball(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void bounce() {

    }

    public void toss(){

    }
}