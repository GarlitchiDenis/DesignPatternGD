import java.util.ArrayList;

public class Section implements Element{
    public String title;
    public ArrayList<Element> content=new ArrayList<>();

    Section(String t)
    {
        title=t;
    }

    public void add(Element elm)
    {
        content.add(elm);
    }

    public void remove(Element elm)
    {
        content.remove(elm);
    }

    public Element getElement(int index){
        return content.get(index);
    }

    public void print()
    {
        System.out.println(title);
        for(Element e:content)
        {

            e.print();
        }
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
        for (Element el:content) {

            el.accept(visitor);
        }
    }

    public String getTitle() {
        return title;
    }
}
