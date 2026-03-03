package LogicBuildingProblems.EasyProblem;

public class DistanceBetweenTwoPoint {
    static double distance(int x1, int y1, int x2, int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) {
        double result = distance(1,2,4,6);
        System.out.println(result);

    }
}
