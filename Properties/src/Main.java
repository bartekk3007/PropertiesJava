import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        var settings = new Properties();
        settings.setProperty("height", "800");
        settings.setProperty("width", "1200");
        settings.setProperty("author-name", "bartosz-kołakowski");

        var out = new FileWriter("settings.txt");
        settings.store(out, "Komentarz");

        var settingRead = new Properties();
        var in = new FileReader("settings.txt");
        settingRead.load(in);
        settingRead.setProperty("width", "900");
        for (var o : settingRead.entrySet())
        {
            System.out.println(o.getKey() + " " + o.getValue());
        }
    }
}