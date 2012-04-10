package filters;

import java.io.File;
import java.text.SimpleDateFormat;

public abstract class DateFilter implements BasicFilter {

	private SimpleDateFormat date;
	
	@Override
	public abstract boolean accept(File file);

	public DateFilter(SimpleDateFormat date) {
		this.date = date;
	}
}
