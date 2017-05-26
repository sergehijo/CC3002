package barScatterPlots;

import java.io.*;
import java.util.*;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter; 
public class Main {
	@Parameter(description = "Tipo de plot")
	private List<String> plot = null;
	@Parameter (names ="-P", variableArity=true)
	private ArrayList<String> values = new ArrayList<String>();
	@Parameter(names = "-F", description = "Path to an archive")
	private String pathToFile= "";
	@Parameter(names="-x")
	private int x = 0;
	@Parameter(names="-y")
	private int y = 0;
	
	private PlotFlyWeightFactory flw;
	public static void main(String ... argv)  {
		Main main = new Main();
	    
		JCommander.newBuilder()
			.addObject(main)
			.build()
			.parse(argv);
			try {
				main.run();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void run() throws IOException {
		StringBuilder string = new StringBuilder();
		for (String str: values){
			string.append(str);
			string.append(" ");
		}
		flw = new PlotFlyWeightFactory();
		IPlots typePlot = flw.getPlot(plot.get(0));
		if(plot.get(0).equals("BarPlot")){
			if (x != 0){
				System.out.println("No se debe ocupar el comando -x para BarPlots");
				System.exit(0);
			}
			else if (!pathToFile.equals("")){
				typePlot.setPath(pathToFile.toString());
				typePlot.setYMaximum(y);
				System.out.println(typePlot.plotInConsole());
			}
			else if (!string.toString().equals("")){
				typePlot.setPath(string.toString());
				typePlot.setYMaximum(y);
				System.out.println(typePlot.plotInConsole());
			}
			else{
				System.out.println("-F para Archivos, -P para ingresar tuplas a mano,"
						+ "mientas que los tipos de plot son BarPlot o ScatterPlot.");
			}

		}
		else if (plot.get(0).equals("ScatterPlot")){
			if (!pathToFile.equals("")){
				typePlot.setPath(pathToFile.toString());
				typePlot.setYMaximum(y);
				typePlot.setXMaximum(x);
				System.out.println(typePlot.plotInConsole());
			}
			else if (!string.toString().equals("")){
				typePlot.setPath(string.toString());
				typePlot.setYMaximum(y);
				typePlot.setXMaximum(x);
				System.out.println(typePlot.plotInConsole());
			}
			else{
				System.out.println("-F para Archivos, -P para ingresar tuplas a mano,"
						+ "mientas que los tipos de plot son BarPlot o ScatterPlot.");
			}
		}
		//System.out.println(string.toString());
		//System.out.println(typePlot.plotInConsole());
		//System.out.println(x);
		//s.setXMaximum(x);
		//s.setYMaximum(y);
		//String[] EjeX = s.getAxisX();
		/*IPlots s = new ScatterPlot();
		s.setPath(string.toString());
		//System.out.println(string.toString());
		s.setXMaximum(x);
		s.setYMaximum(y);
		System.out.println(string.toString());
		System.out.println(s.plotInConsole()); */
		//ScatterPlot s = new ScatterPlot(string.toString());
		//IPlots b = new BarPlot();
		//b.setPath(pathToFile.toString());
		 //BarPlot b = new BarPlot(string.toString());
		//b.setXMaximum(x);
		// HAY UN BUG PARA SETYMAXIMUM;
		//b.setYMaximum(y);
		//System.out.println(b.plotInConsole());
		//System.out.println(b.plotInConsole());
	}

}
