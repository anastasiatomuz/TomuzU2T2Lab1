public class Point {
    //initialize private instance variables
    private int x;
    private int y;

    //constructor with two parameters set by the user
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //constructor with two parameters set by the user
    public Point(int x){
        this.x = x;
        y = x;
    }

    //constructor with no parameters that sets x and y variables to 0
    public Point(){
        x = 0;
        y = 0;
    }

    //getter method for x
    public int getX(){
        return x;
    }

    //getter method for y
    public int getY(){
        return y;
    }

    //setter method for x
    public void setX(int newX){
        x = newX;
    }

    //setter method for y
    public void setY(int newY){
        y = newY;
    }

    //method that returns the coordinates of x and y as a string
    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }

    //method that returns the quadrant of the point as a string
    public String quadrant(){
        if (x > 0 && y > 0){
            return "I";
        }
        if (x < 0 && y > 0){
            return "II";
        }
        if (x < 0  && y < 0){
            return "III";
        }
        if (x > 0  && y < 0){
            return "IV";
        }
        if (x == 0 && y == 0){
            return "origin";
        }
        else{
            return "on an axis";
        }
    }
}
