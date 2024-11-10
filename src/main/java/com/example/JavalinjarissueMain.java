package com.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class JavalinjarissueMain {

    public static void main(String[] args) {
        Javalin.create(config -> config.staticFiles.add(staticFiles -> {
                    staticFiles.hostedPath = "/";
                    staticFiles.directory = "/web";
                    staticFiles.location = Location.CLASSPATH;
                }))
                .get("/hello", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}