package orders;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

public class AbsOrder implements Comparator {

    public int compare(Object file1, Object file2) {
        String file1Canon = null;
        String file2Canon = null;

            try {
                file1Canon = ((File)file1).getCanonicalPath();
                file2Canon = ((File)file2).getCanonicalPath();
            } catch (IOException e) {
                throw java.io.IOException; // TODO
            }

        return file1Canon.compareTo(file2Canon);

    }

}
