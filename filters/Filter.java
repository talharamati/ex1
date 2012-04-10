package filters;

import java.io.File;
import java.util.ArrayList;

public class Filter implements BasicFilter {
    
    private ArrayList<BasicFilter> basicFilters;
    
    public Filter() {
        basicFilters = new ArrayList<BasicFilter>();
    }

    @Override
    public boolean accept(File file) {
        // "OR" mechanism of basicFilters of the filter
        for (BasicFilter basicFilter : basicFilters) {
            if (basicFilter.accept(file)) {
                return true;
            }
        }
        return false;
    }
}
