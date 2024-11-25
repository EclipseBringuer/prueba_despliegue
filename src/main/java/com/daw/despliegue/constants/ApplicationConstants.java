package com.daw.despliegue.constants;

public class ApplicationConstants {
    private ApplicationConstants() {
    }

    // Ruta base de la API
    public static final String BASE_URL = "/api";

    // Rutas del controlador de Customer
    public static final String CUSTOMER_BASE_URL = BASE_URL + "/customer/";

    // Rutas del controlador de producto
    public static final String PRODUCT_BASE_URL = BASE_URL + "/product/";

    // Rutas del controlador de pedido
    public static final String ORDER_BASE_URL = BASE_URL + "/order/";

    // Rutas del controlador de item
    public static final String ITEM_BASE_URL = BASE_URL + "/item/";

    // Nombres de las tablas de la BD
    public static final String ORDER_TABLE_NAME = "order";
    public static final String CUSTOMER_TABLE_NAME = "customer";
    public static final String ITEM_TABLE_NAME = "item";
    public static final String PRODUCT_TABLE_NAME = "product";

    // Nombres de columnas usadas en código
    public static final String CUSTOMER_ID_COLUMN = "customer_id";
    public static final String ORDER_ID_COLUMN = "order_id";
    public static final String PRODUCT_ID_COLUMN = "order_id";

    // Nombres de campos en las relaciones de entidades
    public static final String ORDER_CUSTOMER_RELATIONAL_FIELD_NAME = "customer";
    public static final String ITEM_ORDER_RELATIONAL_FIELD_NAME = "order";
}
