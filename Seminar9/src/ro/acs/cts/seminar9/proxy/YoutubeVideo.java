package ro.acs.cts.seminar9.proxy;

public class YoutubeVideo {
private int id;
private String title;
private float duration
;
public YoutubeVideo(int id, String title, float duration) {
	super();
	this.id = id;
	this.title = title;
	this.duration = duration;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public float getDuration() {
	return duration;
}
public void setDuration(float duration) {
	this.duration = duration;
}



}
