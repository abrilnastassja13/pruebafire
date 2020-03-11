package cl.desafiolatam.pruebafinal.domain.model;

import com.google.gson.annotations.SerializedName;

public class DomainModel {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getType() {
        return type;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getFecha() {
        return fecha;
    }

    public DomainModel(String nombre, int type, String descripcion, String videoUrl, String imageUrl, String fecha) {
        this.nombre = nombre;
        this.type = type;
        this.descripcion = descripcion;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.fecha = fecha;
    }

    private int type;

    private String descripcion;

    private String videoUrl;

    private String imageUrl;

    private String fecha;
}
