import java.util.Scanner;

public class CircleAndRectangleOverlapping {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX = Math.max(x1, Math.min(xCenter, x2));
        int closestY = Math.max(y1, Math.min(yCenter, y2));
        
        long dx = xCenter - closestX;
        long dy = yCenter - closestY;
        
        return (dx * dx + dy * dy) <= (long) radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int radius = scanner.nextInt();
        int xCenter = scanner.nextInt();
        int yCenter = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        CircleAndRectangleOverlapping solution = new CircleAndRectangleOverlapping();
        boolean result = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        
        System.out.println(result);
        scanner.close();
    }
}