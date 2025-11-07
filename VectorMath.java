public class VectorMath {
    public Vector vectorAddition(Vector A, Vector B) {
        Vector result = new Vector();
        result.set_xArrival(A.xVector + B.xVector);
        result.set_yArrival(A.yVector + B.yVector);
        result.set_zArrival(A.zVector + B.zVector);
        return result;
    }

    public Vector vectorSubtraction(Vector A, Vector B) {
        Vector result = new Vector();
        result.set_xArrival(A.xVector - B.xVector);
        result.set_yArrival(A.yVector - B.yVector);
        result.set_zArrival(A.zVector - B.zVector);
        return result;
    }

    public Vector unitVector(Vector A) {
        Vector result = new Vector();
        double length = A.get_length();
        if (length == 0) {
            result.set_xVector(0);
            result.set_yVector(0);
            result.set_zVector(0);
            System.out.println("ERROR: Vector length is zero");
            return result;
        } else {
            result.set_xVector(A.xVector / length);
            result.set_yVector(A.yVector / length);
            result.set_zVector(A.zVector / length);
        }
        return result;
    }

    public double dotProduct(Vector A, Vector B) {
        return A.xVector * B.xVector + A.yVector * B.yVector + A.zVector * B.zVector;
    }

    public Vector crossProduct(Vector A, Vector B) {
        Vector result = new Vector();
        result.set_xVector(A.yVector * B.zVector - A.zVector * B.yVector);
        result.set_yVector(A.zVector * B.xVector - A.xVector * B.zVector);
        result.set_zVector(A.xVector * B.yVector - A.yVector * B.xVector);
        return result;
    }

    public double crossProduct_magnitude(Vector crossProduct) {
        double result = 0;
        result = Math.sqrt(crossProduct.get_xVector()*crossProduct.get_xVector() + crossProduct.get_yVector()*crossProduct.get_yVector() + crossProduct.get_zVector()*crossProduct.get_zVector());
        return result;
    }

    public double angleBetween(Vector A, Vector B) {

        double result = 0;

        double dotProduct = dotProduct(A, B);

        double normA = A.get_length();
        double normB = B.get_length();

        if(normA == 0 || normB == 0) {
            System.out.println("ERROR: Vector length is zero");
            return -1;
        }

        else {
            result = Math.acos(dotProduct / (normA * normB));
            return result * 180 / Math.PI;
        }

    }

    public Vector project(Vector A, Vector B) {
        Vector result = new Vector();
        double dotProduct = dotProduct(A, B);
        double normBsqr = Math.pow(B.get_length(), 2);
        if(normBsqr == 0) {
            System.out.println("ERROR: Vector length is zero");
            return result;
        }
        else {
            double scale = dotProduct / (normBsqr);
            result.set_xVector(B.xVector * scale);
            result.set_yVector(B.yVector * scale);
            result.set_zVector(B.zVector * scale);

            return result;
        }
    }

    public double tripleProduct(Vector A, Vector B) {
        Vector cross = crossProduct(A, B);
        return dotProduct(A, cross);
    }

}
