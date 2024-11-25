package com.daw.despliegue.constants;

public class ApplicationConstants {
    private ApplicationConstants() {}

    // Ruta base de la API
    public static final String BASE_URL = "/api";

    // Rutas del controlador de Customer
    public static final String CUSTOMER_BASE_URL = BASE_URL + "/customer/";

    // Rutas del controlador de producto
    public static final String PRODUCT_BASE_URL = BASE_URL + "/product/";

    // Rutas del controlador de pedido
    public static final String ORDER_BASE_URL = BASE_URL + "/order/";
}
