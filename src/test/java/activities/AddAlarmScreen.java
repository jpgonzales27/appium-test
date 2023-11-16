package activities;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddAlarmScreen {
    public TextBox hour = new TextBox(By.xpath("(//android.widget.EditText[@resource-id='com.sec.android.app.clockpackage:id/numberpicker_input'])[1]"));
    public TextBox minutes = new TextBox(By.xpath("(//android.widget.EditText[@resource-id='com.sec.android.app.clockpackage:id/numberpicker_input'])[2]"));
    public Button saveButton = new Button(By.xpath("//android.widget.TextView[@text=\"Save\"]"));
}
