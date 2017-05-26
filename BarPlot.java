package barScatterPlots;

import java.io.IOException;
import java.util.Collections;

public class BarPlot extends Plots{
	public BarPlot(){
		super();		
	}
	public String plotInConsole() {
        for (int i=0; i< this.yAxis.length; ++i){
        	if (this.yAxis[i].length()>2){
        		plot.append(this.yAxis[i]+"| ");}
        	else{
        		plot.append(this.yAxis[i]+" | ");
        		
        	}
        	for (int j=0; j < this.xAxis.length ; ++j){
    			if (Integer.parseInt(this.yAxis[i])<= Integer.parseInt(data.getdiccionario().get(this.xAxis[j]))){
    				plot.append("XX  ");
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
	public void SetAxis() {
		setXAxis(data.LetterToAxis()); 
        setYAxis(data.NumberToAxisY(data.getEjeY()));
	}
	@Override
	public void setXMaximum(int max) {
		System.out.println("No se debe ocupar el comando -x para BarPlots");
		System.exit(0);
		
	}
	public void setPath(String string) throws IOException {
		this.path = string;
		this.CheckPlot();
		this.SetAxis();
		/*setXAxis(data.LetterToAxis()); 
        setYAxis(data.NumberToAxisY(data.getEjeY())); */
		
	}
	
}
