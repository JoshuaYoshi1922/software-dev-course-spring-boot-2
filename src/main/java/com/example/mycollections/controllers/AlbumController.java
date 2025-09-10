package com.example.mycollections.controllers;


import com.example.mycollections.models.Album;
import com.example.mycollections.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/albums")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("The Great dude", 1292, "Bob", "180", 32));
        add(new Album("To Kill yes", 12354, "Billt", "Here now", 23));
        add(new Album("The hear", 1999, "BJ", "My baby made me late", 39));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumJSON() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Books</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }
}
