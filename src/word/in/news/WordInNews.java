package word.in.news;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        int cnt = 0, start = 0, end = 0;
        ArrayList<news> allNews;
        allNews = new ArrayList<>();
        while(data.indexOf("<item>", start) != -1){
            start = data.indexOf("<item>", start) + 6;
            end = data.indexOf("</item>", end + 1);
            String all = data.substring(start, end), title = null, link = null, description = null, author = null, date = null;
            if (all.contains("<title>")) title = all.substring(all.indexOf("<title>") + 7, all.indexOf("</title>"));
            if (all.contains("<link>")) link = all.substring(all.indexOf("<link>") + 6, all.indexOf("</link>"));
            if (all.contains("<description>")) description = all.substring(all.indexOf("<description>") + 13, all.indexOf("</description>"));
            if (all.contains("<author>")) author = all.substring(all.indexOf("<author>") + 8, all.indexOf("</author>"));
            if (all.contains("<pubDate>")) date = all.substring(all.indexOf("<pubDate>") + 9, all.indexOf("</pubDate>"));
            allNews.add(new news(title, link, description, author, date, cnt));
            cnt++;
        }
        return allNews;
    }
    
    public static void main(String[] args) throws IOException {
        
        new View().setVisible(true);
    }
    
}
