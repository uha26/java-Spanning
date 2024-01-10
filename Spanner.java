import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;


class Spanner
{
    public static void main(String args[])
    {
        try
        {
        int x=1;
        Robot robot=new Robot();
        Scanner scanner =new Scanner(System.in);
        System.out.println("ENTER THE TEXT:");
        String text=scanner.nextLine();
        StringSelection stringselection=new StringSelection(text);
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringselection,null);
        System.out.println("The spanning will start in 5 seconds:");
        Thread.sleep(5000);
        while(x<=10){
             Thread.sleep(5000);


        robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);

           robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
          x++;
          }
        }
        catch (AWTException | InterruptedException e) {
            e.printStackTrace();



    }
    }
}