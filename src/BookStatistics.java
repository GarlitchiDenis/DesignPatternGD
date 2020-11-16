import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
public class BookStatistics implements Visitor {

    int sectionCounter=0;
    int imageCounter=0;
    int tableCounter=0;
    int paragraphCounter=0;
    JSONObject obj=new JSONObject();
    JSONArray i=new JSONArray();
    JSONArray p=new JSONArray();
    JSONArray s=new JSONArray();
    JSONArray ip=new JSONArray();
    JSONArray t=new JSONArray();

    public void visit(Image image){imageCounter++;
    i.add(image.getImageName());}

    public void visit(Section section){sectionCounter++;
    s.add(section.getTitle());}

    public void visit(ImageProxy imageProxy){imageCounter++;
    ip.add(imageProxy.getRealImage());}

    public void visit(Paragraph paragraph){paragraphCounter++;
    p.add(paragraph.getName());}

    public void visit(Table table){tableCounter++;
    t.add(table.getName());}

    public void CreateJSON() throws Exception{
        try(FileWriter file=new FileWriter("myJSON.json")){
            obj.put("Section",s);
            obj.put("Paragraph",p);
            obj.put("Table",t);
            obj.put("Image",i);
            obj.put("ImageProxy",ip);

            file.write(obj.toString());
            file.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void printStatistics(){
     System.out.println("Book Statistics: ");
     System.out.println("Number of images: "+ imageCounter);
     System.out.println("Number of tables: "+ tableCounter);
     System.out.println("Number of paragraphs: "+ paragraphCounter);
     System.out.println("Number of sections: "+ sectionCounter);
    }
}
