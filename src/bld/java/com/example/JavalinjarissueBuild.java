package com.example;

import rife.bld.Project;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;

public class JavalinjarissueBuild extends Project {
    public JavalinjarissueBuild() {
        pkg = "com.example";
        name = "Javalinjarissue";
        mainClass = "com.example.JavalinjarissueMain";
        version = version(0,1,0);

        downloadSources = true;
        repositories = List.of(MAVEN_CENTRAL, RIFE2_RELEASES);
        scope(compile)
                .include(dependency("io.javalin", "javalin"
                        , version(6, 3, 0)))
                .include(dependency("org.slf4j", "slf4j-simple"
                        , version(2, 0, 16)));
        scope(test)
            .include(dependency("org.junit.jupiter", "junit-jupiter", version(5,11,0)))
            .include(dependency("org.junit.platform", "junit-platform-console-standalone", version(1,11,0)));
    }

    public static void main(String[] args) {
        new JavalinjarissueBuild().start(args);
    }
}