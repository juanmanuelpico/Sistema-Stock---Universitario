package modelo;

public abstract class Stock {
	protected int idStock;
	protected Producto producto;
	
	public Stock(int idStock, Producto producto) {
		this.idStock = idStock;
		this.producto = producto;
	}

	public int getIdStock() {
		return idStock;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", producto=" + producto + "]";
	}

	
	
    
	
	
	
	
	

}
