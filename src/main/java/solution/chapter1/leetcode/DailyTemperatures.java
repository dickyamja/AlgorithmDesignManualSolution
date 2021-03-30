/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution.chapter1.leetcode;

/**
 * https://leetcode.com/problems/daily-temperatures/
 * @author ahmadamal
 */
public class DailyTemperatures {
    
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] days = new int[length];
        for(int i=0; i<length; i++){
            int totalWaitingDay = 0;
            for(int j=i+1; j<length; j++){
                if(T[j] > T[i]){
                    totalWaitingDay = j - i;
                    break;
                }
            }
            days[i] = totalWaitingDay;
        }
        return days;
    }
    
}
