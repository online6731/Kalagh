package word.in.news;

import ij.ImagePlus;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


class PictureBox extends Thread{
    JPanel panel;
    ArrayList<news> news = new ArrayList<>();
    boolean isRunning;
    int frontNewsNumber = 0;
    JLabel frontNewsLabel;
    
    PictureBox(JPanel panel) {
        this.panel = panel;
        isRunning = false;
        ImagePlus ip = new ImagePlus();
        ip.setProcessor(new ImagePlus("a", new ImageIcon("C:\\Users\\Me\\Desktop\\u1.png").getImage()).getProcessor().resize(panel.getWidth(), panel.getHeight()));
        JLabel defaultNews = new JLabel(new ImageIcon(ip.getImage()));
        frontNewsLabel = defaultNews;
        panel.add(defaultNews);
        defaultNews.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        defaultNews.setVisible(true);
        
    }
    
    public void setNews(ArrayList<news> news){
        this.news = news;
        isRunning = true;
    }
    
    @Override
    public void run(){
        while (isRunning){
            try { 
                sleep(500); 
            } catch (InterruptedException ex) { Logger.getLogger(PictureBox.class.getName()).log(Level.SEVERE, null, ex); }
            ImagePlus ip = new ImagePlus();
            ip.setProcessor(new ImagePlus("a", new ImageIcon(news.get(frontNewsNumber).image).getImage()).getProcessor().resize(panel.getWidth(), panel.getHeight()));
            JLabel nextNews = new JLabel(new ImageIcon(ip.getImage()));
            frontNewsNumber++;
            frontNewsNumber %= news.size();
            panel.add(nextNews);
            nextNews.setBounds(0, 0, panel.getWidth(), panel.getHeight());
            nextNews.setVisible(true);
            panel.remove(frontNewsLabel);
            frontNewsLabel.removeAll();
            frontNewsLabel = nextNews;
        }
    }
}