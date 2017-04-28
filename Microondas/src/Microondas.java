
public class Microondas {
	private boolean ligado;
	private String status;
	private boolean portaFechada;
	private String porta;
	private String marca;
	
	Microondas(){
		
	}
			
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Liga/Desliga
	public void onoff(){
		if (ligado == true && portaFechada == true){
			status = "Ligado";
		}else if (ligado == true && portaFechada == false){
			status = "O microondas não pode ser ligado com a porta aberta!";
		}else{
			status = "Desligado";
		}
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public String getStatus() {
		return status;
	}	
	
	public String getLiga(){
		ligado = true;
		status = "Ligado";
		return status;
	}
	
	public String getDesliga(){
		ligado = false;
		status = "Desligado";
		return status;
	}
	
	//Abre/Fecha
		public void openclose(){
			if (portaFechada == true){
				porta = "Fechada";
			}else if (portaFechada == false){
				porta = "Aberta";
			}
		}
		
	public void setportaFechada(boolean portaFechada) {
			this.portaFechada = portaFechada;
	}

	public String getPorta(){
		return porta;
	}
	
	public String getAbrirPorta() {
		portaFechada = false;
		porta = "Aberta";
		return porta;
	}
	
	public String getFecharPorta() {
		portaFechada = true;
		porta = "Fechada";
		return porta;
	}
	
}
