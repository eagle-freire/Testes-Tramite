// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class DescreveroObjetoTest {
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
  public void descreveroObjeto() {
    // Abrir site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    // Verificar botões
    {
      List<WebElement> elements = driver.findElements(By.id("field_objetivo"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("field_objetivo")).click();
    MatcherAssert.assertThat(driver.findElement(By.xpath("//*[@id=\"objetivoHelpBlock\"]/span")).getText(), is("Justifique aqui a proposta de emenda a PLOA."));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#objetivoHelpBlock > .stretched-link"));
      assert(elements.size() > 0);
    }
    MatcherAssert.assertThat(driver.findElement(By.xpath("//*[@id=\"objetivoHelpBlock\"]/span")).getText(), is("Justifique aqui a proposta de emenda a PLOA."));
    // botão (?)
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#objetivoHelpBlock > .stretched-link"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".justify-content-center")).click();
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".form-text")).getText(), is("O campo é obrigatório."));
    // caixa de texto é digitável?
    {
      WebElement element = driver.findElement(By.id("field_objetivo"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    driver.findElement(By.id("field_objetivo")).sendKeys("amendoim");
    {
      String value = driver.findElement(By.id("field_objetivo")).getAttribute("value");
      MatcherAssert.assertThat(value, is("amendoim"));
    }
  }
}