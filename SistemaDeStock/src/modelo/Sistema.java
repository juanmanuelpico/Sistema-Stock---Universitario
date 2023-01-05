package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Producto> lstProducto;
	private List<Stock> lstStock;
	
	public Sistema() {
		this.lstProducto = new ArrayList<Producto>();
		this.lstStock = new ArrayList<Stock>();
	}

	public List<Producto> getLstProducto() {
		return lstProducto;
	}

	public List<Stock> getLstStock() {
		return lstStock;
	}
	
	public boolean agregarProducto(String codigo, String nombre, double precio) throws Exception {
		return lstProducto.add(new Producto(calcularIdProducto(), codigo, nombre, precio));
	}
	
	public int calcularIdProducto() {
		int id = 1;
		if(!lstProducto.isEmpty()) {
			id = lstProducto.get(lstProducto.size()-1).getIdProducto()+1;
		}
		return id;
	}
	
	public Producto traerProducto(String codigo) {
		Producto producto = null;
		int i = 0;
		while(i < lstProducto.size() && producto == null) {
			if(lstProducto.get(i).getCodigo().equals(codigo))
				producto = lstProducto.get(i);
			
			i++;
		}
		
		return producto;
	}
	
	public int calcularIdStock() {
		int id = 1;
		if(!lstStock.isEmpty())
			id = lstStock.get(lstStock.size()-1).getIdStock()+1;
		
		return id;
	}
	
	public boolean agregarPedido(Producto producto) {
		return lstStock.add(new Pedido(calcularIdStock(), producto));
	}
	public boolean agregarAlmacen(Producto producto, int unidadesDeseable, int unidadesMinima) {
		return lstStock.add(new Almacen(calcularIdStock(), producto, unidadesDeseable, unidadesMinima));
	}
	
	public List<Stock> traerStock(Producto producto){
		List<Stock> stocks = new ArrayList<Stock>();
        for(Stock stock : lstStock) {
        	if(stock.getProducto().equals(producto))
        		stocks.add(stock);
        }
		
		return stocks;
	}
	
	public Stock traerStock(int idStock) {
		Stock stock = null;
		int i = 0;
		while(stock == null && i < lstStock.size()) {
			if(lstStock.get(i).getIdStock()==idStock)
				stock = lstStock.get(i);
			
			i++;
		}
		return stock;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
