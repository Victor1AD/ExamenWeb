package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;


    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda() {
        driver = getDriver();
    //    driver.get("https://www.saucedemo.com/");
        driver.get("https://qalab.bensg.com/store/es/");
        screenShot();

    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario_y_clave(String user, String password) {
        InventorySteps inventorySteps = new InventorySteps(driver);
        inventorySteps.getLogin();
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }


    @Cuando("navego a la categoria Clothes y subcategoria Men")
    public void navego_a_la_categoria_Clothes_y_subcategoria_men() {
        InventorySteps inventorySteps = new InventorySteps(driver);
        inventorySteps.getClothes();
        inventorySteps.getMen();

    }

    @Y("agrego 2 unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito() throws InterruptedException {
        InventorySteps inventorySteps = new InventorySteps(driver);
        inventorySteps.getCompra();
        inventorySteps.getCantidad();
        inventorySteps.getCarrito();

        Thread.sleep(1000);
    }

     @Entonces("valido en el popup la confirmación del producto agregado {string}")
     public void valido_en_el_popup_la_confirmación_del_producto_agregado(String expectedTitle ){
        String title = inventorySteps(driver).getPopUp();

        Assertions.assertEquals(expectedTitle, title);

    }

    @Entonces("valido en el popup que el monto total sea calculado correctamente {string}")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente(String expectedTitle ){
        String title = inventorySteps(driver).getPrecioT();

        Assertions.assertEquals(expectedTitle, title);

    }

    @Cuando("finalizo la compra")
    public void finalizo_la_compra()throws InterruptedException{
        InventorySteps inventorySteps = new InventorySteps(driver);
        inventorySteps.getFinalizar();
        Thread.sleep(1000);

    }

    @Entonces("valido el titulo de la pagina del {string}")
        public void valido_el_titulo_de_la_pagina_del(String expectedTitle){
        String title = inventorySteps(driver).getCarritoVal();
        Assertions.assertEquals(expectedTitle, title);

    }

    @Y ("vuelvo a validar el calculo de precios en el carrito {string}")
        public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito(String expectedTitle){
        String title = inventorySteps(driver).getPrecioVal();
        Assertions.assertEquals(expectedTitle, title);
    }

    @Cuando("navego a la categoria autos")
        public void navego_a_la_categoria_autos(){
        InventorySteps inventorySteps = new InventorySteps(driver);
        inventorySteps.getAutos();
    }



}
