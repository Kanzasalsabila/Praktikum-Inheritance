
package PraktikumInheritance;

class Parent {
    public int x=5;
}
class Child extends Parents{
    public void info(int x){
        System.out.println("Nilai x sebagai parameter = "+ x);
        System.out.println("Data member x di class Child= "+ this.x);
        System.out.println("Data member x di class Parent= "+ super.x);        
    }
}
public class NilaiX{
    public static void main(String args[]){
        Child tes = new Child();
        tes.info(20);
    }
}

class Pegawai{
    public String nama;
    public double gaji;
    }
    class Manajer extends Pegawai {
     public String departemen;

     public void IsiData(String n, String d) {
    nama=n; departemen=d;
 } 
}


