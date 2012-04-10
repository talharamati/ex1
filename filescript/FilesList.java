package filescript;

import java.io.File;
import java.util.ArrayList;

import filters.Filter;

public class FilesList {

    private ArrayList<File> originalFilesList;
    private ArrayList<File> filesList;
    
    public FilesList(String sourceDirectory) {
        // init originalFilesList to an empty list
        originalFilesList = new ArrayList<File>();

        // fill in the list with the source directory files recursively
        getAllDirectoryFiles(sourceDirectory);
        
        // copy the builded "original files list", which is for reading purpose only,
        // to filesList which will be used for ?????????????
        filesList = (ArrayList<File>) originalFilesList.clone();
    }
    
    private void getAllDirectoryFiles(String sourceDirectory) {
        // for each file
            // if file -> add to originalFilesList
            // else
                // getAllDirectoryFiles(sourceDirectory+file)
    }

    public void revert() {
        filesList = (ArrayList<File>) originalFilesList.clone();
    }

    public void filterList(ArrayList<Filter> filters) {
        for (File file : filesList) {
            for (Filter filter : filters) {
                if (!filter.accept(file)) {
                    removeFile(file);
                }
            }
        }
    }

    private void removeFile(File file) {
        filesList.remove(file);
    }
}
