class cars{
    void Start(){
        System.out.println("started");
    }void Stop(){
        System.out.println("stoped");
    }
}
class motorcycle extends cars{
    void mStart(){
        System.out.println("motor started");
    }void mstop(){
        System.out.println("motor stopped");
    }
}
public class vehileclassifier {

public static void main(String[] args){
    motorcycle vehicle=new motorcycle();
    vehicle.Start();
    vehicle.Stop();
    vehicle.mStart();
    vehicle.mstop();


}}