package barScatterPlots;

import java.io.IOException;
import java.util.Collections;

public class BarPlot {
	private StringBuilder plot;
	private GetData hola;
	//LeerArchivos hola = new LeerArchivos();
	public BarPlot(){
		plot = new StringBuilder();
		
	}
	public BarPlot(String str){
		this();
		if(str.contains(".txt")){
			hola = new ReadArchives(str);
			//System.out.println("hola");
		}
		else{
			hola = new ReadTuples(str);
			//System.out.println(str);
		}
		
	}
	
	public String plotInConsole() {
		String[] x1 = this.hola.LetterToAxis();
        String[] y1 = this.hola.NumberToAxisY(this.hola.EjeY);
        /*for (String str:x1){
        	System.out.println(str);
        }
        for (String str:y1){
        	System.out.println(str);
        }*/
        for (int i=0; i< y1.length; ++i){
        	if (y1[i].length()>2){
        		plot.append(y1[i]+"| ");}
        	else{
        		plot.append(y1[i]+" | ");
        		
        	}
        	for (int j=0; j < x1.length ; ++j){
    			if (Integer.parseInt(y1[i])<= Integer.parseInt(hola.diccionario.get(x1[j]))){
    				plot.append("XX  ");
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
	}
	
}
