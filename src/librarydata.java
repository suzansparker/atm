import java.sql.SQLOutput;

class libraryItem {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String Title;
   private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

 class book extends libraryItem {
    String Author;


}
class magazine extends libraryItem{
    int issues;
}
public class librarydata extends magazine{
public static void main(String[] args)
{
    magazine gill=new magazine();
    book boy=new book();
    gill.Title="ps2";
    gill.setId(123);
  boy.Author="kalki";
    gill.setYear(2023);
    gill.issues=6;
    System.out.println("\n"+gill.getId()+"\n"+gill.Title+"\n"+gill.getYear()+"\n"+boy.Author+"\n"+gill.issues);

}}