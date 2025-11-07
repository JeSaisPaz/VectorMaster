public class Vector {
    // Attributes
    double xOrigin;
    double yOrigin;
    double zOrigin;

    double xArrival;
    double yArrival;
    double zArrival;

    double xVector;
    double yVector;
    double zVector;

    private double length;
    private double horizontal;
    private double vertical;
    private double depth;

    // Constructor
    void Vector(double xOrigin, double yOrigin, double zOrigin, double xArrival, double yArrival, double zArrival) {

        this.xOrigin = xOrigin;
        this.yOrigin = yOrigin;
        this.zOrigin = zOrigin;

        this.xArrival = xArrival;
        this.yArrival = yArrival;
        this.zArrival = zArrival;

        updateComponents();
    }

    void Vector(Point origin, Point arrival) {

        this.xOrigin = origin.getX();
        this.yOrigin = origin.getY();
        this.zOrigin = arrival.getZ();

        this.xArrival = origin.getX();
        this.yArrival = arrival.getY();
        this.zArrival = arrival.getZ();

        updateComponents();
    }

    void Vector() {

        this.xOrigin = 0;
        this.yOrigin = 0;
        this.zOrigin = 0;

        this.xArrival = 0;
        this.yArrival = 0;
        this.zArrival = 0;

        updateComponents();
    }


    // Gets and sets
    public double get_length() {
        return length;
    }

    public double get_horizontal() {
        return horizontal;
    }

    public double get_vertical() {
        return vertical;
    }

    public double get_depth() {
        return depth;
    }

    public double get_xVector() {
        return this.xVector;
    }

    public double get_yVector() {
        return this.yVector;
    }

    public double get_zVector() {
        return this.zVector;
    }

    public void set_xOrigin(double xOrigin) {
        this.xOrigin = xOrigin;
    }

    public void set_yOrigin(double yOrigin) {
        this.yOrigin = yOrigin;
    }

    public void set_zOrigin(double zOrigin) {
        this.zOrigin = zOrigin;
    }

    public void set_xArrival(double xArrival) {
        this.xArrival = xArrival;
    }

    public void set_yArrival(double yArrival) {
        this.yArrival = yArrival;
    }

    public void set_zArrival(double zArrival) {
        this.zArrival = zArrival;
    }

    public void set_xVector(double xVector) {
        this.xVector = xVector;
    }

    public void set_yVector(double yVector) {
        this.yVector = yVector;
    }

    public void set_zVector(double zVector) {
        this.zVector = zVector;
    }


    // Methods

    private void updateComponents() {

        this.length = Math.sqrt(Math.pow(xVector, 2)+Math.pow(yVector, 2)+Math.pow(zVector, 2));

        this.horizontal = xArrival - xOrigin;
        this.vertical = yArrival - yOrigin;
        this.depth = zArrival - zOrigin;

        this.xVector = xArrival - xOrigin;
        this.yVector = yArrival - yOrigin;
        this.zVector = zArrival - zOrigin;
    }
}
