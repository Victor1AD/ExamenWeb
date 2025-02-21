package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }

    public void getLogin(){
        this.driver.findElement(InventoryPage.loginTittle).click();
    }

    public void getClothes(){
        this.driver.findElement(InventoryPage.clothesTittle).click();
    }

    public void getMen(){
        this.driver.findElement(InventoryPage.menTittle).click();
    }

    public void getCompra(){
        this.driver.findElement(InventoryPage.compraTitle).click();
    }

    public void getCantidad(){
        this.driver.findElement(InventoryPage.cantidad).click();
    }

    public void getCarrito(){
        this.driver.findElement(InventoryPage.carrito).click();
    }

    public String getPopUp(){
        return this.driver.findElement(InventoryPage.popup).getText();
    }

    public String getPrecioT(){
        return this.driver.findElement(InventoryPage.precioT).getText();
    }

    public void getFinalizar(){
        this.driver.findElement(InventoryPage.finalizar).click();
    }

    public String getCarritoVal(){
        return this.driver.findElement(InventoryPage.carritoVal).getText();
    }

    public String getPrecioVal(){
        return this.driver.findElement(InventoryPage.precioVal).getText();
    }

    public void getAutos(){
        this.driver.findElement(InventoryPage.autosTitle).click();
    }
}
