package com.practica2.obradearte;

public class Menu {
    // booblean para bucle menu
    public static boolean terminar = false;

    // Opciones del menu
    private static final String MENSAJE_INICIAL = "Bienvenido al programa de la galeria JDWS ¿Que desea hacer?";
    private static final String OPCION_1 = "1. Visualizar todas las obras de arte";
    private static final String OPCION_2 = "2. Dar de alta una obra nueva";
    private static final String OPCION_3 = "3. Modificar datos de una obra de arte";
    private static final String OPCION_4 = "4. Mostrar datos de una obra";
    private static final String OPCION_5 = "5. Ver Precio de una obra";
    private static final String OPCION_6 = "6. Imprimir etiqueta de una obra de arte";
    private static final String OPCION_0 = "0. Salir del programa";

    // se usa para que quede bien esteticamente
    private static final String ESPACIOBLANCO = " ";

    // Opciones para el Case del Swich
    public static final int MOSTRAR_TODAS_LAS_OBRAS = 1;
    public static final int ALTA_OBRAS = 2;
    public static final int MODIFICAR_DATOS = 3;
    public static final int MOSTRAR_UNA_OBRA = 4;
    public static final int VER_PRECIO_OBRA = 5;
    public static final int IMPRIMIR_ETIQUETA = 6;
    public static final int SALIR = 0;

    // opcion de seleccion tecnica o escultura
    private static final String OPCION_CUADRO = "1. Cuadro";
    private static final String OPCIONES_ESCULTURA = "2. Escultura";

    // array de Opciones
    public static final String[] OPCIONES_MENU = { MENSAJE_INICIAL, ESPACIOBLANCO, OPCION_1, OPCION_2, OPCION_3,
            OPCION_4, OPCION_5, OPCION_6, OPCION_0 };

    // mensaje de error
    public static final String MENSAJE_ERROR = "Inserte un valor correcto";
    public static final String MENSAJE_ERROR_DOS = "Inserte numero 1 o 2";

    // Mensaje seleccionar opcion
    public static final String MENSAJES_ELECCION = "Seleccione una opcion";

    // Mensajes de CASE
    public static final String MENSAJE_VER_OBRAS = "Obras en Galeria";
    public static final String MENSAJE_CREAR = "Selecciona el tipo de obra quieres dar de alta";
    public static final String MENSAJE_MODIFICACION = "Seleccione obra que quiere modificar";
    public static final String MENSAJE_VISUALIZAR = "Selecciona la obra que quieres visualizar";
    public static final String MENSAJE_VER_PRECIO = "Selecciona una obra para ver el precio";
    public static final String MENSAJE_IMPRIMIR = "Selecciona una obra para imprimir su etiqueta";
    public static final String MENSAJE_FINAL = "Gracias por entrar al progrma de JDSW";

    // array de seleccion de opciones
    public static final String[] SELECCION_OPCIONES = { MENSAJE_CREAR, OPCION_CUADRO, OPCIONES_ESCULTURA };

    // Metodo para llamar mostrar Submenu de crear clase
    public static final String MENSAJE_ID = "El Id se introduce automaticamente";
    public static final String SOLICITAR_NOMBRE = "Inserte Nombre";
    public static final String SOLICITAR_AUTOR = "Inserte Autor";
    public static final String SOLICITAR_TIPO = "Inserte el tipo de Obra";
    public static final String SOLICITAR_PRECIO = "Inserte Precio";
    public static final String SOLICITAR_ALTURA = "Inserte Altura en metros";
    public static final String SOLICITAR_PESO = "Inserte Peso en toneladas";
    public static final String SOLICITAR_PIEZAS = "Inserte Numero de Piezas";
    public static final String SOLICITAR_DESCRIPCION = "Inserte Descripción";
    public static final String INSERTAR_TECNICA_O_MATERIAL = "Inserte como esta hecha la obra";

    public static final String LINEAS_DIVISORAS = "---------------------------------------";
    public static final String OBRA_AGREGADA = "Obra agregada";
    public static final String OBRA_MODIFICADA = "Obra Modificada";

}// cierre class