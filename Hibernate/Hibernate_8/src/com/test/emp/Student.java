package com.test.emp;

public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
    private int studentId;
    private String studentName;
    private String studentAddress;
    private int courceId;
    
    public int getStudentId() {
        return studentId;
    }
 
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
 
    public String getStudentName() {
        return studentName;
    }
 
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
 
    public String getStudentAddress() {
        return studentAddress;
    }
 
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
 
    public int getCourceId() {
        return courceId;
    }
 
    public void setCourceId(int courceId) {
        this.courceId = courceId;
    }

	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAddress=" + studentAddress
				+ ", courceId=" + courceId + "]";
	}
	
}