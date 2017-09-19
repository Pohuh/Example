package com.netcracker.ssau;

import lombok.Data;
import org.springframework.hateoas.Identifiable;

import javax.persistence.*;

/**
 * Created by Pohuh on 18.09.2017.
 */
@Data
@Entity
@Table(name = "Cd")
public class Cd implements Identifiable<Long> {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String artist;

    @Column
    private String genre;

    public Cd(){}

    public Cd(String title, String artist, String genre){}
}