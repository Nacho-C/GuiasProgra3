package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.ListaConPrioridades;
import modelo.Llamado;
import modelo.OperadoraEmergencias;
import modelo.Socio;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Ventana extends JFrame implements ActionListener, ListSelectionListener
{

	private JPanel contentPane;
	private JPanel panelSocios;
	private JPanel panelUrgente;
	private JLabel labelPanelSocios;
	private JScrollPane scrollPanelSocios;
	private JList listaSocios;
	private JPanel botoneraSocios;
	private JTextField campoPrioridad;
	private JButton botonAgregarLlamado;
	private JLabel labelPrioridad;
	private JLabel labelUrgente;
	private JButton botonAtenderUrgente;
	private JPanel panel;
	private JTextArea textoUrgente;
	OperadoraEmergencias operadora = new OperadoraEmergencias();
	ArrayList<Socio> socios = new ArrayList();
	DefaultListModel<Socio> modeloLista;
	private JPanel panelInferior;
	private JPanel panelCantidad;
	private JLabel labelCantidad;
	private JTextArea textoCantidad;
	private JLabel labelSocioMasEmergencias;
	private JTextArea textoSocioMasEmergencias;
	
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
		this.socios.add(new Socio(42455271,"Nacho","Avenida Colón 1825"));
		this.socios.add(new Socio(16174448,"Raul","España 1139"));
		this.socios.add(new Socio(22541112,"Majo","España 1139"));
		this.modeloLista = new DefaultListModel();
		this.modeloLista.addAll(this.socios);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panelSocios = new JPanel();
		this.contentPane.add(this.panelSocios, BorderLayout.WEST);
		this.panelSocios.setLayout(new BorderLayout(0, 0));
		
		this.labelPanelSocios = new JLabel("Socios");
		this.panelSocios.add(this.labelPanelSocios, BorderLayout.NORTH);
		
		this.scrollPanelSocios = new JScrollPane();
		this.panelSocios.add(this.scrollPanelSocios, BorderLayout.CENTER);
		
		this.listaSocios = new JList();
		this.listaSocios.addListSelectionListener(this);
		this.scrollPanelSocios.setViewportView(this.listaSocios);
		this.listaSocios.setModel(modeloLista);
		
		this.botoneraSocios = new JPanel();
		this.panelSocios.add(this.botoneraSocios, BorderLayout.SOUTH);
		this.botoneraSocios.setLayout(new BorderLayout(0, 0));
		
		this.labelPrioridad = new JLabel("Prioridad:");
		this.botoneraSocios.add(this.labelPrioridad, BorderLayout.WEST);
		
		this.campoPrioridad = new JTextField();
		this.botoneraSocios.add(this.campoPrioridad, BorderLayout.CENTER);
		this.campoPrioridad.setColumns(10);
		
		this.botonAgregarLlamado = new JButton("Agregar llamado");
		this.botonAgregarLlamado.addActionListener(this);
		this.botoneraSocios.add(this.botonAgregarLlamado, BorderLayout.EAST);
		
		this.panelCantidad = new JPanel();
		this.botoneraSocios.add(this.panelCantidad, BorderLayout.NORTH);
		
		this.labelCantidad = new JLabel("Cantidad de llamados del socio: ");
		this.panelCantidad.add(this.labelCantidad);
		
		this.textoCantidad = new JTextArea();
		this.panelCantidad.add(this.textoCantidad);
		
		this.panelUrgente = new JPanel();
		this.contentPane.add(this.panelUrgente, BorderLayout.CENTER);
		this.panelUrgente.setLayout(new BorderLayout(0, 0));
		
		this.labelUrgente = new JLabel("Llamado más urgente");
		this.panelUrgente.add(this.labelUrgente, BorderLayout.NORTH);
		
		this.panel = new JPanel();
		this.panelUrgente.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.textoUrgente = new JTextArea();
		this.textoUrgente.setEditable(false);
		this.panel.add(this.textoUrgente, BorderLayout.CENTER);
		
		this.botonAtenderUrgente = new JButton("Atender");
		this.botonAtenderUrgente.addActionListener(this);
		this.panelUrgente.add(this.botonAtenderUrgente, BorderLayout.SOUTH);
		
		this.panelInferior = new JPanel();
		this.contentPane.add(this.panelInferior, BorderLayout.SOUTH);
		this.panelInferior.setLayout(new BorderLayout(0, 0));
		
		this.labelSocioMasEmergencias = new JLabel("Socio con más emergencias atendidas: ");
		this.panelInferior.add(this.labelSocioMasEmergencias, BorderLayout.WEST);
		
		this.textoSocioMasEmergencias = new JTextArea();
		this.textoSocioMasEmergencias.setEditable(false);
		this.panelInferior.add(this.textoSocioMasEmergencias, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		if (arg0.getSource() == this.botonAgregarLlamado)
		{
			int prioridad;
			try 
			{
				prioridad = (int) Integer.parseInt(this.campoPrioridad.getText());
				this.operadora.agrega(new Llamado(prioridad,(Socio) this.listaSocios.getSelectedValue()));
				this.textoCantidad.setText("" + this.operadora.cantidadLlamados((Socio) this.listaSocios.getSelectedValue()));
				this.textoUrgente.setText(this.operadora.consultaElemento().toString());
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Debe ingresar un número entero en el campo de prioridad.");
			}
		}
		if (arg0.getSource() == this.botonAtenderUrgente)
		{
			try
			{
				this.operadora.getElemento();
				this.textoUrgente.setText(this.operadora.consultaElemento().toString());
				this.textoSocioMasEmergencias.setText(this.operadora.getSocioMasEmergencias().toString());
			}
			catch (Exception e)
			{
				this.textoUrgente.setText("");
				JOptionPane.showMessageDialog(null, "Actualmente no hay llamados pendientes.");
			}
		}
	}
	public void valueChanged(ListSelectionEvent arg0) {
		if (arg0.getSource() == this.listaSocios)
			this.textoCantidad.setText("" + this.operadora.cantidadLlamados((Socio) this.listaSocios.getSelectedValue()));
	}
}
