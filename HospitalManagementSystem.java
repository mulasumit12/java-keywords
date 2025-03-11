class Patient{
    private static String hospitalName="P.G Hospital";
    private static int totalpatients=0;
    private  String name;
    private  int age;
    private String ailment;
    private final int patientID;

    public Patient(int patientID,String name,int age,String ailment){
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
    }
    public void display(){
        if(this instanceof Patient){
            System.out.println("Hospital Name :"+hospitalName);
            System.out.println("Patient ID :"+patientID);
            System.out.println("Name is :"+name);
            System.out.println("Age is :"+age);
            System.out.println("Aliment"+ailment);
        }
    }
    public static void getTotalPatients(){
        System.out.println("Total patients"+totalpatients);
    }
}



public class HospitalManagementSystem {
    public static void main(String[] args) {
      Patient obj1=new Patient(123,"Sumit",22,"cold");
      Patient obj2=new Patient(122,"Sujoy",21,"Fever");
      obj1.display();
        System.out.println();
        obj2.display();
        Patient.getTotalPatients();
    }
}
