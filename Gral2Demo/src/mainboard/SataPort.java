package mainboard;

import gral2demo.SataHddDrive;

class SataPort {

	private String description;
	private Mainboard mainboard;
	private boolean avaible = true;
	private SataHddDrive hdd;

	public SataPort(Mainboard mainboard) {
		this.mainboard = mainboard;
	}

	public void installDevice(SataHddDrive hdd) {
		hdd.setMainboard(mainboard);
		description = hdd.getDescription();
		this.hdd = hdd;
		this.avaible = false;
	}

	public void unInstallDevice() {
		hdd.setMainboard(null);
		description = null;
		this.avaible = true;
	}

	public String getDescription() {
		return description;
	}

	public boolean isAvaible() {
		return avaible;
	}

}
