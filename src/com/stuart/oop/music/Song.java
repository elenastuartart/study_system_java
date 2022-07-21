package com.stuart.oop.music;

public class Song implements ISong {

    private String name;

    private Author author;

    public Song() {
    }

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println(String.format("Играет песня %s, автор %s", this.getName(), this.getAuthor().getName()));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Author getAuthor() {
        return this.author;
    }
}
