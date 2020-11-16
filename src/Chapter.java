import java.util.ArrayList;

public class Chapter {
    public String name;
    public ArrayList<SubChapter> subChapters= new ArrayList<>();
    Chapter(String n)
    {
        name=n;
    }

    public int createSubChapter(String x)
    {
        SubChapter s = new SubChapter(x);
        subChapters.add(s);
        return subChapters.indexOf(s);
    }

    public SubChapter getSubChapter(int indexSubChapter) {
        return subChapters.get(indexSubChapter);
    }
}
