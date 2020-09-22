/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Sou Akiyama
 */
public class Archivo {
    private File archivo;
    private ArrayList<Alumno> datos;

    public Archivo(File archivo, ArrayList<Alumno> datos) {
        this.archivo = archivo;
        this.datos = datos;
    }
    
    public void almacenar() throws FileNotFoundException, IOException {
        FileOutputStream fs = new FileOutputStream(archivo.getAbsolutePath(), false);
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(datos);
        os.close();
    }
    
    public void exportar() throws IOException {
        FileWriter fw = new FileWriter(archivo.getAbsolutePath(), false);
        PrintWriter pw = new PrintWriter(fw);
        
        for (Alumno dato : datos) {
            pw.print("Alumno: ");
            pw.print(dato.getNombre());
            pw.print(" ; ");
            pw.print(String.valueOf(dato.getParciales()[0]));
            pw.print(" ; ");
            pw.print(String.valueOf(dato.getParciales()[1]));
            pw.print(" ; ");
            pw.print(String.valueOf(dato.getParciales()[2]));
            pw.print(" ; ");
            pw.print(String.valueOf(dato.getCalificacion()));
            pw.println(" ; ");
        }
        pw.close();
    }
    
    public ArrayList<Alumno> cargar() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(archivo.getAbsoluteFile());
        ObjectInputStream oi = new ObjectInputStream(fi);
        
        ArrayList<Alumno> info = (ArrayList<Alumno>) oi.readObject();
        return info;
    }
}
