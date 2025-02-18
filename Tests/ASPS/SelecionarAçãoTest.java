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
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class SelecionarAçãoTest {
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
  public void selecionarAo() {
    // Abrir site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    // Testar dropdown e botões
    driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).click();
    driver.findElement(By.xpath("//div/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//div/div/ng-select/div/span")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-dropdown-panel-items"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    // Tem alguma seleção?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-input:nth-child(3) > input"));
      assert(elements.size() > 0);
    }
    // Botão de interrogação existe?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".col:nth-child(9) .svg-inline--fa"));
      assert(elements.size() > 0);
    }
    // Tá escrito certo?
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".ng-value-label")).getText(), is("10 - Concessão de Vale Transporte e Auxílio Alimentação a Servidores da Secretaria da Casa Civil"));
    driver.findElement(By.xpath("//div/div/ng-select/div/span")).click();
    // Opções estão limitadas a tipo de Emenda?
    driver.findElement(By.xpath("//ng-select/div/span")).click();
    // Selecionar Impositiva Saúde
    driver.findElement(By.xpath("//span[contains(.,\'1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)\')]")).click();
    // Selecionar Modalidade
    driver.findElement(By.xpath("(//input[@type=\'text\'])[2]")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    // Abrir dropdown Ação
    driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[1013]/div/span"));
      assert(elements.size() == 0);
    }
  }
}