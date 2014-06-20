package gral2demo;

import mainboard.Mainboard;

public class Main {

	public static void main(String[] args) {
		
		Mainboard gigabyte = new Mainboard(1, true);
		
		AgpGraphicCard nvidia = new AgpGraphicCard();
		nvidia.setDescription("Karta nvidia");
		
		HddDrive samsung = new HddDrive();
		samsung.setDescription("Dysk twardy Samsung");
		
		PciExpressGraphicCard pci = new PciExpressGraphicCard();
		pci.setDescription("Karta graficzna pci express");
		
		gigabyte.installPciExpressGraphicCard(pci);
		
		gigabyte.installAgpGraphicCard(nvidia);
		gigabyte.installIdeDevice(samsung, 0);
		
		Ram ram = new Ram();
		ram.setDescription("4GB RAM");
		gigabyte.installRam(ram);
		
		LanCard lanCard = new LanCard();
		lanCard.setDescription("Karta LAN");
		gigabyte.installLanCard(lanCard);
		
		SataHddDrive sata = new SataHddDrive();
		sata.setDescription("Super Dysk SATA");
		gigabyte.installSataHddDrive(sata);
		
		System.out.print(gigabyte.getFullDescription());
		gigabyte.installIdeDevice(samsung, 0);
		
	}

}
