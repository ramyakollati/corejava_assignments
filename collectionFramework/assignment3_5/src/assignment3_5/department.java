package assignment3_5;
public class department {
	private Integer deptId;
	private String deptName;
	private String deptLocation;

	public department(Integer deptId,String deptName,String deptLocation)
	{
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	
	public String toString()
    {
    	return "Department [deptId=" + deptId + ", deptName="+deptName+ "]";
    }
}
