package Scenario;

import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;
public class Senaryo2_frequentlyaskedQuestions extends BaseTest{
    Steps steps = new Steps();

    @Test
    public void askedQuestions(){
        steps.clickElement("body > header > div > div.navbar__right > ul > li.dropdown.help-menu > label");
        steps.clickElement("body > header > div > div.navbar__right > ul > li.dropdown.help-menu > ul > li:nth-child(2) > a");
        steps.clickElement("body > div.container > div.desktop > div > main > section > ul > li:nth-child(1) > a");
        steps.clickElement("body > div.container > div.desktop > div > main > section > ul > li:nth-child(1) > a");
    }
}
