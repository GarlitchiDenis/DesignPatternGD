public class Paragraph implements Element {
    public String name;
    private AlignStrategy alignStrategy;

    Paragraph(String n)
    {
        name=n;
    }
   /* public void print()
    {
        System.out.println("Paragraph: "+name);
    }*/

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }
    public String getPar(){
        return name;
    }

    public void setAlignStrategy(AlignStrategy s){

        this.alignStrategy=s;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
