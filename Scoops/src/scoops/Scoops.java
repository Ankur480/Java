package scoops;

class Subject 
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID, String name,int maxMarks)
    {
        this.subID = subID;
        this.name = name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int m)
    {
        maxMarks=m;
    }
    public void setMarksObtain(int n)
    {
        marksObtain=n;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return "\nSubject ID: "+subID+"\nName : "+name+"\nMarks Obtained: "+marksObtain;
    }
}



public class Scoops {

    public static void main(String[] args) {
        Subject subs[] = new Subject[3];   
    }
    
}
