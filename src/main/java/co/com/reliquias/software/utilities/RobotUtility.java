package co.com.reliquias.software.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.Robot;
import java.awt.AWTException;

public class RobotUtility {

    private static final Logger LOGGER = LoggerFactory.getLogger(RobotUtility.class);
    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            LOGGER.error("No se pudo inicializar el robot.", e);
        }
    }

    private RobotUtility() {
    }

    public static void pressAndRelease(int keyEventValue) {
        robot.keyPress(keyEventValue);
        robot.keyRelease(keyEventValue);
    }

    public static void pressManyKeys(int... keyEventValues) {
        for (int keyCode : keyEventValues) {
            robot.keyPress(keyCode);
        }
    }

    public static void releaseManyKeys(int... keyEventValues) {
        for (int keyCode : keyEventValues) {
            robot.keyRelease(keyCode);
        }
    }

    public static void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            LOGGER.error("Error al esperar.", e);
            Thread.currentThread().interrupt();
        }
    }

}
