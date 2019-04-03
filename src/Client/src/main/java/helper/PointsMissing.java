package helper;

public class PointsMissing {
	
	private PointsMissing() {
	    throw new IllegalStateException("PointsMissing class");
	  }

    public static int determiningPoints (int pointsIn) {

        return 1000 - (pointsIn % 1000);

    }
}
