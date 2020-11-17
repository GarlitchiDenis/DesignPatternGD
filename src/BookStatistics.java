public class BookStatistics implements Visitor {

    int paragraphs=0,sections=0,imageproxy=0,images=0,tables=0,book=0;

    @Override
    public void visit(Book b) {
        book++;
    }

    @Override
    public void visit(Section s) {
        sections++;
    }

    @Override
    public void visit(Paragraph p) {
        paragraphs++;
    }

    @Override
    public void visit(ImageProxy ip) {
        imageproxy++;
    }

    @Override
    public void visit(Image i) {
        images++;
    }

    @Override
    public void visit(Table t) {
        tables++;
    }

    public void printStatistics(){
        System.out.println("Books: "+book+"\nSections: "+sections+"\nparagraphs: "+paragraphs+"\nimages: "+images+"\nimageproxy: "+imageproxy+"\ntables: "+tables);
    }
}