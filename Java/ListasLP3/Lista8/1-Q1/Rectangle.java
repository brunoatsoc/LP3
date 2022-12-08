public class Rectangle extends Shape2D{
    private float x3, y3, x4, y4;

    public Rectangle(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public Rectangle(){
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Rectangle(Rectangle r){
        this(r.getX1(), r.getY1(), r.getX2(), r.getY2(), r.getX3(), r.getY3(), r.getX4(), r.getY4());
    }

    public float getX3(){
        return this.x3;
    }

    public float getX4(){
        return this.x4;
    }

    public float getY3(){
        return this.y3;
    }

    public float getY4(){
        return this.y4;
    }
}