package com.example.j8_new_features;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Nashorn
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        // When wrapping JS in Java must delimit JS literals with ' not " or \"
        String script = "var welcome = 'Hello';"
            + "welcome += ', DisplayOnScreen'; "
            + "welcome;";

        // returned as Object as eval script doesn't know in advance what its getting back, but you can cast it yourself
        //Object result = null;
        String result = null;
        try {
            //result = engine.eval(script);
            result = (String) engine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.println("There was a Javascript error.");
            e.printStackTrace();
        }

        // better practise to put all your JS code into a separate file.
        File f = new File("C:/Workspace/testapp/src/main/resources/scripts/readurl.js");
        Reader reader = new FileReader(f);

        result = null;
        try {
            result = (String) engine.eval(reader);
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.println("There was a Javascript error.");
            e.printStackTrace();
        }
    }
}
