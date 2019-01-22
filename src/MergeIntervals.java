import java.util.ArrayList;
import java.util.Arrays;

class Interval{
    int start;
    int end;
    Interval(){start=0; end=0;}
    Interval(int start, int end){
        this.start=start;
        this.end=end;
    }
}

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){
        ArrayList<Interval> result = new ArrayList<Interval>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (newInterval.end < interval.start) {
                result.add(newInterval);
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            } else {
                // overlapping, enlarge newInterval to merge overlapping intervals
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }
        result.add(newInterval);
        return result;
    }

    public static void main(String[] args){
        ArrayList<Interval> intervals= new ArrayList<Interval>(Arrays.asList(new Interval(1,2), new Interval(3,6)));

        MergeIntervals mergeIntervals= new MergeIntervals();
        ArrayList<Interval> result = mergeIntervals.insert(intervals, new Interval(10,8));

        for(int i=0;i<result.size();i++){
            System.out.println( result.get(i).start +" "+ result.get(i).end);
        }
    }
}
