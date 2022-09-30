public class Point {

    // two int instance variables named x and y
    private int x;
    private int y;

    // a constructor that accepts and sets both instance variables
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // constructor that accepts one value
    public Point(int value){
        x = value;
        y= value;
    }

    // constructor that has no parameters
    public Point(){
        x = 0;
        y = 0;
    }

    // a "getter" method for x
    public int getX() {
        return x;
    }

    // a "getter" method for y
    public int getY() {
        return y;
    }

    // a "setter" method for x
    public void setX(int newX){
        x = newX;
    }

    // a setter method for y
    public void setY(int newY){
        y = newY;
    }

    // a method named coordinate that has no parameters and returns the x and y value as a string coordinate
    public String coordinate(){
        return "(" +x+ "," +y+ ")";
    }

    // a method named quadrant that has no parameters and returns as a string the quadrant the point is in
    public String quadrant(){
        if (x>0 && y>0){
            return "I";
        } else if (x<0 && y>0){
            return "II";
        } else if (x<0 && y<0){
            return "III";
        } else if (x>0 && y<0){
            return "IV";
        } else if (x==0 && y==0){
            return "origin";
        } else {
            return "on an axis";
        }
    }

}
