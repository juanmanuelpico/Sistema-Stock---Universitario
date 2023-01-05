package test;

import java.time.LocalDate;

import modelo.Almacen;
import modelo.Pedido;
import modelo.Sistema;

public class TestModelo {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		System.out.println("\n ------ TEST 1 -----\n");
		
		try {
			sistema.agregarProducto("1111111111", "producto 1", 100);
			sistema.agregarProducto("2222222222", "producto 2", 200);
			sistema.agregarProducto("3333333333", "producto 3", 300);
			sistema.agregarProducto("4444444444", "producto 4", 400);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sistema.getLstProducto());

		System.out.println("\n ------ TEST 2 -----\n");
		
		try {
			sistema.agregarProducto("111", "producto 6", 300);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sistema.agregarProducto("222", "producto 7", 400);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n ------ TEST 3 -----\n");
		
			sistema.agregarPedido(sistema.traerProducto("1111111111"));
			sistema.agregarPedido(sistema.traerProducto("2222222222"));
		
		
		System.out.println(sistema.getLstStock());
	  
		System.out.println("\n ------ TEST 4 -----\n");
		
		sistema.agregarAlmacen(sistema.traerProducto("2222222222"), 10, 8);
		sistema.agregarAlmacen(sistema.traerProducto("3333333333"), 120, 100);
		System.out.println(sistema.getLstStock());
		
		System.out.println("\n ------ TEST 5 -----\n");
		System.out.println(sistema.traerStock(sistema.traerProducto("2222222222")));
		
		System.out.println("\n ------ TEST 6 -----\n");
//		en vez de hacer esto castear de la siguiente forma:
//		Pedido pedido = (Pedido)sistema.traerStock(1);
		((Pedido)sistema.traerStock(1)).agregarNotaPedido(LocalDate.of(2021, 7, 14), 100, "cliente 1");
		((Pedido)sistema.traerStock(1)).agregarNotaPedido(LocalDate.of(2021, 7, 14), 120, "cliente 2");
		((Pedido)sistema.traerStock(1)).agregarNotaPedido(LocalDate.of(2021, 7, 14), 150, "cliente 3");
		
		
		System.out.println(((Pedido)sistema.traerStock(1)));
		
		System.out.println("\n ------ TEST 7 -----\n");
		
		Almacen almacen = (Almacen)sistema.traerStock(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
