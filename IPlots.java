package barScatterPlots;

import java.io.IOException;

public interface IPlots {
	String plotInConsole() throws IOException;
	void setPath(String string) throws IOException;
	void setXMaximum(int x);
	void setYMaximum(int y);
}

