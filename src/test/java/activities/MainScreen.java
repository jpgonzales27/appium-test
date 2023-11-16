package activities;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addAlarmButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"Add alarm\"]"));

    public Label getAlarmText(String time){
        System.out.println("TIME: "+time);
        Label nameTask = new Label((By.xpath("//android.widget.TextView[@text='"+time+"']")));
        return nameTask;
    }
}
