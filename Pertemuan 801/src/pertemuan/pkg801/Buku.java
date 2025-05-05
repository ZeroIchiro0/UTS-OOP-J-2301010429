/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg801;

/**
 *
 * @author USER
 */
public class Buku {
    private String Judul, Author, Genre;
    
    public Buku (String Judul, String Author, String Genre){
        this.Judul = Judul;
        this.Author = Author;
        this.Genre = Genre;
    }
    
    // JUDUL
    public String getJudul(){
        return Judul;
    }
    
    public void setJudul(String Judul){
        this.Judul = Judul;
    }
    
    // AUTHOR
    public String getAuthor(){
        return Author;
    }
    
    public void setAuthor(String Author){
        this.Author = Author;
    }
    
    // Genre
    public String getGenre(){
        return Genre;
    }
    
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
    
    // Overriding untuk tampilkan data buku
    @Override
    public String toString() {
        return "Judul: " + Judul + " | Author: " + Author + " | Genre: " + Genre;
    }
}
