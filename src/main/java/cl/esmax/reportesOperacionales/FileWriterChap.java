/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;

import java.io.IOException;

/**
 *
 * @author Rodrigo
 */
public class FileWriterChap 
{

    public FileWriterChap(String ctmpfilename_javatxt) {
         System.out.println(ctmpfilename_javatxt);
    }
    public void FileWriterChap(String a)
    {
        System.out.println(a);
    }

    public void write(String string) throws IOException {
        System.out.println(string);
        throw new IOException(); 
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
