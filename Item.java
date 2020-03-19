package br.jus.tjpb.swrsn.itens;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.jus.tjpb.swrsn.rebeldes.Rebelde;

@Entity
public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	private Integer quantidade;
	private Integer pontos;
	
	@ManyToOne
	@JoinColumn(name="rebelde_id")
	private Rebelde rebel;
	
	public Item() {
		
	}

	public Item(Integer id, String tipo, Integer quantidade, Integer pontos, Rebelde rebel) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.pontos = pontos;
		this.rebel = rebel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Rebelde getRebel() {
		return rebel;
	}

	public void setRebel(Rebelde rebel) {
		this.rebel = rebel;
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
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
