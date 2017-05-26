package barScatterPlots;

import java.util.List;
import java.util.Map;

public interface IGetData {
	List<String> getEjeX();
	List<String> getEjeY() ;
	Map<String, String> getdiccionario();
	List<Integer> stringToIntArray(List<String> string);
	List<String> intToStringArray(List<Integer> result);
	List<Integer> AddLabels(List<Integer> array, Integer number);
	List<Integer> step(int start, int last, int step);
	String[] LetterToAxis();
	String[] NumberToAxisY(List<String> array);
	String[] NumberToAxisX(List<String> array);
	
}
