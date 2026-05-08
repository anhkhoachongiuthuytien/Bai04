package com.practice.maven;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lop minh hoa loi duong dan phu thuoc he dieu hanh.
 */
public class PathResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(PathResolver.class);

    /**
     * Tao duong dan theo separator cua he dieu hanh.
     *
     * @param directory thu muc
     * @param fileName ten file
     * @return duong dan theo separator hien tai
     */
    public String buildPath(String directory, String fileName) {
        String path = directory + File.separator + fileName;
        LOGGER.info("Build path: {}", path);
        return path;
    }
}
