//Kristian Hajredinaj ID:113367328

public class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getD(){
        return d;
    }

    public double getE(){
        return e;
    }

    public double getF(){
        return f;
    }

    public boolean isSolvable(){
        boolean check = false;
        if((getA() * getD()) - (getB() * getC()) != 0)
            check = true;

        return check;
    }

    public double getX(){
        double x = ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
        return x;
    }

    public double getY(){
        double y = ((getA() * getF()) - (getE() * getC())) / ((getA() * getD()) - (getB() * getC()));
        return y;
    }

}
