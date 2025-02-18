// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class MenuSanduícheTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void menuSanduche() {
    // Abrir site (diminuir test speed)
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/gabinete");
    driver.manage().window().setSize(new Dimension(890, 860));
    // Abrir menu sanduíche
    driver.findElement(By.cssSelector(".fa-bars")).click();
    // Abrir menu sanduíche pela 2º vez pq é bugado
    driver.findElement(By.cssSelector(".fa-bars")).click();
    // Navbar presente?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".navbar-nav"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".nav-item:nth-child(1) span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#legislativo-menu > span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#tutorial-menu > span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#account-menu > span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".nav-item:nth-child(1) > .nav-link"));
      assert(elements.size() > 0);
    }
    // A navbar tá mostrando as opções do menu na página?
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".nav-item:nth-child(1) span > span")).getText(), is("INÍCIO"));
    MatcherAssert.assertThat(driver.findElement(By.cssSelector("#legislativo-menu > span > span")).getText(), is("LEGISLATIVO"));
    MatcherAssert.assertThat(driver.findElement(By.cssSelector("#tutorial-menu > span > span")).getText(), is("TUTORIAL PLOA 2024"));
    MatcherAssert.assertThat(driver.findElement(By.cssSelector("#account-menu > span > span")).getText(), is("USUARIO"));
    // Fechar menu sanduíche
    driver.findElement(By.cssSelector(".fa-bars > path")).click();
  }
}