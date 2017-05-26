package barScatterPlots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScatterPlot extends Plots{
	/*private StringBuilder plot;
	private GetData data;
	private String[] xAxis;
	private String[] yAxis;
	//LeerArchivos hola = new LeerArchivos(); */
	public ScatterPlot(){
		super();
		/*plot = new StringBuilder();*/
		
	}

	@Override
	public String plotInConsole() throws IOException{
		/*String[] x1 = data.NumberToAxisX(data.EjeX);
        String[] y1 = data.NumberToAxisY(data.EjeY);
        setXAxis(x1); 
        setYAxis(y1);*/
		/* CheckPlot();
		SetAxis(); */
        for (int i=0; i< this.yAxis.length; ++i){
        	if (this.yAxis[i].length()>2){
        		plot.append(this.yAxis[i]+"| ");
        	}else{
        		plot.append(this.yAxis[i]+" | ");
        	}
        	for (int j=0; j < this.xAxis.length ; ++j){
    			if (Integer.parseInt(this.yAxis[i]) == Integer.parseInt(data.getdiccionario().get(this.xAxis[j]))){
    				plot.append(" X  ");
    			} else{
    				plot.append("    ");
    			}
    		}
        	plot.append(System.lineSeparator());
        }
        plot.append("   ");
        plot.append(String.join("", Collections.nCopies(2*this.xAxis.length, "==")));
        plot.append(System.lineSeparator());
        plot.append("   ");
		for(int z=0; z<this.xAxis.length; ++z){
			plot.append("   "+this.xAxis[z]);
		}
		return plot.toString();
		
	}
	@Override
	public void setXMaximum(int max){
		if (max ==0){
			setXAxis(getXAxis());
		}else{
			String[] str = getXAxis();
			List<String> array = new ArrayList<String>();
			Collections.addAll(array, str);
			List<Integer> intArray = data.stringToIntArray(array);
			List<Integer> finalInt = null;
			int n = intArray.indexOf(max);
			int lenArray = intArray.size(); 
			if (n == -1){
				for(int j = lenArray-1; j>=0; j--){
					if (max > intArray.get(j)){
						finalInt = intArray.subList(0,j+1);
						break;
					}
				}
			}else{ //El maximo se encuentra en los datos.
				finalInt = intArray.subList(0,n+1);
				}
			setXAxis(ListtoString(data.intToStringArray(finalInt)));
			}
		}
		

	public void setPath(String string) throws IOException {
		this.path = string;
		this.CheckPlot();
		this.SetAxis();
		
	}
	@Override
	public void SetAxis() {
		setXAxis(data.NumberToAxisX(data.getEjeX())); 
        setYAxis(data.NumberToAxisY(data.getEjeY()));
	}

	}
	
	

