package br.jus.tjpb.swrsn.rebeldes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.jus.tjpb.swrsn.itens.Item;

@Entity
public class Rebelde implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String nomeBase;
	private Integer idade;
	private Integer latitude;
	private Integer longitude;
	private Integer acusado;
	
	@OneToMany(mappedBy= "rebel" )
	private List<Item> inventario = new ArrayList<>(); 
	
	public Rebelde() {
		
	}

	public Rebelde(Integer id, String nome, String nomeBase, Integer idade, Integer latitude, Integer longitude,
			Integer acusado) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeBase = nomeBase;
		this.idade = idade;
		this.latitude = latitude;
		this.longitude = longitude;
		this.acusado = acusado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeBase() {
		return nomeBase;
	}

	public void setNomeBase(String nomeBase) {
		this.nomeBase = nomeBase;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public List<Item> getInventario() {
		return inventario;
	}

	public void setInventario(List<Item> inventario) {
		this.inventario = inventario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rebelde other = (Rebelde) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getAcusado() {
		return acusado;
	}

	public void setAcusado(Integer acusado) {
		this.acusado = acusado;
	}
	
	

}
