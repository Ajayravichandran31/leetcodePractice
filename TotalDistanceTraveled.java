class TotalDistanceTraveled {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        
        while (mainTank >= 5) {
            mainTank -= 5;
            distance += 50;
            
            if (additionalTank > 0) {
                additionalTank--;
                mainTank += 2;
            }
        }
        
        distance += mainTank * 10;
        return distance;
    }

    public static void main(String[] args) {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        int result = solver.distanceTraveled(5, 10);
        System.out.println(result);
    }
}