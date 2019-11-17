package web;

import org.junit.Test;


import java.io.File;

import static org.junit.Assert.*;

public class FileTreeBeanTest extends FileTreeBean {

    @Test
    public void testBuildFileTree() {
        StringBuilder st = new StringBuilder();
        buildFileTree(new File("d:\\tmp"), st);
        assertEquals(st.toString(), "<ul><li>folder</li><ul><li>test2.txt</li><ul></ul></ul><li>test.txt</li><ul></ul></ul>");
    }
}