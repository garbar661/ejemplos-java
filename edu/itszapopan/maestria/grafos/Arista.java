package edu.itszapopan.maestria.grafos;

public class Arista {

  private String nombre;
  private int    distancia;
  private String previo;

  public Arista(){
    nombre = "";
    distancia = 0x7FFFFFFF;
    previo = "";
  }

  public Arista(String nombre, int dist){
    this.nombre = nombre;
    distancia = dist;
    previo = "";
  }

  public Arista(String nombre){
    this.nombre = nombre;
    distancia = 0x7FFFFFFF;
    previo = "";
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(Sring nombre){
    this.nombre = nombre;
  }

  public int getDistancia(){
    return distancia;
  }

  public void setDistancia(int dist){
    distancia = dist;
  }

  public String getPrevio(){
    return previo;
  }

  public void setPrevio(Sring previo){
    this.previo = previo;
  }


}


