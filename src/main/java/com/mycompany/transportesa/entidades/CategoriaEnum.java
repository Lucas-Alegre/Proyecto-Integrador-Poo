/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

/**
 * Enumeración que representa los tipos de categorías de licencia requeridas
 * para conducir un {@link Vehiculo}.
 *
 * <ul>
 * <li>{@link #MICROBUS} - Para conducir vehículos tipo minibus.</li>
 * <li>{@link #COLECTIVO} - Para conducir vehículos tipo colectivo.</li>
 * </ul>
 *
 * Esta enumeración se utiliza para validar que el {@link Chofer} tenga la
 * categoría adecuada al asignarle un viaje con determinado tipo de vehículo.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public enum CategoriaEnum {
    MICROBUS,
    COLECTIVO;
}
