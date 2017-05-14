package word.in.news;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class WordInNews {
    public static String getPage(String url) throws IOException {        
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        HttpResponse response = httpclient.execute(httpget);
        String status = response.getStatusLine().toString();
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line, httpText = "";
        while ((line = rd.readLine()) != null) {
            httpText += line + "\n";
        }
        if (httpText == null) return "Error ! \n" + getPage(url);
        else return httpText;
    }
    public static ArrayList<news> getNews(String data){
        int cnt = 0;
        ArrayList<news> allNews;
        allNews = new ArrayList<>();
        
        Matcher m = Pattern.compile("<item>[^`]*?</item>").matcher(data);
        while(m.find()){
            String all = data.substring(m.start(), m.end()), title = null, link = null, description = null, author = null, imageURL = null, date = null;
            Matcher matcher = Pattern.compile("<title>(.*?)</title>").matcher(all); 
            if (matcher.find()) title = matcher.group(1);
            matcher = Pattern.compile("<link>(.*?)</link>").matcher(all);
            if (matcher.find()) link = matcher.group(1);
            matcher = Pattern.compile("<description>(.*?)</description>").matcher(all);
            if (matcher.find()) description = matcher.group(1);
            matcher = Pattern.compile("<author>(.*?)</author>").matcher(all);
            if (matcher.find()) author = matcher.group(1);
            matcher = Pattern.compile("<pubDate>(.*?)</pubDate>").matcher(all);
            if (matcher.find()) date = matcher.group(1);
            matcher = Pattern.compile("<media:content url=\"(.*?)\"").matcher(all);
            if (matcher.find()) imageURL = matcher.group(1);
            Image image = null;
            try {
                URL url = new URL(imageURL);
                image = ImageIO.read(url);
            } catch (IOException e) { }
            allNews.add(new news(title, link, description, author, date, image, cnt));
            cnt++;
        }
        
        return allNews;
    }
    
    public static void main(String[] args) throws IOException {
        
        new MainView().setVisible(true);
    }
    
}
