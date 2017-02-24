package com.example.inversion_of_control;

import java.util.Arrays;
import java.util.List;

public class ColonMovieFinder implements MovieFinder
{
    private String filename;

    public ColonMovieFinder(String filename)
    {
        this.filename = filename;
    }

    @Override
    public List findAll()
    {
        return Arrays.asList(filename.split(":"));
    }
}
