class Solution {
    public double averageWaitingTime(int[][] customers) {
        int idleTime = 1;
        long totalWaitingTime = 0;
        for(int customer[] : customers) {
            if(idleTime <= customer[0]) {
                idleTime = customer[0] + customer[1];
            }
            else {
                idleTime = idleTime + customer[1];
            }
            totalWaitingTime = totalWaitingTime + (idleTime - customer[0]);
        }
        double avrageWaitingTime = (totalWaitingTime / (double)customers.length);
        return  avrageWaitingTime;
    }
}