package ro.acs.cts.seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface {

	private VideoDatabase database;
	
	public YoutubeLibrary() {
		this.database = new VideoDatabase();
	}
	
	@Override
	public String listVideos() {
		System.out.println("Fetching videos from database");
		
		ArrayList<YoutubeVideo> videoList = database.getVideoCollection();
		StringBuilder videoListBuilder = new StringBuilder();
		for(YoutubeVideo video : videoList) {
			videoListBuilder.append(video.getId())
							.append(" - ")
							.append(video.getTitle())
							.append("\n");
		}
		
		return videoListBuilder.toString();
	}

	@Override
	public String getVideoInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
