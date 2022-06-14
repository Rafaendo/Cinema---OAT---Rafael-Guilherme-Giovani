class Funcionario {

  private String nome;
  private float salario;
  private int caixa;
  private String vendas;
  private int bilheteiro;


  Funcionario(String n, float dinheiro, int banco, String consumo, int ingresso){
    System.out.println("Bilheteria");
    nome = n;
    salario = dinheiro;
    caixa = banco;
    vendas = consumo;
    bilheteiro = ingresso;
  }

}