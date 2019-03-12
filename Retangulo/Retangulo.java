public class Retangulo{
    private Double comprimento = 2.0;
    private Double largura = 2.0;
    private Double area;
    private Double perimetro;

    public Retangulo(Double comp,Double largura){
        this.comprimento = Double.valueOf(comp);
        this.largura = Double.valueOf(largura);
    }

    public void Area(){
        area = comprimento * largura;
        System.out.println("Area:"+ area);
    }

    public void Perimetro(){
        perimetro = largura + largura + comprimento + comp;
        System.out.println("Perimetro: " + perimetro);
    }

    public Double getComp()
	{
		return this.comp;
	}

	public void setComprimento(Double comprimento)
	{
        if(comprimento > 0.0){
            this.Comprimento = Comprimento;
        }else{
		System.out.println("Lado menor ou igual a zero!");
        System.exit(0);
        }
	}

	public Double getLarg()
	{
		return this.larg;
	}

	public void setLarg(Double largura)
	{
        if(largura > 0.0){
            this.largura = largura;
        }else{
            System.out.println("Lado menor ou igual a zero!");
            System.exit(0);
        }   
	}

}