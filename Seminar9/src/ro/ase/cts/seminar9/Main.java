package ro.ase.cts.seminar9;

import ro.acs.cts.seminar9.proxy.YoutubeLibrary;
import ro.acs.cts.seminar9.proxy.YoutubeLibraryInterface;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLibrary = new YoutubeLibrary();
		System.out.println(youtubeLibrary.listVideos());
		//System.out.println(youtubeLibrary.getVideoInfo(1));
	
	}
}
