import java.util.ArrayList;

public interface Element {


    void accept(Visitor visitor);
    void print();


}

