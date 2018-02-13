package com.bookstore.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Book {

    // Attributes
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    @NotNull
    @Size(min = 1, max = 200)
    private String title;

    @Column(length = 10000)
    @Size(min = 1, max = 10000)
    private String description;

    @Column(name = "unit_cost")
    @Min(1)
    private Float unitCost;

    @Column(length = 50)
    @NotNull
    @Size(min = 1, max = 50)
    private String isbn;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    @Past
    private Date publicationDate;

    @Column(name = "nb_of_pages")
    private Integer nbOfPages;

    @Column(name = "image_url")
    private String imageURL;

    @Enumerated
    private Language language;

    // Constructor
    public Book() {
    }

    public Book(String title, String description, Float unitCost, String isbn, Date publicationDate, Integer nbOfPages, String imageURL, Language language) {
        this.title = title;
        this.description = description;
        this.unitCost = unitCost;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.nbOfPages = nbOfPages;
        this.imageURL = imageURL;
        this.language = language;
    }

    // Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescirption() {
        return description;
    }

    public void setDescirption(String descirption) {
        this.description = descirption;
    }

    public Float getUnitCos() {
        return unitCost;
    }

    public void setUnitCos(Float unitCos) {
        this.unitCost = unitCos;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public String getImageUrl() {
        return imageURL;
    }

    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    // toString()
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descirption='" + description + '\'' +
                ", unitCos=" + unitCost +
                ", isbn='" + isbn + '\'' +
                ", publicationDate=" + publicationDate +
                ", nbOfPages=" + nbOfPages +
                ", imageUrl='" + imageURL + '\'' +
                ", language=" + language +
                '}';
    }
}
