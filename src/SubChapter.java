import java.util.ArrayList;

public class SubChapter{
    public String name;
    ArrayList<Paragraph> pharagraphs=new ArrayList<>();
    ArrayList<Image> images=new ArrayList<>();
    ArrayList<Table> tables=new ArrayList<>();
    SubChapter(String n) {
        name=n;
    }

    public void createNewParagraph(String s) {
        Paragraph paragraph = new Paragraph(s);
        pharagraphs.add(paragraph);
    }

    public void createNewImage(String s) {
        Image image=new Image(s);
        images.add(image);
    }

    public void createNewTable(String s) {
        Table table=new Table(s);
        tables.add(table);
    }

    public void print() {
        System.out.println(name);
        for (Paragraph p: pharagraphs
             ) {System.out.println(p.name);}
        for (Image i: images
        ) {System.out.println(i.imageName);}
        for (Table t: tables
        ) {System.out.println(t.name);}
    }
}
