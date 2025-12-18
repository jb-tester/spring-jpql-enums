package com.mytests.enumLiteralsInQueries;


import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "issues", schema = "enums")

public class Issues {
    public static final String PATTERN = "table";
    public static final String AUTHOR1 = "irina";
    public static final String AUTHOR2 = "ira";
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "author")
    private String author;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private PriorityEnum priority;
    @Basic
    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private StateEnum state;
    @Basic
    @Column(name = "type")
    private TypeEnum type;

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


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }


    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public enum StateEnum {
        Open, Closed
    }

    @Override
    public String toString() {
        return "Issues{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", description='" + description + '\'' +
               ", priority=" + priority +
               ", state=" + state +
               ", type=" + type +
               '}';
    }
}
