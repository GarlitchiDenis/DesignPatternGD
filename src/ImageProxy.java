import java.awt.*;

public class ImageProxy implements Element{

    String url;
    Image realImage=null;

    public ImageProxy(String s){
        url=s;
    }

    Image loadImage(){

        if(realImage==null){
            realImage=new Image(url);
        }
        return realImage;
    }

    public void print() {
        Image img=loadImage();

        img.print();
        
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }


    public String getRealImage() {
        return url;
    }

}
