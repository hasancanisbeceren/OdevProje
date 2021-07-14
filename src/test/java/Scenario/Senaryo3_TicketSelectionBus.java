package Scenario;

import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo3_TicketSelectionBus extends BaseTest {
    Steps steps = new Steps();

    @Test
    public void buyTicketBus() {
        steps.clickElement("body > header > div > div.navbar__left > ul > li.bus");//Otobüs kısmına geç
        steps.sendKeysToElementTest("#bus-trip-from", "İstanbul");//Nereden gitmek istiyorsan ilgili bir kelime gir
        steps.clickElement("#ui-id-3");//Listeden otogar seç
        steps.sendKeysToElementTest("#bus-trip-to", "İzmir");//Nereye gitmek istiyorsan ilgili bir kelime gir
        steps.clickElement("ul[id='ui-id-2']>li:nth-of-type(1)");//Listeden otogar seç
        steps.clickElement("input[placeholder='Gidiş Tarihi']"); //Gidiş tarihi için takvimi aç
        steps.optionClick("div[class='ui-datepicker-group ui-datepicker-group-first'] a[class='ui-state-default']",2); //Gidiş Tarihi Seç
        steps.clickElement("#btnBusTripSearch"); //Arama butonuna bas
        steps.waitSecond(4);
        steps.clickElement("body > div.container > section > div.search-results__inner.turna-container.flex > div.search-results__inner__right > ul > li:nth-child(1) > div.list-item__right > button"); // yolculuk seç
        steps.clickElement("#modal-seat-plan > div.list-item__lightbox > div > div.lightbox-content > div.lightbox-content__middle > div.bus-scheme > div.bus-seats > div:nth-child(65) > div");//Koltuk seç
        steps.clickElement("#modal-seat-plan > div.list-item__lightbox > div > div.lightbox-content > div.lightbox-content__middle > div.bus-scheme > div.bus-seats > div.item.seat.empty.active > div.gender-selection > div.gender-item.male");//Cinsiyet seç
        steps.clickElement("#modal-seat-plan > div.list-item__lightbox > div > div.lightbox-content > div.lightbox-content__bottom.selected-seats-list > div.lightbox-content__bottom__right > div > button"); //Devam et butonuna bas

        //Kişisel Bilgiler
        steps.sendKeysToElementTest("body > div.container > div.div-reservation-in.margin-top-spacing > div.div-reservation-content.passenger-form > div.details.passenger-count > div > div.passenger-item-right > div:nth-child(2) > div > div:nth-child(1) > input", "Hasancan");
        steps.sendKeysToElementTest("body > div.container > div.div-reservation-in.margin-top-spacing > div.div-reservation-content.passenger-form > div.details.passenger-count > div > div.passenger-item-right > div:nth-child(2) > div > div:nth-child(2) > input", "İŞBECEREN");
        steps.sendKeysToElementTest("body > div.container > div.div-reservation-in.margin-top-spacing > div.div-reservation-content.passenger-form > div.details.passenger-count > div > div.passenger-item-right > div:nth-child(3) > div > div.form-item.passenger-identity-number > input", "11111111111");
        steps.sendKeysToElementTest("body > div.container > div.div-reservation-in.margin-top-spacing > div.div-reservation-content.passenger-form > div.details.passenger-count > div > div.passenger-item-right > div:nth-child(3) > div > div.form-item.passenger-hes-code > input", "1111111111");
        steps.sendKeysToElementTest("#txtPhone", "5555555555");
        steps.sendKeysToElementTest("#txtEmail", "xmyle@outlook.com");
        steps.clickElement("body > div.container > div.div-reservation-in.margin-top-spacing > div.insurance-new > div.div-reservation-content > div.details.extras > div.extra-options-header.circular-medium > div.action-wrapper > div.option > label.insurance-option.insurance-do-not-select.lb-do-not-want-insurance");
        steps.clickElement("body > div.container > div.div-reservation-in.margin-top-spacing > section > div > button");

    }
    }
