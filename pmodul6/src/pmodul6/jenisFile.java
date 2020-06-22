/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmodul6;
import javax.swing.filechooser.FileFilter;
import java.io.*;
/**
 * Nama: Leo Wahata.
 * Kelas: XII RPL.
 * NO Absen: 21.
 * @author L
 */
public class jenisFile extends FileFilter{
    private String[] s;
    /** Creates a new instance of jenisFile */
    public jenisFile(String[] sArg) {
    s = sArg;
}
// Tentukan file apa yang akan ditampilkan
public boolean accept(File fArg) {
if (fArg.isDirectory())
return true;
// Jika Extension dari file sesuai syarat, tampilkan
for (int i = 0; i < s.length; ++i)
if (fArg.getName().toLowerCase().indexOf(s[i].toLowerCase()) > 0)
return true;
// selain kedua hal di atas, anggap false
return false;
}
public String getDescription() {
String tmp = "";
for (int i = 0; i < s.length; ++i)
tmp += "*" + s[i] + " ";
return tmp;
}
}