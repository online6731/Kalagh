package word.in.news;

import java.awt.Image;

public class news {
    String title;
    String link;
    String description;
    String author;
    String date;
    Image image;
    int number;

    news(String title, String link, String description, String author, String date, Image image, int number) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.author = author;
        this.date = date;
        this.image = image;
        this.number = number;
    }
}
