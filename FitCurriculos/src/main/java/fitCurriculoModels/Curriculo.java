package fitCurriculoModels;

public class Curriculo {
	private String donoCurriculo;
	private int curriculo;
	
	public Curriculo(String nome, int curriculo){
		this.donoCurriculo = nome;
		this.curriculo = curriculo;
	}
	
	public String getDonoCurriculo() {
		return donoCurriculo;
	}
	public void setDonoCurriculo(String donoCurriculo) {
		this.donoCurriculo = donoCurriculo;
	}
	public int getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(int curriculo) {
		this.curriculo = curriculo;
	} 
}
