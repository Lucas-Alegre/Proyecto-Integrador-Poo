/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

/**
 * Representa la relación entre un {@link Chofer} y una {@link Categoria},
 * incluyendo la fecha de vencimiento de la licencia. Esta clase permite modelar
 * qué categorías posee un chofer y hasta qué fecha son válidas.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class ChoferCategoria {

    private String fechaDeVencimiento;
    private Chofer chofer;
    private Categoria categoria;

    /**
     * Crea una nueva relación entre un chofer y una categoría, indicando la
     * fecha de vencimiento.
     *
     * @param fechaDeVencimiento fecha en formato String que indica hasta cuándo
     * es válida la categoría
     * @param chofer chofer asociado
     * @param categoria categoría de licencia asignada
     */
    public ChoferCategoria(String fechaDeVencimiento, Chofer chofer, Categoria categoria) {
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.chofer = chofer;
        this.categoria = categoria;
    }

    /**
     * Devuelve la fecha de vencimiento de esta categoría.
     *
     * @return fecha en formato String
     */
    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    /**
     * Establece una nueva fecha de vencimiento para esta categoría.
     *
     * @param fechaDeVencimiento nueva fecha como String
     */
    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    /**
     * Devuelve el {@link Chofer} asociado a esta relación.
     *
     * @return chofer correspondiente
     */
    public Chofer getChofer() {
        return chofer;
    }

    /**
     * Asocia un nuevo {@link Chofer} a esta relación.
     *
     * @param chofer chofer a asignar
     */
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    /**
     * Devuelve la {@link Categoria} correspondiente.
     *
     * @return categoría de licencia
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Establece una nueva {@link Categoria} para esta relación.
     *
     * @param categoria categoría a asignar
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve una representación en texto de la relación chofer-categoría.
     *
     * @return cadena con información de la relación
     */
    @Override
    public String toString() {
        return "ChoferCategoria{" + "fechaDeVencimiento=" + fechaDeVencimiento + ", chofer=" + chofer + ", categoria=" + categoria + '}';
    }

}
