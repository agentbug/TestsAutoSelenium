package fr.ima.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSelenium {

	public static void main(String[] args) {
		
		// D閒init l'endroit o� est install� le driver qui g鑢e Chrome
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");		
		
		// Instancie un objet ChromeDriver qui permet de commander Chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.fr/");

		// Permet de faire une pause pour simuler le comportement de l'utilisateur
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// R閏up鑢e dans la page web la balise dont l'id s'appelle searchInput
		WebElement zonetexteRecherche = driver.findElement(By.id("lst-ib"));
		// Ecrit dans la zone textuelle "searchInput"
		zonetexteRecherche.sendKeys("IMA Angers");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
//		// R閏up鑢e dans la page web l'objet input type="button" 
//		WebElement boutonRecherche = driver.findElement(By.name("btnK"));
//		// Clic sur le bouton
//		boutonRecherche.click();
		
		// Clic sur le lien IMA
		WebElement lien = driver.findElement(By.linkText("IMA | Institut de Mathématiques Appliquées"));	
		lien.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clic sur le lien IMA
		WebElement lienFormation = driver.findElement(By.linkText("FORMATION"));	
		
		Actions action = new Actions(driver);
		action.moveToElement(lienFormation).perform();
		//lien2.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//WebElement lien3 = driver.findElement(By.id("menu-item-115"));	
		
		WebElement lienDiplome = driver.findElement(By.linkText("DIPLÔME IMA"));	
		
		lienDiplome.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
	}
}
