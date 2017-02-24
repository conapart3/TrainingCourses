package com.example.inversion_of_control;

import java.util.Arrays;
import java.util.List;

public class CommaMovieFinder implements MovieFinder
{
    private String movieListFile;

    public CommaMovieFinder(String movieListFile)
    {
        this.movieListFile = movieListFile;
    }

    @Override
    public List findAll()
    {
        return Arrays.asList(movieListFile.split(","));
    }
}
