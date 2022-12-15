import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Document document = null;
        try {
            document = Jsoup.connect("https://shop.minecraft.net/collections/all").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(document.title());
        Elements elements = document.getElementsByClass("grid-product__meta");
        for (Element element : elements) {
            System.out.println(element.child(0).text());
            System.out.println(element.child(1).text());
        }

    }
}
