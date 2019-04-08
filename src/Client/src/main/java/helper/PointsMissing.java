package helper;

public class PointsMissing {
    /**
     * Determining the points.
     * @param pointsIn the points in
     * @return the points out
     */
    public static int determiningPoints(final int pointsIn) {
    	
        return 1000 - (pointsIn % 1000);

    }
}
