package testSuite;

import activities.AddAlarmScreen;
import activities.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {
    MainScreen mainScreen = new MainScreen();
    AddAlarmScreen addAlarmScreen = new AddAlarmScreen();

    @Test
    public void createNewAlarmTest() {
        String hour = "06";
        String minutes = "14";
        String time = hour+":"+minutes;
        mainScreen.addAlarmButton.click();
        addAlarmScreen.hour.setText(hour);
        addAlarmScreen.minutes.setText(minutes);
        addAlarmScreen.saveButton.click();
        Assertions.assertEquals(time,mainScreen.getAlarmText(time).getText(), "ERROR la alarma no fue creada");
    }
}
