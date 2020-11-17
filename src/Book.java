import java.util.ArrayList;

class Book {
    public String title;
    public Author author;
    public ArrayList<Element> content=new ArrayList<>();
    public Book(){
        ;
    }
    Book(String t)
    {
        title=t;
        //author=new Author(" ");
    }
    public void addAuthor(Author a)
    {
        author=a;
    }

    public void addContent(Element elm)
    {
        content.add(elm);
    }
    public void print() {
        System.out.println("Book:"+title);
      /*  if(this.author.name!=null)
            System.out.println("Author:"+author.name);*/
        for(Element e: content
        ) {e.print();}
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
        for (Element el:content) {

            el.accept(visitor);
        }
    }

}