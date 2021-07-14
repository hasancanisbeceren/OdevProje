package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;


public class Senaryo4_membershipBenefits extends BaseTest {
    Steps steps = new Steps();


    @Test
    public void membershipBenefits(){
        //Sık Sorulan Sorulardan herhangi birini seçip consolesa yazdırma
        steps.clickElement("body > header > div > div.navbar__right > ul > li.dropdown.help-menu > label");
        steps.clickElement("body > header > div > div.navbar__right > ul > li.dropdown.help-menu > ul > li:nth-child(3) > a");
        steps.clickElement("body > div.container > div.trn-content > div.main-helper.faq-member > div > button:nth-child(3)");
        steps.saveText("#Item-1 > div");
    }

}
