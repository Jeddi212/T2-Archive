/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesstrukdat;

/**
 *
 * @author msj
 */
public class Teacher {
    String idTeacher;
    String nameTeacher;
    String password;
    Jadwal headJadwal;
    Jadwal tailJadwal;
    Matpel headMatpel;
    Matpel tailMatpel;
    Teacher next;
}
