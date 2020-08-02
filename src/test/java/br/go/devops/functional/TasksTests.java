package br.go.devops.functional;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTests {

    @Test
    public void testeAmbiente () {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com.br/");

    }
}
