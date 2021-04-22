package ro.acs.cts.seminar9.proxy;

import java.util.HashMap;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{

	private YoutubeLibraryInterface libImplementation;
	private String videoListCached;
	private HashMap<Integer, String> videoDescriptionCached;
	private boolean hasExpired;
	
	public YoutubeLibraryProxy() {
		libImplementation = new YoutubeLibrary();
		hasExpired=false;
		videoDescriptionCached = new HashMap<>();
	}
	
	@Override
	public String listVideos() {
		if(videoDescriptionCached == null || hasExpired)
		{
			videoListCached=libImplementation.listVideos();
		}
		return videoListCached;
	}

	@Override
	public String getVideoInfo(int id) {
		if(videoDescriptionCached.get(id)==null || hasExpired)
		{
			videoDescriptionCached.put(id, libImplementation.getVideoInfo(id));
		}
		return videoDescriptionCached.get(id);
	}

}