package com.example.mycollections.controllers;


import com.example.mycollections.models.Book;
import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Superman", 2025, "Superman", 90, "James Gunn"));
        add(new Movie("To Kill a Mockingbird", 2020, "Harper Lee", 90, "1960, 281"));
        add(new Movie("1984", 2000, "George Orwell", 100,  "1949, 328"));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")

    public String getMovieList() {

            String movieList = "<ul>";
            for (Movie m : movies) {
                movieList += "<li>" + m + "</li>";
            }
            movieList += "</ul>";


            return """
                    <html>
                        <body>
                            <h1>Books</h1>
                            <ul>
                    """ +
                    movies +
                    """
                                    </ul>
                                </body>
                            """;
        }
    }


