package part4;

import java.util.*;

class Interval {
	int start = 0;
	int end = 0;
	
	Interval(int s, int e){
		start = s;
		end = e;
	}
}

public class Solution {
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> m = new ArrayList<>();
        int s = intervals.size();
        int[] starts = new int[s];
        int[] ends = new int[s];
        
        if(s == 0) {
            return m;
        }
        else {
        	for(int i = 0; i < s; i++) {
        		starts[i] = intervals.get(i).start;
        		ends[i] = intervals.get(i).end;
        	}
        	Arrays.sort(starts);
        	Arrays.sort(ends);
        	
        	int start = starts[0];
        	int end = ends[0];
        	
        	for(int i = 0; i < s - 1; i++) {
        		if(ends[i] >= starts[i + 1]) {
        			end = ends[i + 1];
        		}
        		else {
        			end = ends[i];
        			m.add(new Interval(start, end));
        			start = starts[i + 1];
        			end = ends[i + 1];
        		}
        	}
        	m.add(new Interval(start, end));
        	return m;
        }
    }

}
