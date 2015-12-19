
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
 /**
  * Método que comprueba si funciona correctamente nuestro programa
  */   
 public void test()
 {
    MusicOrganizer Organizador = new MusicOrganizer();
    Organizador.addFile("cancion1.mp3");
    Organizador.addFile("cancion2.mp3");
    Organizador.addFile("cancion3.mp3");
    Organizador.getNumberOfFiles();
    Organizador.listFile(0);
    Organizador.listFile(5);
    Organizador.removeFile(5);
    Organizador.removeFile(0);
    Organizador.getNumberOfFiles();
    Organizador.checkIndex(5);
    Organizador.checkIndex(0);
    Organizador.validIndex(5);
    Organizador.validIndex(0);
 }
}

