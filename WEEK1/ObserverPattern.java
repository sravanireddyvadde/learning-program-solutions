 package WEEK1;

import java.util.ArrayList;
import java.util.List;

interface Channel {
    void update(String news);
}

class NewsChannel implements Channel {
    public void update(String news) {
        System.out.println("News received: " + news);
    }
}

class NewsAgency {
    private List<Channel> channels = new ArrayList<>();
    private String news;

    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel c : channels) {
            c.update(news);
        }
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Channel ch1 = new NewsChannel();
        Channel ch2 = new NewsChannel();

        agency.addObserver(ch1);
        agency.addObserver(ch2);
        agency.setNews("Digital Nurture 4.0 Launched!");
    }
}
