package barScatterPlots;

import java.io.IOException;
import java.util.Collections;

public class ScatterPlot {
	private StringBuilder plot;
	private GetData hola;
	//LeerArchivos hola = new LeerArchivos();
	public ScatterPlot(){
		plot = new StringBuilder();
		
	}
	public ScatterPlot(String str) throws IOException{
		this();
		if(str.contains("txt")){
			hola = new ReadArchives(str);
		}
		else{
			hola = new ReadTuples(str);
		}
	}
	public String plotInConsole() throws IOException{
		String[] x1 = hola.NumberToAxisX(hola.EjeX);
        String[] y1 = hola.NumberToAxisY(hola.EjeY);
        for (int i=0; i< y1.length; ++i){
        	if (y1[i].length()>2){
        		plot.append(y1[i]+"| ");
        	}else{
        		plot.append(y1[i]+" | ");
        	}
        	for (int j=0; j < x1.length ; ++j){
    			if (Integer.parseInt(y1[i]) == Integer.parseInt(hola.diccionario.get(x1[j]))){
    				plot.append(" X  ");
    			} else{
    				plot.append("    ");
    			}
    		}
        	plot.append(System.lineSeparator());
        }
        plot.append("   ");
        plot.append(String.join("", Collections.nCopies(2*x1.length, "==")));
        plot.append(System.lineSeparator());
        plot.append("   ");
		for(int z=0; z<x1.length; ++z){
			plot.append("   "+x1[z]);
		}
		return plot.toString();
		
		//return null;
	}
	
	
	
}
