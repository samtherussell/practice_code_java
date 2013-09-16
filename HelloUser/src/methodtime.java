
public class methodtime {
	private int hour;
	private int minute;
	private int second;
	public void settime(int h, int m, int s){
		hour = ((h >= 0 && h<24) ? h : 0);
		minute = ((m >= 0 && m<60) ? m : 0);
		second = ((s >= 0 && s<60) ? s : 0);
	}
	
	public String normaloutput(){
		return String.format("%02d:%02d:%02d" , hour, minute, second);
	}
	public String wordtime(){
		return String.format("It is %d minutes past %d o'clock in the %s", minute, ((hour==0 || hour == 12) ? 12 : hour % 12), (hour < 13 ) ? "morning" : "afternoon");
	}
}
