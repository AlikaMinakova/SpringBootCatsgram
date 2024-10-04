package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

public class Post {
    private final String author;
    private final Instant createDate = Instant.now(); //    create date
    private String description;
    private String photoUrl;

    public Post(String author, String description, String photoUrl) {
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", createDate=" + createDate +
                ", description='" + description + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}
