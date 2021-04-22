package ro.acs.cts.seminar9.proxy;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{

	private YoutubeLibraryInterface libImplementation;

	
	public YoutubeLibraryProxy(YoutubeLibraryInterface libImplementation) {
		super();
		this.libImplementation = libImplementation;
	}

	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVideoInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
