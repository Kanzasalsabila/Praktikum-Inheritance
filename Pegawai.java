/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanza Salsabila
 */
class Pegawai {
     public String nama;
    public double gaji;
}

class Manajer extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d) {
        nama=n;
        departemen=d;
    }
}
