package ej6;

public class Surtidor
{
	private static int proxId = 0;
	private int histGasoil, histPremium, histSuper, cantGasoil, cantPremium, cantSuper, ventasGasoil, ventasPremium,
			ventasSuper, id;
	private static final int maximaCarga = 20000;

	public Surtidor()
	{
		Surtidor.proxId++;
		id = Surtidor.proxId;
		this.cantGasoil = this.cantPremium = this.cantSuper = Surtidor.maximaCarga;
		this.ventasGasoil = this.ventasPremium = this.ventasSuper = this.histGasoil = this.histPremium = this.histSuper = 0;
	}

	public int getCantGasoil()
	{
		return cantGasoil;
	}

	public int getCantPremium()
	{
		return cantPremium;
	}

	public int getCantSuper()
	{
		return cantSuper;
	}

	public int getVentasGasoil()
	{
		return ventasGasoil;
	}

	public int getVentasPremium()
	{
		return ventasPremium;
	}

	public int getVentasSuper()
	{
		return ventasSuper;
	}

	public int getHistGasoil()
	{
		return histGasoil;
	}

	public int getHistPremium()
	{
		return histPremium;
	}

	public int getHistSuper()
	{
		return histSuper;
	}

	public int getId()
	{
		return this.id;
	}

	public boolean extraerGasoil(int litros)
	{
		boolean retorno = false;

		if (this.cantGasoil > 0)
		{
			if (this.cantGasoil >= litros)
			{
				retorno = true;
				this.histGasoil += litros;
				this.cantGasoil -= litros;
			}
			else
			{
				this.histGasoil += this.cantGasoil;
				this.cantGasoil = 0;
			}
			this.ventasGasoil++;
		}
		return retorno;
	}

	public boolean extraerPremium(int litros)
	{
		boolean retorno = false;
		if (this.cantPremium > 0)
		{
			if (this.cantPremium >= litros)
			{
				retorno = true;
				this.histPremium += litros;
				this.cantPremium -= litros;
			}
			else
			{
				this.histPremium += this.cantPremium;
				this.cantPremium = 0;
			}
			this.ventasPremium++;
		}
		return retorno;
	}

	public boolean extraerSuper(int litros)
	{
		boolean retorno = false;
		if (this.cantSuper > 0)
		{
			if (this.cantSuper >= litros)
			{
				retorno = true;
				this.histSuper += litros;
				this.cantSuper -= litros;
			}
			else
			{
				this.histSuper += this.cantSuper;
				this.cantSuper = 0;
			}
			this.ventasSuper++;
		}
		return retorno;
	}

	public void llenarDepositoGasoil()
	{
		this.cantGasoil = Surtidor.maximaCarga;
	}

	public void llenarDepositoPremium()
	{
		this.cantPremium = Surtidor.maximaCarga;
	}

	public void llenarDepositoSuper()
	{
		this.cantSuper = Surtidor.maximaCarga;
	}
}
