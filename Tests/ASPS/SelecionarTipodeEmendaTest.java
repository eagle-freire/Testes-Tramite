// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class SelecionarTipodeEmendaTest {
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
  public void selecionarTipodeEmenda() {
    // Abrir Site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    // Teste botões do menu
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
    // Verificar se opções aparecem e garantir que texto tá certo (sem seleção)
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-option-label"));
      assert(elements.size() > 0);
    }
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".ng-option-label")).getText(), is("1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)"));
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    driver.findElement(By.xpath("//div/div[2]/div")).click();
    // Verificar se opções aparecem e garantir que texto tá certo (selecionado o 1)
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".ng-option-label")).getText(), is(not("1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)")));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-option-label"));
      assert(elements.size() > 0);
    }
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".ng-option-label")).getText(), is("2. Impositiva - Transferência Especial"));
    // Botão X
    driver.findElement(By.cssSelector(".ng-clear-wrapper")).click();
    MatcherAssert.assertThat(driver.findElement(By.cssSelector(".form-text")).getText(), is("O campo é obrigatório."));
    // Fechar
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
  }
}