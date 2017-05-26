package barScatterPlots;

import java.util.HashMap;
import java.util.Map;

public class PlotFlyWeightFactory {
	static Map<String, IPlots> datos = new HashMap<String,IPlots>();
	static{
		datos.put("BarPlot", new BarPlot());
		datos.put("ScatterPlot", new ScatterPlot() );
		
	}
	/**
	 * getIPlot
	 * patron de diseño que crea el tipo de grafico que sera usado en el plot
	 * @author Gabriela
	 *
	 */
	public IPlots getPlot(String key) {
		if (datos.containsKey(key)){
			return datos.get(key);
		}
		else{
			System.out.print(" El tipo de grafico no es el indicado. Por favor intente con BarPlot o ScatterPlot");
			throw new java.lang.NullPointerException();
		}
	}

}
