package Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class MessageClicker implements Runnable {
	
	public void run() {
        System.out.println("Blib Blop");
        try {
        	Robot robot = new Robot();
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
