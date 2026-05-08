package com.practice.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import org.junit.jupiter.api.Test;

/**
 * Unit test for PathResolver.
 */
class PathResolverTest {
    @Test
    void buildPathShouldUseOperatingSystemSeparator() {
        PathResolver resolver = new PathResolver();

        String actualPath = resolver.buildPath("data", "input.txt");
        String expectedPath = "data" + File.separator + "input.txt";

        assertEquals(expectedPath, actualPath);
    }
}
