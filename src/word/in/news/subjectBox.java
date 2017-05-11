package word.in.news;

import ij.ImagePlus;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;


class subjectBox extends Thread{
    JPanel parentPanel;
    JPanel panel;
    ArrayList<news> news = new ArrayList<>();
    boolean isRunning;
    int frontNewsNumber = 0;
    int textHeight = 30, panelWidth = 100, panelHeight = 100;
    JLabel frontNewsLabel;
    JLabel title;
    subjectBox(JPanel parentPanel, String subject) throws IOException {
        this.parentPanel = parentPanel;
        this.title = new JLabel(subject);
        this.panel = new JPanel();
        panel.setBounds(0, 0, panelWidth, panelHeight);
        panel.setSize(panelWidth, panelHeight);
        
        parentPanel.add(panel);
        panel.setVisible(true);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
        isRunning = false;
        ImagePlus ip = new ImagePlus();
        ip.setProcessor(new ImagePlus("a", new ImageIcon("C:\\Users\\Me\\Desktop\\u1.png").getImage()).getProcessor().resize(panelWidth, panelHeight - textHeight));
        JLabel defaultNews = new JLabel(new ImageIcon(ip.getImage()));
        frontNewsLabel = defaultNews;
        defaultNews.setBounds(0, 0, panelWidth, panelHeight - textHeight);
        title.setBounds(0, panelHeight - textHeight, panelWidth, textHeight);
        panel.add(defaultNews);
        panel.add(title);
        
        title.setHorizontalAlignment(SwingConstants.CENTER);
        frontNewsLabel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        defaultNews.setVisible(true);
    }
    
    public void setNews(ArrayList<news> news){
        this.news = news;
        isRunning = true;
    }
    
    @Override
    public void run(){
        while (isRunning){
            if (news.get(frontNewsNumber).image == null) continue;
            ImagePlus ip = new ImagePlus();
            ip.setProcessor(new ImagePlus("a", new ImageIcon(news.get(frontNewsNumber).image).getImage()).getProcessor().resize(panelWidth, panelHeight - textHeight));
            frontNewsLabel.setIcon(new ImageIcon(ip.getImage()));
            frontNewsNumber++;
            frontNewsNumber %= news.size();
            try { Thread.sleep(5000); } catch (InterruptedException ex) { Logger.getLogger(PictureBox.class.getName()).log(Level.SEVERE, null, ex); }
            
        }
    }
}