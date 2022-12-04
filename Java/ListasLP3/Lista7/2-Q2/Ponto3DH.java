public class Ponto3DH extends Ponto2D{
    private float z;

    public Ponto3DH(){
        super(0, 0);
        this.z = 0;
    }

    public Ponto3DH(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Ponto3DH(Ponto3DH p){
        super(p.getX(), p.getY());
        this.z = p.getZ();
    }

    public float getZ(){
        return this.z;
    }

    @Override
    public String toString(){
        return "(x, y, z) = " + "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }

    //@Override
    public boolean inAxisX(){
        if((super.getY() == 0) && ((super.getX() < 0) || (super.getX() > 0))){
            return true;
        }
        return false;
    }

    //@Override
    public boolean inAxiY(){
        if((super.getX() == 0) && ((super.getY() < 0) || (super.getY() > 0))){
            return true;
        }
        return false;
    }

    //@Override
    public boolean inAxis(){
        if((super.getX() == 0) && (super.getY() == 0)){
            return true;
        }
        return false;
    }

    //@Override
    public boolean isOrigin(Ponto3DH p){
        if((p.getX() == 0) && (p.getY() == 0) && (p.getZ() == 0)){
            return true;
        }
        return false;
    }

    //@Override
    public float distance(float x, float y, float z){
        return (float)Math.sqrt((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()) + (z - this.getZ()) * (z - this.getZ()));
    }

    //@Override
    public float distance(Ponto3DH p){
        return (float)Math.sqrt((p.getX() - this.getX()) * (p.getX() - this.getX()) + (p.getY() - this.getY()) * (p.getY() - this.getY()) + (p.getZ() - this.getZ()) * (p.getZ() - this.getZ()));
    }
}