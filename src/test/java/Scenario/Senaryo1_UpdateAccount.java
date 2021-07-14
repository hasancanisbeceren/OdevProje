package Scenario;

import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo1_UpdateAccount extends BaseTest {
    Steps steps = new Steps();

    @Test
    public void updateAccount(){
        steps.clickElement("#login-link > a");//'Giriş Yap' butonuna tıkla
        steps.sendKeysToElementTest("#txtSignInEmail","dainstell@outlook.com");//Giriş bilgilerini doldur
        steps.sendKeysToElementTest("#txtSignInPassword","12341234");//Giriş bilgilerini doldur
        steps.clickElement("#btnSignIn");//Giriş Butonuna tıkla
        steps.waitSecond(1);//Bekle
        steps.clickElement("#user-link > label");
        steps.clickElement("#user-link > ul > ul.first-ul > li:nth-child(1) > a");//Hesap Bilgilerime tıkla

        //Ad-Soyad-Dogum Tarihi Güncelle
        steps.sendKeysToElementTest("#txtName","ahmet");
        steps.sendKeysToElementTest("#txtSurName","su");
        steps.clickElement("#txtBirthDate");
        steps.selectElement("#day-of-birth","10");
        steps.selectElement("#month-of-birth","8");
        steps.selectElement("#year-of-birth","1992");

        //Parola Güncelleme
        steps.sendKeysToElementTest("#user-current-password","1234512345");//Mevcut parola
        steps.sendKeysToElementTest("#user-new-password","123456123456");// Yeni Parola
        steps.sendKeysToElementTest("#user-confirm-new-password","123456123456");//Yeni parola Tekrar
        steps.clickElement("#user-change-password-btn");//'Şifreyi Degistir' butonuna tıkla
        steps.clickElement("#btn-update-details");
        //Çıkış
        steps.clickElement("#user-link > label");
        steps.clickElement("#user-log-out > a");
    }
}
