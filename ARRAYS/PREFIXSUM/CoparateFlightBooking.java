package PREFIXSUM;
//LEETCODE PROBLEM NUMBER 1109
public class CoparateFlightBooking {
      public static int[] corpFlightBookings(int[][] bookings, int n) {

         /*   int[] ans = new int[n];

    for (int[] booking : bookings) {

        int first = booking[0] - 1;
        int last = booking[1] - 1;
        int seats = booking[2];

        for (int i = first; i <= last; i++) {
            ans[i] += seats;
        }
    }

    return ans;*/
    
        int[] diff = new int[n];

        for (int[] booking : bookings) {

            int first = booking[0] - 1;
            int last = booking[1] - 1;
            int seat = booking[2];

            diff[first] += seat;

            if (last + 1 < n) {
                diff[last + 1] -= seat;
            }
        }

        // Convert Difference Array to Final Answer
        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }

        return diff;
    }

    public static void main(String[] args) {

        int[][] bookings = {
                {1, 2, 10},
                {2, 3, 20},
                {2, 5, 25}
        };

        int n = 5;

        int[] result = corpFlightBookings(bookings, n);

        System.out.println("Final Seats Booked:");

        for (int seat : result) {
            System.out.print(seat + " ");
        }
    }
}
