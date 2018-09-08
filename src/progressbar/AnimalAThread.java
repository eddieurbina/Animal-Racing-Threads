
package progressbar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AnimalAThread extends Thread {
    private String name; 
    private int limit;
    private JLabel label;
    private int retard;

    public AnimalAThread(String name, int limit, JLabel label, int retard) {
        this.name = name;
        this.limit = limit;
        this.label = label;
        this.retard = retard;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < limit; i++) {
            try {
                System.out.println(name + " avanza");
                label.setLocation(i, 0);
                Thread.sleep(retard);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimalAThread.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        System.out.println(name + " has made it to the final line");
        JOptionPane.showMessageDialog(null, name + " has made it to the finals");
        yield();
    }
}
