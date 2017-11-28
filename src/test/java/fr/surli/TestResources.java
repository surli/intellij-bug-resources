package fr.surli;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class TestResources {

	@Test
	public void testModuleInfoExists() {
		String basePath = "./src/test/resources";
		String[] modules = new String[] { "foo/module-info.java", "bar/module-info.java" };

		for (String m : modules) {
			File f = new File(basePath, m);
			assertTrue("module-info file \""+f.getPath()+"\" does not exist",f.exists());
		}
	}
}
