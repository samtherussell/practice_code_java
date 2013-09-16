package MIT;

public class Range {
	
	/**
	 * 
	 * @code public Range(double high, double low){
	 * 		}
	 * 
	 *  Represents a range of values.
	 * 
	 * @Parameters: 
	 * 			- high is the upper limit
	 * 			- low is the lower limit 
	 * 
	 * An exception is thrown if the lower limit is higher than the lower limit
	 * 
	 */

	private double UpperLimit;
	private double LowerLimit;
	
	
	public Range(double high, double low) throws Exception{
		
		if(high - low < 0)
			throw new Exception("limits are the wrond way round");
		
		UpperLimit = high;
		LowerLimit = low;
		
	}
	
	public double getUpper(){
		return UpperLimit;
		
	}
	
	public double getLower(){
		return LowerLimit;
		
	}
	/**
	 * 
	 * @return the distance between the upper and lower limits
	 */
	public double Range(){
		return Math.abs(UpperLimit - LowerLimit);
	}
	
	public double getMiddle(){
		return (UpperLimit + LowerLimit)/2;
	}
	
	public void setUpper(double up){
		UpperLimit = up;
		}

	public void setLower(double low){
		LowerLimit = low;
		}
	
	
}
