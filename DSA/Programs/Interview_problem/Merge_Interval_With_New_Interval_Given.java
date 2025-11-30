package Interview_problem;

import java.util.*;

public class Merge_Interval_With_New_Interval_Given {
    public ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> newInterval) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (ArrayList<Integer> interval : intervals) {
            if (interval.get(1) < newInterval.get(0)) {
                // current interval ends before newInterval starts
                result.add(interval);
            } else if (interval.get(0) > newInterval.get(1)) {
                // current interval starts after newInterval ends
                result.add(new ArrayList<>(newInterval));
                newInterval = interval;
            } else {
                // overlap → merge
                newInterval.set(0, Math.min(newInterval.get(0), interval.get(0)));
                newInterval.set(1, Math.max(newInterval.get(1), interval.get(1)));
            }
        }

        // add last newInterval
        result.add(newInterval);
        return result;
    }
}
