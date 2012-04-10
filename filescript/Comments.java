package filescript;

import java.util.ArrayList;

public class Comments {
    private ArrayList<String> comments;
    
    public Comments() {
        comments = new ArrayList<String>();
    }
    
    public void insertComment(String comment) {
        comments.add(comment);
    }
    
    public void print() {
        for (int i=0; i<comments.size(); i++) {
            System.out.println(comments.get(i));
        }
    }
}
