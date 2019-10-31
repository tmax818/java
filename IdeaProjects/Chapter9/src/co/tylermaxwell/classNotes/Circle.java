package co.tylermaxwell.classNotes;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "white";
    }

    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        }
        else {
            System.out.println(radius + " is a bad radius."); // data validation
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        if(color.equalsIgnoreCase("red") ||
                color.equalsIgnoreCase("green") ||
                color.equalsIgnoreCase("blue"))
        {
            this.color = color;
        }
        else
            {
            System.out.println(color + " is  a bad color.");
        }
    }

    public String getColor(){
        return this.color;
    }
}
