package store;

public class ManagerDriver {

	public static void main(String[] args) {
		
		NameManager namelist = new NameManager();
		namelist.addNames("M.Mickleson");
		namelist.addNames ("Johnua Taylor Biggs");
		namelist.addNames ("P.Smith");
		namelist.addNames ("Peter Jonathan Smythton");
		namelist.addNames ("P.Thompson");
		
		namelist.printNames(); // should print all names
		namelist.removeLongNames();
		namelist.printNames(); // should now have longer names removed

	}

}
