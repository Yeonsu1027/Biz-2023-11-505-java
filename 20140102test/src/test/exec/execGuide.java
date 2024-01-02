package test.exec;

import test.Service.GuideServiceImplV1;
import test.models.GuideService;

public class execGuide {
	public static void main(String[] args) {
		GuideService Gs = new GuideServiceImplV1();
	
		Gs.printGuideList();
	}

}
