package main.java.set.OperacoesBasicas;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(int codigoConvite, String nome) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }


    //comparação através do código do convite, para evitar duplicatas (é como se fosse um ID):
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    //to string:
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
