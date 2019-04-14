package helper;
/** The points missing class. */
public class PointsMissing {
    /**
     * Determining the points.
     * @param pointsIn the points in
     * @return the points out
     */
    public static final int MODULO = 2500;

    /**
     * Determine the points.
     * @param pointsIn the points in
     * @return the points
     */
    public static int determiningPoints(final int pointsIn) {
        return MODULO - (pointsIn % MODULO);
    }
    /** the points missing. */
    public PointsMissing() {
    }
}
