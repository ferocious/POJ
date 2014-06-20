package mainboard;

import gral2demo.AgpGraphicCard;
import gral2demo.HddDrive;
import gral2demo.LanCard;
import gral2demo.PciExpressGraphicCard;
import gral2demo.Ram;
import gral2demo.SataHddDrive;

public class Mainboard {

	private IdePort[] idePorts;
	private AgpSlot agpSlot;
	private PciExpressSlot pciExpSlot;
	private RamPort ramPort;
	private PciSlot pciSlot;
	private SataPort sataPort;

	public Mainboard(int idePorts )
	{
		ramPort = new RamPort(this);
		pciSlot = new PciSlot(this);
		sataPort = new SataPort(this);
		
		this.idePorts=new IdePort[idePorts];
		for(int i=0;i<idePorts;i++)
			this.idePorts[i]=new IdePort(this);
		this.agpSlot=new AgpSlot(this);
	}
	
	public Mainboard(int idePorts, boolean pciExpress) {
		ramPort = new RamPort(this);
		pciSlot = new PciSlot(this);
		sataPort = new SataPort(this);
		
		this.idePorts = new IdePort[idePorts];
		
		for (int i = 0; i < idePorts; i++) {
			this.idePorts[i] = new IdePort(this);
		}
		
		if (pciExpress) {
			this.pciExpSlot = new PciExpressSlot(this);
		} else {
			this.agpSlot=new AgpSlot(this);
		}
	}
	
	public void installIdeDevice(HddDrive drive, int portNumber)
	{
		if(portNumber<0 || portNumber>= idePorts.length)
		{
			System.out.println("\nNie ma takiego numeru portu.");
			return;
		}
		if(idePorts[portNumber].isAvaible())
			idePorts[portNumber].installDevice(drive);
		else
			System.out.println("\nSlot "+portNumber+" is not avaible.");
	}
	
	public void installAgpGraphicCard(AgpGraphicCard agpGraphicCard)
	{
		if (agpSlot == null) {
			System.out.println("\nBrak gniazda AGP");
		} else if(agpSlot.isAvaible())
			agpSlot.installDevice(agpGraphicCard);
		else
			System.out.println("\nGraphic card is already installed.");
	}
	
	/**
	 * Odinstaluj karte AGP
	 */
	public void uninstallAgpGraphicCard() {
		if (agpSlot != null && !agpSlot.isAvaible()) {
			agpSlot.unInstallDevice();
		} else {
			System.out.println("\nNie mozna odinstalowac karty AGP.");
		}
	}
	
	/**
	 * Instaluje karte graficzna do gniazda PCI Express.
	 */
	public void installPciExpressGraphicCard(PciExpressGraphicCard pciExpressCard) {
		if (pciExpSlot == null) {
			System.out.println("\nBrak gniazda PCI Express.");
		} else if (!pciExpSlot.isAvaible()) {
			System.out.println("\nKarta graficzna jest juz zainstalowana.");
		} else {
			pciExpSlot.installDevice(pciExpressCard);
		}
	}
	
	/**
	 * Odinstaluj karte PCI Express
	 */
	public void uninstallPciExpressGraphicCard() {
		if (pciExpSlot != null && !pciExpSlot.isAvaible()) {
			pciExpSlot.unInstallDevice();
		} else {
			System.out.println("\nNie mozna odinstalowac karty PCI Express.");
		}
	}
	
	/**
	 * Instaluje pamiec RAM.
	 */
	public void installRam(Ram ram) {
		if (ramPort.isAvaible()) {
			ramPort.installDevice(ram);
		} else {
			System.out.println("\nPamiec RAM jest juz zainstalowana.");
		}
	}
	
	/**
	 * Odinstaluje pamiec RAM.
	 */
	public void uninstallRam() {
		if (!ramPort.isAvaible()) {
			ramPort.unInstallDevice();
		} else {
			System.out.println("\nNie mozna odinstalowac pamieci RAM.");
		}
	}
	
	/**
	 * Instaluje karte LAN.
	 */
	public void installLanCard(LanCard card) {
		if (pciSlot.isAvaible()) {
			pciSlot.installDevice(card);
		} else {
			System.out.println("\nKarta LAN jest juz zainstalowana.");
		}
	}
	
	/**
	 * Odinstaluje karte LAN.
	 */
	public void uninstallLanCard() {
		if (!pciSlot.isAvaible()) {
			pciSlot.unInstallDevice();
		} else {
			System.out.println("\nNie mozna odinstalowac karty LAN.");
		}
	}
	
	/**
	 * Instaluje dysk SATA.
	 */
	public void installSataHddDrive(SataHddDrive hdd) {
		if (sataPort.isAvaible()) {
			sataPort.installDevice(hdd);
		} else {
			System.out.println("\nDyst SATA jest juz zainstalowany.");
		}
	}
	
	/**
	 * Odinstaluje dysk SATA.
	 */
	public void uninstallSataHddDrive() {
		if (!sataPort.isAvaible()) {
			sataPort.unInstallDevice();
		} else {
			System.out.println("\nNie mozna odinstalowac dysku SATA.");
		}
	}
	
	public String getFullDescription()
	{
		String result;
		result="----------------------------\n";
		result=result + "Ide Devices: \n";
		for(int i=0;i<idePorts.length;i++)
		{
			result=result+"Port "+i+"\n"+idePorts[i].getDescription();
		}
		result=result+"\n----------------------------\n";
		result=result + "Graphic Card: \n";
		
		if (agpSlot != null) {
			result+=agpSlot.getDescription();
		}
		
		if (pciExpSlot != null) {
			result+=pciExpSlot.getDescription();
		}
		
		result=result+"\n----------------------------\n";
		result=result + "Pamiec RAM: \n";
		result += ramPort.getDescription();
		
		result=result+"\n----------------------------\n";
		result=result + "PCI Slot: \n";
		result += pciSlot.getDescription();
		
		result=result+"\n----------------------------\n";
		result=result + "SATA Port: \n";
		result += sataPort.getDescription();
		
		result=result+"\n----------------------------\n";
		return result;
	}
}
