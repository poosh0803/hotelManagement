package beans;
import enums.RoomBookedStatus;
public class Room {

	private String photo;
    private double area;
    private double bedWidth;
    private RoomBookedStatus bookStatus;
    public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getBedWidth() {
		return bedWidth;
	}
	public void setBedWidth(double bedWidth) {
		this.bedWidth = bedWidth;
	}
	public RoomBookedStatus getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(RoomBookedStatus bookStatus) {
		this.bookStatus = bookStatus;
	}
}
