package com.example.inversion_of_control;

public class MovieLister
{
    public MovieLister(MovieFinder finder)
    {
        this.finder = finder;
    }

    private MovieFinder finder;

//    public Movie[] moviesDirectedBy(String arg)[]
//    {
//        List allMovies = finder.findAll();
//        for (Iterator it = allMovies.iterator(); it.hasNext();) {
//            Movie movie = (Movie) it.next();
//            if (!movie.getDirector().equals(arg)) it.remove();
//        }
//        return (Movie[]) allMovies.toArray(new Movie[allMovies.size()]);
//    }
}
