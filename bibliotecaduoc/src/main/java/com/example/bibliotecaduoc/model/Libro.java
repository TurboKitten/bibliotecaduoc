package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.data;
import lombok.NoArgsConstructor

@data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}