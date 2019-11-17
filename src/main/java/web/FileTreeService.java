package web;

import java.io.File;
/**
 * Build file tree in html.
 *
 */
public class FileTreeService {
    private static void buildFileTree(File path, StringBuilder st){
        st.append("<ul>");
        if(!path.isFile()){
            File files[] = path.listFiles();
            for(File dirOrFile: files){
                st.append("<li>" + dirOrFile.getName() + "</li>");
                buildFileTree(dirOrFile, st);
            }
        }
        st.append("</ul>");
    }

    /**
     * Hide constructor
     */
    private FileTreeService() {}

    /**
     * Recursive build  file tree
     * @return string, contains html view file tree
     */
    public static String getHTTPFileTree(String path)
    {
        StringBuilder st = new StringBuilder();
        buildFileTree(new File(path), st);
        return st.toString();
    }
}
