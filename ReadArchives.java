package barScatterPlots;
import java.io.*;
import java.util.List;
public class ReadArchives extends GetData{
	public ReadArchives(){
		super();
	}
	public ReadArchives(String path) {
		this();
		File file = new File(path);		
		FileInputStream fstream;
		try {
			fstream = new FileInputStream(file); 
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		while ((strLine = br.readLine()) != null){
		  String Linea[] = strLine.split(",");
		  this.EjeX.add(Linea[0]);
		  this.EjeY.add(Linea[1]);
		  diccionario.put(Linea[0], Linea[1]);
		}
		br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<String> getEjeX() {
		return this.EjeX;
	}
	public List<String> getEjeY() {
		return this.EjeY;
	}
}
