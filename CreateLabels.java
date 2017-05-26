package barScatterPlots;

import java.util.*;

public class CreateLabels {
	 public static List<Integer> step(int start, int last, int step ){
		List<Integer> arrange = new ArrayList<Integer>();
		int n = (int) Math.ceil((last-start)/(double) step);
		int i = 0;
		while (i<n){
			arrange.add(i*step + start);
			++i;
		} return arrange;
	}

	
}

