
public class DataClass {
   private int sid;
   private String sName;
   private String sCity;
   private int sPhone;
   DataClass(int sid,String sName,String sCity,int sPhone){
       this.sid=sid;
       this.sCity=sCity;
       this.sName=sName;
       this.sPhone=sPhone;
       
   }
   public int getterSid(){
       return sid;
   } 
   public String getterSname(){
       return sName;
       
   }
   public String gettersCity(){
       return sCity;
       
   }
   public int gettersPhone(){
       return sPhone;
       
   }
       public  String toString() {
        return "DataClass{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sCity='" + sCity + '\'' +
                ", sPhone=" + sPhone +
                '}';
    }
       
}
