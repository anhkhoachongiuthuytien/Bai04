package com.practice.maven;

/**
 * Entry point for the path resolver demo.
 */
public class Main {
    /**
     * Run the demo application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        PathResolver resolver = new PathResolver();
        String path = resolver.buildPath("data", "input.txt");

        System.out.println(path);
    }
}
