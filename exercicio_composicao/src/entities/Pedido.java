package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import enums.StatusPedido;

public class Pedido {
	Date momento;
	StatusPedido status;
	Cliente cliente;
	List<ItemPedido> item = new ArrayList<>();
	
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public StatusPedido getStatus() {
		return this.status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;	
	}
	
	public String getCliente() {
		return this.cliente.toString();
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem (ItemPedido item) {
		this.item.add(item); 
	}
	
	public void removeItem(ItemPedido item) {
		this.item.remove(item);
	}
	
	public List<ItemPedido> getItemPedido() {
		return item;
	}

	public String toString() {
		return "Pedido \n"
			 + "momento=" + momento + ", \n"
			 + "status=" + status + ", \n"
			 + "cliente=" + cliente + ", \n"
			 + "item=" + item + "]";
	}
	
	
	
}
