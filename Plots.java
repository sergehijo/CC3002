package barScatterPlots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Plots implements IPlots{
	protected StringBuilder plot;
	protected IGetData data;
	protected String[] xAxis;
	protected String[] yAxis;
	protected String path;
	//LeerArchivos hola = new LeerArchivos();
	public Plots(){
		plot = new StringBuilder();	
		path =null;
		data = null;
	}
	
	public void CheckPlot() throws IOException{
		if(this.path.contains(".txt")){
			data = new ReadArchives(path);
			//System.out.println("hola");
		}
		else{
			data = new ReadTuples(path);
			//System.out.println(str);
		}
	}
	public abstract void SetAxis(); 
	public String[] ListtoString(List<String> str){
		String[] S = str.toArray(new String[str.size()]);
		return S;
	}
	public abstract String plotInConsole() throws IOException;
	public abstract void setXMaximum(int max);
	public void setYMaximum(int max){
		if (max == 0){
			setYAxis(this.getYAxis());
		}
		else{
			String[] str = this.getYAxis();
			List<String> array = new ArrayList<String>();
			Collections.addAll(array, str);
			List<Integer> intArray = data.stringToIntArray(array);
			List<Integer> finalInt = null;
			int n = intArray.indexOf(max);
			int lenArray = intArray.size(); 
			if (n == -1){
				for(int j = 0; j<lenArray; ++j){
					if (max > intArray.get(j)){
						finalInt = intArray.subList(j,lenArray);
						break;
					}
				}
			}else{ //El maximo se encuentra en los datos.
				finalInt = intArray.subList(n,lenArray);
				}
			setYAxis(ListtoString(data.intToStringArray(finalInt)));
		}
		
		}
	
	public void setXAxis(String[] x1) {
		this.xAxis = x1;
		
	}
	public String[] getXAxis(){
		return this.xAxis;
	}
	public void setYAxis(String[] y1) {
		this.yAxis = y1;
		
	}
	public String[] getYAxis(){
		return this.yAxis;
	}
}
