package com.practice.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lop minh hoa loi duong dan phu thuoc he dieu hanh.
 */
public class PathResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(PathResolver.class);

    /**
     * Tao duong dan theo kieu Windows.
     *
     * @param directory thu muc
     * @param fileName ten file
     * @return duong dan dung dau gach cheo nguoc
     */
    public String buildPath(String directory, String fileName) {
        String path = directory + "\\" + fileName;
        LOGGER.info("Build path: {}", path);
        return path;
    }
}
