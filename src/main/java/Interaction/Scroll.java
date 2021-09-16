package Interaction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Scroll implements Interaction {

 Target target;

    public Scroll(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.recall("driver");
        Dimension dimension = driver.manage().window().getSize();
        int xPosition = dimension.width / 2;
        int initialPositionY = dimension.height / 2;
        int finalPositionY = dimension.height / 4;
        TouchAction action = new TouchAction((AppiumDriver) driver);
        while (!target.resolveFor(actor).isVisible()) {
            action.longPress(PointOption.point(xPosition, initialPositionY));
            action.moveTo(PointOption.point(xPosition, finalPositionY));
            action.release().perform();
        }
    }

    public static Performable hacia (Target target){
        return Tasks.instrumented(Scroll.class,target);
    }
}
