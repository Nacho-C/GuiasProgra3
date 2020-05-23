package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import modelo.LineaDePedido;
import modelo.OperacionConjuntoInvalidaException;
import modelo.Pedido;
import modelo.Producto;
import modelo.Proveedor;

public class Ventana extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private ArrayList<Pedido> pedidos = new ArrayList();
	private ArrayList<Proveedor> proveedores = new ArrayList();
	private ArrayList<Producto> productos = new ArrayList();
	private ArrayList<LineaDePedido> lineas = new ArrayList();
	private DefaultListModel<Pedido> modeloListaPedidos = new DefaultListModel();
	private DefaultListModel<Proveedor> modeloListaProveedores = new DefaultListModel();
	private DefaultListModel<Producto> modeloListaProductos = new DefaultListModel();
	private DefaultListModel<LineaDePedido> modeloListaLineas = new DefaultListModel();
	private JPanel panelNuevoPedido;
	private JPanel panelPedidosExistentes;
	private JPanel panelLineaNueva;
	private JLabel labelProducto;
	private JLabel labelCantidad;
	private JTextArea textoCantidad;
	private JLabel labelVacio;
	private JButton botonAgregarLineaDePedido;
	private JLabel labelNuevoPedido;
	private JButton botonAgregarPedido;
	private JPanel panelProveedores;
	private JScrollPane scrollProveedores;
	private JLabel labelProveedores;
	private JList listaProveedores;
	private JLabel labelPedidos;
	private JScrollPane scrollPedidos;
	private JList listaPedidos;
	private JScrollPane scrollProductos;
	private JList listaProductos;
	private JPanel panelLineasExistentes;
	private JLabel labelLineasExistentes;
	private JScrollPane scrollLineasExistentes;
	private JList listaLineasExistentes;
	private JButton botonEliminarLinea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Ventana frame = new Ventana();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana()
	{
		this.proveedores.add(new Proveedor("Proveedor A"));
		this.proveedores.add(new Proveedor("Proveedor B"));
		this.productos.add(new Producto(123,500));
		this.productos.add(new Producto(124,1500));
		this.productos.add(new Producto(125,200));
		this.modeloListaProductos.addAll(this.productos);
		this.modeloListaProveedores.addAll(this.proveedores);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1185, 204);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(15, 0));
		setContentPane(this.contentPane);
		
		this.panelNuevoPedido = new JPanel();
		this.panelNuevoPedido.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.contentPane.add(this.panelNuevoPedido, BorderLayout.WEST);
		this.panelNuevoPedido.setLayout(new BorderLayout(15, 10));
		
		this.panelProveedores = new JPanel();
		this.panelNuevoPedido.add(this.panelProveedores, BorderLayout.WEST);
		this.panelProveedores.setLayout(new BorderLayout(0, 0));
		
		this.scrollProveedores = new JScrollPane();
		this.panelProveedores.add(this.scrollProveedores, BorderLayout.CENTER);
		
		this.listaProveedores = new JList();
		this.listaProveedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.scrollProveedores.setViewportView(this.listaProveedores);
		this.listaProveedores.setModel(modeloListaProveedores);
		
		this.labelProveedores = new JLabel("Proveedores:");
		this.panelProveedores.add(this.labelProveedores, BorderLayout.NORTH);
		
		this.panelLineaNueva = new JPanel();
		this.panelNuevoPedido.add(this.panelLineaNueva, BorderLayout.CENTER);
		this.panelLineaNueva.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.labelProducto = new JLabel("Producto: ");
		this.panelLineaNueva.add(this.labelProducto);
		
		this.scrollProductos = new JScrollPane();
		this.panelLineaNueva.add(this.scrollProductos);
		
		this.listaProductos = new JList();
		this.listaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.scrollProductos.setViewportView(this.listaProductos);
		this.listaProductos.setModel(this.modeloListaProductos);
		
		this.labelCantidad = new JLabel("Cantidad: ");
		this.panelLineaNueva.add(this.labelCantidad);
		
		this.textoCantidad = new JTextArea();
		this.panelLineaNueva.add(this.textoCantidad);
		
		this.labelVacio = new JLabel("");
		this.panelLineaNueva.add(this.labelVacio);
		
		this.botonAgregarLineaDePedido = new JButton("Agregar linea");
		this.botonAgregarLineaDePedido.addActionListener(this);
		this.panelLineaNueva.add(this.botonAgregarLineaDePedido);
		
		this.labelNuevoPedido = new JLabel("Nuevo pedido");
		this.panelNuevoPedido.add(this.labelNuevoPedido, BorderLayout.NORTH);
		
		this.botonAgregarPedido = new JButton("Agregar pedido");
		this.botonAgregarPedido.addActionListener(this);
		this.panelNuevoPedido.add(this.botonAgregarPedido, BorderLayout.SOUTH);
		
		this.panelLineasExistentes = new JPanel();
		this.panelNuevoPedido.add(this.panelLineasExistentes, BorderLayout.EAST);
		this.panelLineasExistentes.setLayout(new BorderLayout(0, 0));
		
		this.labelLineasExistentes = new JLabel("Lineas de pedido");
		this.panelLineasExistentes.add(this.labelLineasExistentes, BorderLayout.NORTH);
		
		this.scrollLineasExistentes = new JScrollPane();
		this.panelLineasExistentes.add(this.scrollLineasExistentes, BorderLayout.CENTER);
		
		this.listaLineasExistentes = new JList();
		this.scrollLineasExistentes.setViewportView(this.listaLineasExistentes);
		this.listaLineasExistentes.setModel(this.modeloListaLineas);
		
		this.botonEliminarLinea = new JButton("Eliminar linea");
		this.botonEliminarLinea.addActionListener(this);
		this.panelLineasExistentes.add(this.botonEliminarLinea, BorderLayout.SOUTH);
		
		this.panelPedidosExistentes = new JPanel();
		this.panelPedidosExistentes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.contentPane.add(this.panelPedidosExistentes, BorderLayout.CENTER);
		this.panelPedidosExistentes.setLayout(new BorderLayout(0, 0));
		
		this.labelPedidos = new JLabel("Pedidos existentes");
		this.panelPedidosExistentes.add(this.labelPedidos, BorderLayout.NORTH);
		
		this.scrollPedidos = new JScrollPane();
		this.panelPedidosExistentes.add(this.scrollPedidos, BorderLayout.CENTER);
		
		this.listaPedidos = new JList();
		this.scrollPedidos.setViewportView(this.listaPedidos);
		this.listaPedidos.setModel(this.modeloListaPedidos);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		Pedido auxPedido;
		Iterator<LineaDePedido> it;
		if (arg0.getSource() == this.botonAgregarLineaDePedido)
		{
			try
			{
				this.lineas.add(new LineaDePedido((Producto) this.listaProductos.getSelectedValue(),(int) Integer.parseInt(this.textoCantidad.getText())));
				this.modeloListaLineas.clear();
				this.modeloListaLineas.addAll(this.lineas);
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "Debe ingresar un número entero de productos.");
			}
		}
		if (arg0.getSource() == this.botonEliminarLinea)
		{
			this.lineas.remove((LineaDePedido) this.listaLineasExistentes.getSelectedValue());
			this.modeloListaLineas.clear();
			this.modeloListaLineas.addAll(this.lineas);
		}
		if (arg0.getSource() == this.botonAgregarPedido)
		{
			auxPedido = new Pedido((Proveedor) this.listaProveedores.getSelectedValue(), new GregorianCalendar().getTime());
			it = this.lineas.iterator();
			while (it.hasNext())
			{
				try
				{
					auxPedido.agrega(it.next());
				}
				catch (OperacionConjuntoInvalidaException e)
				{
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			this.lineas.clear();
			this.modeloListaLineas.clear();
			this.pedidos.add(auxPedido);
			this.modeloListaPedidos.clear();
			this.modeloListaPedidos.addAll(this.pedidos);
		}
	}
}
