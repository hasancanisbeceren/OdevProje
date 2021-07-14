package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo6_campaign extends BaseTest{
    Steps steps = new Steps();

    @Test
    public void campaign(){
        steps.clickElement("body > div.container > div.section.campaigns-widget-wrapper > div.section__cta.text-align-center > a");//Tüm kampanyalara tıkla
        steps.clickElement("#panel1 > div > div > div:nth-child(1) > div.card-content > div > a");
        steps.saveText("body > div.container > div.campaign-details > div > ul");
    }

}
