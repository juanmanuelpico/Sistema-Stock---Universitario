package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Stock{
	private List<NotaPedido> lstNotaPedido;

	public Pedido(int idStock, Producto producto) {
		super(idStock, producto);
		this.lstNotaPedido = new ArrayList<NotaPedido>();
	}

	public List<NotaPedido> getLstNotaPedido() {
		return lstNotaPedido;
	}
	
	public boolean agregarNotaPedido(LocalDate fecha, int cantidad, String cliente){
		return lstNotaPedido.add(new NotaPedido(fecha, cantidad, cliente));
	}

	@Override
	public String toString() {
		return "Pedido "+ super.toString()+" \n[lstNotaPedido=" + lstNotaPedido + "]\n";
	}
	
	

}
