package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WikiMediaRecentChange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Lob
    private String wikieventdata;


}
