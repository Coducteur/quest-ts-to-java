import java.util.ArrayList;
import java.util.Date;

public class Users {
  private Date birthdate;
  private int size;
  private ArrayList<Photo> photos;
  private Adress address;

  public Users (Date birthdate, int size, ArrayList<Photo> photos, Adress address){
    this.birthdate = birthdate;
    this.size = size;
    this.photos = photos;
    this.address = address;
  }
}
