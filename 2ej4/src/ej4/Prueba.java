package ej4;

public class Prueba
{
	public static void main(String[] args)
	{
		Proveedor prov1 = new Proveedor("Havanna"), prov2 = new Proveedor("Balcarce");
		Producto prod1 = new Producto(3, 120), prod2 = new Producto(4, 160), prod3 = new Producto(4, 175);
		LineaDePedido lp1 = new LineaDePedido(prod1, 3), lp2 = new LineaDePedido(prod2, 4), lp3 = new LineaDePedido(prod3, 1);
		Pedido pedido = new Pedido(prov1);
		pedido.addLinea(lp1);
		pedido.addLinea(lp2);
		pedido.addLinea(lp3);
		System.out.println("Proveedor: " + pedido.getProveedor().getNombre() + "\nTotal: " + pedido.costoTotal());
	}
}
