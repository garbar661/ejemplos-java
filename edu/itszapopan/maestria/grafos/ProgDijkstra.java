package edu.itszapopan.maestria.grafos;

public class ProgDijkstra {

  public static void main (String args[]) {
    Digrafo dg;

    dg = new Digrafo(10);

    dg.setArista(0,"a");
    dg.setArista(1,"b");
    dg.setArista(2,"c");
    dg.setArista(3,"d");
    dg.setArista(4,"e");
    dg.setArista(5,"f");
    dg.setArista(6,"g");
    dg.setArista(7,"h");
    dg.setArista(8,"i");
    dg.setArista(9,"j");

    dg.setConexion("a","e",1);


  }








}

