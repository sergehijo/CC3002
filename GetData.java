package barScatterPlots;

import java.util.*;


public abstract class GetData {
	protected List<String> EjeX;
	protected List<String> EjeY;
	protected Map<String, String> diccionario;
	private Integer BasicStep;
	
	public GetData(){
		this.EjeX = new ArrayList<String>();
		this.EjeY = new ArrayList<String>();
		this.diccionario = new HashMap<String, String>();
		this.BasicStep = 1;
	}
	public List<Integer> stringToIntArray(List<String> string) {
        List<Integer> result = new ArrayList<Integer>();
        for(String str : string) {
                result.add(Integer.parseInt(str));
        }       
        return result;
    }
	public List<String> intToStringArray(List<Integer> result) {
		List<String> res = new ArrayList<String>();
        for(int i : result) {
                res.add(String.valueOf(i));
        }       
        return res;
	}
	
	 public  List<Integer> AddLabels(List<Integer> array, Integer number){
		List<Integer> result = new ArrayList<Integer>();
		Integer first = (int) Math.log10(array.get(0))+1;
		Integer last = (int) Math.log10(array.get(array.size()-1))+1;
		if(first>1 && last >1){
			BasicStep = BasicStep*10;
			BasicStep=(int) Math.pow(BasicStep,first-1);
			//result = CreateLabels.step(array.get(0),number+1, BasicStep);
			result = step(array.get(0),number+1, BasicStep);
			return result;
		}
		result = CreateLabels.step((int) array.get(0),number+1, (int) BasicStep);
		return result;
	}
	private List<Integer> step(int start, int last, int step) {
		List<Integer> arrange = new ArrayList<Integer>();
		int n = (int) Math.ceil((last-start)/(double) step);
		int i = 0;
		while(i<n){
			arrange.add(i*step+start);
			++i;
		} return arrange;
	}
	public String[] LetterToAxis(){ 
		Collections.sort(this.EjeX);
		String [] Sx = this.EjeX.toArray(new String[this.EjeX.size()]);
		return Sx;
	}
	public String[] NumberToAxisY(List<String> array){ 
		List<Integer> result = new ArrayList<Integer>();
		List<String> res = new ArrayList<String>();
		result = stringToIntArray(array);
		Collections.sort(result);
		result = AddLabels(result,result.get(array.size()-1));
		Collections.sort(result,Collections.reverseOrder());
		res = intToStringArray(result);
		String [] Sy = res.toArray(new String[res.size()]);
		return Sy;	
	}
	public String[] NumberToAxisX(List<String> array){ 
		List<Integer> result = new ArrayList<Integer>();
		List<String> res = new ArrayList<String>();
		result = stringToIntArray(array);
		Collections.sort(result);
		res = intToStringArray(result);
		String [] Sy = res.toArray(new String[res.size()]);
		return Sy;	
	}
	/*public abstract void SetAxisLimit(); */
}
