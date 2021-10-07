package umn.ac.id;

import java.io.Serializable;

public class SumberVideo implements Serializable {
    private String judul;
    private String keterangan;
    private String videoURI;
    public SumberVideo(String judul, String keterangan,
                       String videoURI){
        this.judul = judul;
        this.keterangan = keterangan;
        this.videoURI = videoURI;
    }
    public String getJudul() { return this.judul; }
    public String getKeterangan() { return this.keterangan; }
    public String getVideoURI() { return this.videoURI; }
    public String toString() { return this.getJudul() + " => "
            + this.getKeterangan(); }
}

