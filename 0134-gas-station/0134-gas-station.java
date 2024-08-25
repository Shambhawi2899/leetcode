public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;    // Tracks total gas balance across all stations
        int currTank = 0;     // Tracks current gas balance during the journey
        int startingStation = 0; // Potential starting station
        
        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];  // Calculate balance for current station
            totalTank += balance;            // Update total balance
            currTank += balance;             // Update current balance
            
            // If current tank balance drops below zero, we can't start from this or any previous station
            if (currTank < 0) {
                startingStation = i + 1;     // Set the next station as the starting point
                currTank = 0;                // Reset current balance
            }
        }
        
        // If total gas is less than total cost, it's impossible to complete the circuit
        if (totalTank < 0) {
            return -1;
        } else {
            return startingStation;
        }
    }
}
