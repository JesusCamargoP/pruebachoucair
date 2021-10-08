package Seleniumgleucode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class test {

    private ChromeDriver driver;

    @Given("^El usuario se encuentra en la pagina de inicio de la plataforma$")
    public void el_usuario_se_encuentra_en_la_pagina_de_inicio_de_la_plataforma() throws Throwable {
       System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedrivers.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();

    }

    @When("^hace click sobre el boton  shop now o sobre el carrousel$")
    public void hace_click_sobre_el_boton_shop_now() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("homepage-slider"));
        titleComicsLocator.click();
    }

    @Then("^se debe redirigir a la opcion comprar ahora$")
    public void se_debe_redirigir_a_la_opcion_comprar_ahora() throws Throwable {
        WebElement pageTitleLocator= driver.findElement(By.className("tab-content"));
        Assert.assertTrue("No se redirecciono",pageTitleLocator.isDisplayed());
        assertEquals("BEST SELLERS", pageTitleLocator.getText());
    }







}
