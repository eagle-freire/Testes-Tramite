// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.time.Duration;
public class CriarEmendaDeValorAoPLOA2024Test {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void criarEmendaDeValorAoPLOA2024() {
    // Abrir site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/gabinete");
    driver.findElement(By.id("kc-form-login")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("usuario");
    driver.findElement(By.id("password")).sendKeys("usuario");
    driver.findElement(By.id("kc-login")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1020, 1));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#jh-create-entity > span")));
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#jh-create-entity > span"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("#jh-create-entity > span")).click();
    // Verificar se está na página certa se guiando pelo texto

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1020, 1));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("jhi-legislativo-proposta-emenda-loa-heading")));
    MatcherAssert.assertThat(driver.findElement(By.id("jhi-legislativo-proposta-emenda-loa-heading")).getText(), is("Criar/Editar Remanejamento ao PLOA 2024"));
  }
}