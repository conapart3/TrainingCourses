package com.example.inversion_of_control;

import org.picocontainer.MutablePicoContainer;
import org.picocontainer.Parameter;
import org.picocontainer.defaults.ConstantParameter;
import org.picocontainer.defaults.DefaultPicoContainer;

public class PicoAssembler
{
    private MutablePicoContainer configureContainer()
    {
        MutablePicoContainer pico = new DefaultPicoContainer();
        Parameter[] finderParams = {new ConstantParameter("movies1.txt")};
        pico.registerComponentImplementation(MovieFinder.class, ColonMovieFinder.class, finderParams);
        pico.registerComponentImplementation(MovieLister.class);
        return pico;
    }
}
