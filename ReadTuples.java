package barScatterPlots;

import java.util.List;

public class ReadTuples extends GetData{
	public ReadTuples(){
		super();
	}
	public ReadTuples(String str){
		this();	
		String dato[] = str.split(" ");
		for(int i=0; i<dato.length;++i){
			String data[] = dato[i].split(",");
			this.EjeX.add(data[0]);
			this.EjeY.add(data[1]);
			diccionario.put(data[0], data[1]);				
			}
		}
	public List<String> getEjeX() {
		return this.EjeX;
	}
	public List<String> getEjeY() {
		return this.EjeY;
	}
	}
