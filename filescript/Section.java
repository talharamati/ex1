package filescript;

import java.util.ArrayList;
import filters.BasicFilter;
import filters.Filter;
import static filescript.ProgramConstants.*;

public class Section {
	private ArrayList<Filter> filters;
	private ArrayList<String> actions;
	private String order;
	private Comments[] comments;

	public Section() {
		this.filters = new ArrayList<Filter>();
		this.actions = new ArrayList<String>();
		
		this.order = DEFAULT_FILES_ORDER;
		
		this.comments = new Comments[3];
		this.comments[FILTER] = new Comments();
		this.comments[ACTION] = new Comments();
		this.comments[ORDER] = new Comments();
	}
	
	public Comments[] getComments() {
	    return comments;
	}

        public ArrayList<Filter> getFilters() {
            return filters;
        }

}
