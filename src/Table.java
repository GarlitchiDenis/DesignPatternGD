public class Table implements Element {
    public String name;
    Table(String n)
    {
        name=n;
    }
    public void print()
    {
        System.out.println(name);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
