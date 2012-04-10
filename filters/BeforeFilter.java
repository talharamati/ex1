package filters;

import java.io.File;
import java.text.SimpleDateFormat;

public class BeforeFilter extends DateFilter {

	
	public BeforeFilter(SimpleDateFormat date) {
		super(date);
	}

	@Override
	public boolean accept(File file) {
            return false;
            //TODO
	}
	


}
