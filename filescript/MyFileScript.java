package filescript;

import java.util.ArrayList;
import static filescript.ProgramConstants.*;

public class MyFileScript {

    // define variables
    private static String sourceDirectory;
    private static String commandFile;
    private static ArrayList<Section> sections;
    private static FilesList filesList;

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            // initialize arguments
            initArguments(args);
            
            
            // parse commands file, put results into sections
            sections = new CommandsFileParser(commandFile).getSections();
            
            // list all source folder files, put results into filesList
            filesList = new FilesList(sourceDirectory);
            
            // iterate over sections
            for (Section section : sections) {
                
                // run filters over filesList
                filesList.filterList(section.getFilters());
                // print filter comments
                section.getComments()[FILTER].print();
            
                // sort filesList by given order
                // TODO
                // print order comments
                section.getComments()[ORDER].print();
            
                // do each action on each file (TODO how to implement)
                // print actions comments
                section.getComments()[ACTION].print();
            
            }
        }
        catch(Exception e) {
             exceptionsHandler(e);
        }
        // done!

    }

    private static void exceptionsHandler(Exception e) {
        // error handling according to exercise's description
        System.err.println("ERROR");
        System.exit(-1);
    }

    private static void initArguments(String[] args) throws IllegalArgumentException {
        // check invalid usage (err1)
        // check that the are 2 arguments
        if (args.length != REQUIRED_NUMBER_OF_ARGUMENTS) {
            throw new IllegalArgumentException();
        }
        sourceDirectory = args[0];
        commandFile = args[1];
    }


}
