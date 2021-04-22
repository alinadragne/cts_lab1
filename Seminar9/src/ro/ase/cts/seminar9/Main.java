package ro.ase.cts.seminar9;

import ro.acs.cts.seminar9.proxy.YoutubeLibrary;
import ro.acs.cts.seminar9.proxy.YoutubeLibraryInterface;
import ro.acs.cts.seminar9.proxy.YoutubeLibraryProxy;
import ro.ase.cts.seminar9.flyweight.Model3DFactory;
import ro.ase.cts.seminar9.flyweight.ScreenData;

public class Main {

	public static void main(String[] args) {
		
		
				YoutubeLibraryInterface youtubeLib=new YoutubeLibrary();
				System.out.println(youtubeLib.listVideos());
				System.out.println(youtubeLib.getVideoInfo(1));
				System.out.println(youtubeLib.getVideoInfo(1));
				System.out.println("---------------------------------------");
				
				
				
				YoutubeLibraryInterface youtubeLibProxy=new YoutubeLibraryProxy();
				System.out.println(youtubeLibProxy.listVideos());
				System.out.println(youtubeLibProxy.getVideoInfo(1));
				System.out.println(youtubeLibProxy.getVideoInfo(1));
				
				ScreenData dataSet1 = new ScreenData("green",99,30,100);
				ScreenData dataSet2 = new ScreenData("green",20,30,40);
				
				ModelFlyweigthInterface solider1 = Model3DFactory.getModel(ModelType.SOLIDER);
				solider1.display(dataSet1);
				solider.display(dataSet2);
	}
}
