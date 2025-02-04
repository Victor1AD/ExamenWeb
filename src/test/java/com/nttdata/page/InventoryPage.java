package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("index");
    public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By loginTittle = By.cssSelector("span.hidden-sm-down");
    public static By clothesTittle = By.id("category-3");
    public static By menTittle = By.cssSelector("a.subcategory-name");
    public static By compraTitle = By.cssSelector("h2.product-title");
    public static By cantidad = By.cssSelector("i.material-icons.touchspin-up");
    public static By carrito = By.cssSelector("button.btn.btn-primary.add-to-cart");
    public static By popup = By.id("myModalLabel");
    public static By precioT = By.cssSelector("span.value");
    public static By finalizar = By.cssSelector("a.btn.btn-primary i.material-icons");
    public static By carritoVal = By.className("h1");
    public static By precioVal = By.cssSelector("strong");
    public static By autosTitle = By.id("autos");
}
