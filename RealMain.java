package barScatterPlots;

import java.io.*;
import java.util.*;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter; 
public class RealMain {
	/*@Parameter(description = "Tipo de plot")
	private String plot;
	// Se tiene que obtener de vuelta el valor del string
	@Parameter(names={"BarPlot", "ScatterPlot"}, description = "Debugging level")
	private Integer debug = 1; */
	@Parameter (names ="-P", variableArity=true)
	private ArrayList<String> values = new ArrayList<String>();
	@Parameter(names = "-F", description = "Path to an archive")
	private String pathToFile;
	public static void main(String ... argv)  {
		RealMain main = new RealMain();
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
		
		
		//System.out.println(string.toString());
		//ScatterPlot s = new ScatterPlot(pathToFile.toString());
		//ScatterPlot s = new ScatterPlot(string.toString());
		BarPlot b = new BarPlot(pathToFile.toString());
		 //BarPlot b = new BarPlot(string.toString());
		//System.out.println(s.plotInConsole());
		System.out.println(b.plotInConsole());
	}

}
