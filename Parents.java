
package PraktikumInheritance;


public class Parents {
    String parentsName;
    public Parents() {}

    public String getParentName() {
        return parentsName;
    }public Parents(String parentsName){
        this.parentsName = parentsName;
        System.out.println("Konstruktor parent");
    }

}
