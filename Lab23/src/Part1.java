import java.util.Scanner;
abstract class GeometricObject {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;

protected GeometricObject() {
}

protected GeometricObject(String color, boolean filled) {
dateCreated = new java.util.Date();
this.color = color;
this.filled = filled;
}

/** Return color */
public String getColor() {
return color;
}

/** Set a new color */
public void setColor(String color) {
this.color = color;
}

/** Return filled. Since filled is boolean,
* the get method is named isFilled */
public boolean isFilled() {
return filled;
}

/** Set a new filled */
public void setFilled(boolean filled) {
this.filled = filled;
}

/** Get dateCreated */
public java.util.Date getDateCreated() {
return dateCreated;
}

@Override
public String toString() {
return "created on " + dateCreated + "\ncolor: " + color +
" and filled: " + filled;
}

/** Abstract method getArea */
public abstract double getArea();

/** Abstract method getPerimeter */
public abstract double getPerimeter();
}

class Triangle extends GeometricObject{

    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double S = (getSide1() + getSide2() + getSide3()) / 2.0;
        double area = Math.sqrt(S * (S - getSide1()) * (S - getSide2()) * (S - getSide3()));
        return area;
    }
    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }
    public String toString(){
        return "Triangle: side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = "
                + getSide3();
    }
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle:");
        double side1 = input.nextDouble();
		System.out.print("Enter side 2 of triangle:");
        double side2 = input.nextDouble();
		System.out.print("Enter side 3 of triangle:");
        double side3 = input.nextDouble();

        System.out.print("Enter color of triangle:");
        String color = input.next();

        System.out.print("Enter whether triangle is filled (yes/no):");
        String fill = input.next();
		boolean filled = false;
		if(fill == "yes")
			filled =  true;
		else if(fill == "no")
			filled = false;

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle);
        System.out.println("Area:" + triangle.getArea());
        System.out.println("Perimeter:" + triangle.getPerimeter());
        System.out.println("Color" + triangle.getColor());
        System.out.println("Filled?" + (triangle.isFilled() ? "true": "false"));
    }
}