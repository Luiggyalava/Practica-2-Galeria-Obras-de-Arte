package com.practica2.obradearte;

import static com.practica2.obradearte.Menu.*;
import static com.practica2.obradearte.AlmacenGaleria.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GalariaApp {
    public static void main(String[] args) {

        // crear Almacen para guardar las obras
        AlmacenGaleria almacen = new AlmacenGaleria();

        int id = 0, piezas = 0;
        String nombre = null, autor = null, tipo = null, descripcion = null, tecnicaOMaterial = null;
        double precio = 0, altura = 0, peso = 0;
        int opcionUser = 0;
        int opcion;

        // mostrar obras de arte Iniciales
        AlmacenGaleria.visualizarObras();
        System.out.println(LINEAS_DIVISORAS);

        // inicializar Scanner fuera del bucle
        Scanner seleccionOpcion = new Scanner(System.in);

        // bucle para el menu
        while (!terminar) {

            // Bucle para mostrar siempre el menu
            for (final String OPCION_MENU : OPCIONES_MENU) {
                System.out.println(OPCION_MENU);
            }
            System.out.println(LINEAS_DIVISORAS);

            System.out.println(MENSAJES_ELECCION);
            try {
                opcionUser = seleccionOpcion.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(MENSAJE_ERROR);
                seleccionOpcion.next();
                continue;
            }

            // Swich para el menu
            switch (opcionUser) {
                case MOSTRAR_TODAS_LAS_OBRAS:
                    System.out.println(MENSAJE_VER_OBRAS);
                    AlmacenGaleria.copiarArrayMasObrasNueva();
                    AlmacenGaleria.visualizarObras();
                    break;

                case ALTA_OBRAS:
                    for (final String SELECCION_OPCION : SELECCION_OPCIONES) {
                        System.out.println(SELECCION_OPCION);
                    }
                    System.out.println(LINEAS_DIVISORAS);
                    System.out.println(MENSAJES_ELECCION);
                    try {
                        opcion = seleccionOpcion.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println(MENSAJE_ERROR_DOS);
                        seleccionOpcion.next();
                        continue;
                    }

                    System.out.println(MENSAJE_ID);
                    id = AlmacenGaleria.ponerIdAutomatico();

                    System.out.println(SOLICITAR_NOMBRE);
                    nombre = solicitarDatosString();

                    System.out.println(SOLICITAR_AUTOR);
                    autor = solicitarDatosString();

                    System.out.println(INSERTAR_TECNICA_O_MATERIAL);
                    tecnicaOMaterial = solicitarDatosString();

                    System.out.println(SOLICITAR_PRECIO);
                    precio = solicitarDatosDouble();

                    System.out.println(SOLICITAR_ALTURA);
                    altura = solicitarDatosDouble();

                    System.out.println(SOLICITAR_PESO);
                    peso = solicitarDatosDouble();

                    System.out.println(SOLICITAR_PIEZAS);
                    piezas = solicitarDatosInt();

                    System.out.println(SOLICITAR_DESCRIPCION);
                    descripcion = solicitarDatosString();

                    // solicitamos datos
                    if (opcion == 1) {
                        tipo = "Cuadro";
                        almacen.crearObras(opcion, id, nombre, autor, tipo, precio, altura,
                                peso, piezas, descripcion, tecnicaOMaterial);

                        System.out.println(OBRA_AGREGADA);
                        copiarArrayMasObrasNueva();
                        AlmacenGaleria.visualizarObras();

                    } // cierre if
                    else if (opcion == 2) {
                        tipo = "Escultura";
                        almacen.crearObras(opcion, id, nombre, autor, tipo, precio, altura,
                                peso, piezas, descripcion, tecnicaOMaterial);

                        System.out.println(OBRA_AGREGADA);
                    }
                    break;

                case MODIFICAR_DATOS:
                    System.out.println(MENSAJE_MODIFICACION);
                    AlmacenGaleria.mostrarIdYNombre();
                    opcion = seleccionOpcion.nextInt();
                    opcion -= 1;

                    System.out.println(SOLICITAR_NOMBRE);
                    nombre = solicitarDatosString();

                    System.out.println(SOLICITAR_AUTOR);
                    autor = solicitarDatosString();

                    System.out.println(INSERTAR_TECNICA_O_MATERIAL);
                    tecnicaOMaterial = solicitarDatosString();

                    System.out.println(SOLICITAR_PRECIO);
                    precio = solicitarDatosDouble();

                    System.out.println(SOLICITAR_ALTURA);
                    altura = solicitarDatosDouble();

                    System.out.println(SOLICITAR_PESO);
                    peso = solicitarDatosDouble();

                    System.out.println(SOLICITAR_PIEZAS);
                    piezas = solicitarDatosInt();

                    System.out.println(SOLICITAR_DESCRIPCION);
                    descripcion = solicitarDatosString();

                    AlmacenGaleria.modificarObras(opcion, nombre, autor, tipo, precio, altura,
                            peso, piezas, descripcion, tecnicaOMaterial);
                    break;

                case MOSTRAR_UNA_OBRA:
                    System.out.println(MENSAJE_VISUALIZAR);
                    AlmacenGaleria.mostrarIdYNombre();
                    opcion = seleccionOpcion.nextInt();
                    opcion -= 1;
                    System.out.println(almacenObras[opcion].verUnaObraToString());
                    break;

                case VER_PRECIO_OBRA:
                    System.out.println(MENSAJE_VER_PRECIO);
                    AlmacenGaleria.mostrarIdYNombre();
                    opcion = seleccionOpcion.nextInt();
                    AlmacenGaleria.verPrecioObra(opcion);
                    break;

                case IMPRIMIR_ETIQUETA:
                    System.out.println(MENSAJE_IMPRIMIR);
                    AlmacenGaleria.mostrarIdYNombre();
                    opcion = seleccionOpcion.nextInt();
                    opcion -= 1;
                    System.out.println(almacenObras[opcion].imprimirEtiquetaToString());
                    break;

                case SALIR:
                    terminar = true;
                    System.out.println(MENSAJE_FINAL);
                    break;

                default:
                    System.out.println(MENSAJE_ERROR);
            }// cierre switch
        } // cierre while
        seleccionOpcion.close();
    }// cierre main
} // cierre main
