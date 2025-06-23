/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 * Representa una categoría de licencia de conducción (por ejemplo
 * {@link CategoriaEnum#COLECTIVO} o {@link CategoriaEnum#MICROBUS}), y mantiene
 * una lista de asociaciones con choferes a través de {@link ChoferCategoria}.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class Categoria {

    private CategoriaEnum categoria;
    ArrayList<ChoferCategoria> choferCategoriaList;

    /**
     * Crea una nueva instancia de {@link Categoria} con el tipo indicado y su
     * lista de asociaciones.
     *
     * @param categoria tipo de categoría (por ejemplo COLECTIVO o MICROBUS)
     * @param choferCategoriaList lista de relaciones entre choferes y esta
     * categoría
     */
    public Categoria(CategoriaEnum categoria, ArrayList<ChoferCategoria> choferCategoriaList) {
        this.choferCategoriaList = choferCategoriaList;
        this.categoria = categoria;
    }

    /**
     * Devuelve el valor de la categoría.
     *
     * @return un valor de {@link CategoriaEnum}
     */
    public CategoriaEnum getCategoria() {
        return this.categoria;
    }

    /**
     * Establece un nuevo valor para la categoría.
     *
     * @param nuevaCategoria el nuevo valor a asignar
     */
    public void setCategoria(CategoriaEnum nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }

    /**
     * Devuelve una representación en texto de la categoría y su lista de
     * relaciones.
     *
     * @return cadena con información de la categoría
     */
    @Override
    public String toString() {
        return "Categoria{" + "categoria=" + categoria + ", choferCategoriaList=" + choferCategoriaList + '}';
    }
}
