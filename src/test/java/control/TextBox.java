package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends Control{

    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String text){
        findControl();
        control.sendKeys(text);
    }

    public void cleanText(String text){
        findControl();
        control.clear();
        control.sendKeys(text);
    }

    public void setTextEnter(String value){
        findControl();
        control.sendKeys(value+ Keys.ENTER);
    }
}
