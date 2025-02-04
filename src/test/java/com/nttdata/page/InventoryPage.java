package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("index");
    public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By loginTittle = By.cssSelector("span.hidden-sm-down");
    public static By clothesTittle = By.id("category-3");
    public static By menTittle = By.cssSelector("a.subcategory-name");

}
