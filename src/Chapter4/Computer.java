package Chapter4;

public class Computer {
	private int cpuNum;
	private int ramGB;
	private int cpuFreq;
	private String brand;
	private int releaseYear;
	
	public Computer(int cn, int rg, int cf, String b, int r) {
		cpuNum = cn;
		ramGB = rg; 
		cpuFreq = cf;
		brand = b;
		releaseYear = r;
	}
	
	public int getCpuPower() {
		return cpuNum * cpuFreq;
	}
	
	public void setFreq(int f) {
		cpuFreq = f;
	}
	
	public void setCpuNum(int n) {
		cpuNum = n;
	}
	
	public int getRam() {
		return ramGB;
	}
	
	public void setRam(int r) {
		ramGB = r;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String b) {
		brand = b;
	}
	
	public int getYear() {
		return releaseYear;
	}
	
	public void setYear(int y) {
		releaseYear = y;
	}
	
	public int getScore() {
		int s=0;
		s += getCpuPower();
		s += (ramGB*1000000000);
		return s;
	}
	
	public boolean isBetter(Computer c) {
		int myScore = getScore();
		int theirScore = c.getScore();
		return (myScore>theirScore);
	}
}
