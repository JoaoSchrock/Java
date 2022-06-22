package com.company.orientacao_a_objetos._6_topicos_avancados._6_13_desafio_collections;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/*

O custo com políticos no Brasil é um dos mais altos no mundo.

O valor do contra-cheque de um político corresponde a cerca de um quarto de tudo o que recebem por meio de inúmeras verbas e auxílios extraordinários.

Você, político honesto e programador Java, resolveu desenvolver um software para calcular os salários dos políticos por partido e cargo. Esse software irá lhe ajudar a propor mudanças dentro do governo.

As classes Cargo e Politico foram fornecidas para você pelo Ministério Público Eleitoral.

A classe Cargo representa o cargo de um político, como por exemplo "vereador", "deputado estadual" ou "prefeito". Um cargo possui uma descrição e o valor do salário.

import java.math.BigDecimal;

public class Cargo {

	private String descricao;
	private BigDecimal salario;

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}

A classe Politico representa, errrr... um político. Essa classe possui os atributos "nome" e "cargo", que referencia um objeto do tipo Cargo.

public class Politico {

	private String nome;
	private Cargo cargo;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}

Agora que você já tem as classes Cargo e Politico, precisa criar uma outra classe para organizar os políticos e seus partidos e calcular os gastos totais dos salários.

Para sua sorte, estamos entregando para você a classe Governo, que está quase pronta. As únicas coisas que faltam são as implementações os métodos calcularGastosComSalario() e calcularGastosComSalarioParaCargo().

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class Governo {

	// armazena uma lista de políticos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}

		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);

		// adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de políticos para o partido informado
		// e cálculo dos salários
	}

	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos políticos para o partido e cargo informados
		// e cálculo dos salários
	}

}

A classe Governo possui uma variável de instância para armazenar os políticos por partido. Para isso, é usado um mapa (interface Map).

private Map<String, List<Politico>> partidosPoliticos;

Essa linha está declarando um mapa (do Collections Framework) onde a chave é do tipo String e o valor do tipo List. Na chave do mapa, deve-se atribuir a sigla do partido. No valor, atribui-se um objeto do tipo List, como por exemplo um ArrayList.

A instanciação do mapa foi feita para você no construtor de Governo.

public Governo() {
	this.partidosPoliticos = new HashMap<String, List<Politico>>();
}

O método adicionarPolitico() inclui um novo político à lista de políticos, que está dentro do mapa. Se a lista ainda não estiver no mapa, o método deve criar um novo registro para a chave igual a sigla do partido. Essas regras já foram implementadas no método para você.



public void adicionarPolitico(String partidoPolitico, Politico politico) {
	...
}

Implemente apenas os métodos calcularGastosComSalario() e calcularGastosComSalarioParaCargo().



public BigDecimal calcularGastosComSalario(String partidoPolitico) {
	// implementar busca de políticos para o partido informado
	// e cálculo dos salários
}

public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
	// implementar busca dos políticos para o partido e cargo informados
	// e cálculo dos salários
}

Após implementar os métodos de cálculos, crie uma classe chamada Principal com o código-fonte abaixo:

import java.text.DecimalFormat;
import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

		// instancia governo
		Governo governo = new Governo();

		// instancia cargos
		Cargo vereador = new Cargo();
		vereador.setDescricao("Vereador");
		vereador.setSalario(new BigDecimal(16000));

		Cargo deputadoEstadual = new Cargo();
		deputadoEstadual.setDescricao("Deputado estadual");
		deputadoEstadual.setSalario(new BigDecimal(25000));

		Cargo prefeito = new Cargo();
		prefeito.setDescricao("Prefeito");
		prefeito.setSalario(new BigDecimal(27000));

		// adiciona vereadores
		Politico politico = new Politico();
		politico.setNome("João das Couves");
		politico.setCargo(vereador);
		governo.adicionarPolitico("RBLH", politico);

		politico = new Politico();
		politico.setNome("Zé Mané");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PCOR", politico);

		politico = new Politico();
		politico.setNome("Maria Carvalho");
		politico.setCargo(vereador);
		governo.adicionarPolitico("LDRS", politico);

		politico = new Politico();
		politico.setNome("Maria Carvalho");
		politico.setCargo(vereador);
		governo.adicionarPolitico("LDRS", politico);

		// adiciona deputados estaduais
		politico = new Politico();
		politico.setNome("Josefa Silva");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("LDRS", politico);

		politico = new Politico();
		politico.setNome("Fátima Gonçalves");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("PCOR", politico);

		// adiciona prefeito
		politico = new Politico();
		politico.setNome("Sebastião Mendes");
		politico.setCargo(prefeito);
		governo.adicionarPolitico("PCOR", politico);

		// calcula gastos com partidos
		BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
		System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));

		BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
		System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));

		// calcula gastos com partidos para determinados cargos
		BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
		System.out.println("Gastos com vereadores do partido LDRS: "
			+ formatador.format(gastosVereadoresLdrs.doubleValue()));

		BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
		System.out.println("Gastos com deputados estaduais do partido LDRS: "
			+ formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));

		BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
		System.out.println("Gastos com prefeitos do partido LDRS: "
			+ formatador.format(gastosPrefeitosLdrs.doubleValue()));
	}

}

Compile e execute. Quando estiver funcionando, altere a classe Principal para incluir novos partidos e políticos.

 */
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

        // instancia governo
        Governo governo = new Governo();

        // instancia cargos
        Cargo vereador = new Cargo();
        vereador.setDescricao("Vereador");
        vereador.setSalario(new BigDecimal(16000));

        Cargo deputadoEstadual = new Cargo();
        deputadoEstadual.setDescricao("Deputado estadual");
        deputadoEstadual.setSalario(new BigDecimal(25000));

        Cargo prefeito = new Cargo();
        prefeito.setDescricao("Prefeito");
        prefeito.setSalario(new BigDecimal(27000));

        // adiciona vereadores
        Politico politico = new Politico();
        politico.setNome("João das Couves");
        politico.setCargo(vereador);
        governo.adicionarPolitico("RBLH", politico);

        politico = new Politico();
        politico.setNome("Zé Mané");
        politico.setCargo(vereador);
        governo.adicionarPolitico("PCOR", politico);

        politico = new Politico();
        politico.setNome("Maria Carvalho");
        politico.setCargo(vereador);
        governo.adicionarPolitico("LDRS", politico);

        politico = new Politico();
        politico.setNome("Maria Carvalho");
        politico.setCargo(vereador);
        governo.adicionarPolitico("LDRS", politico);

        // adiciona deputados estaduais
        politico = new Politico();
        politico.setNome("Josefa Silva");
        politico.setCargo(deputadoEstadual);
        governo.adicionarPolitico("LDRS", politico);

        politico = new Politico();
        politico.setNome("Fátima Gonçalves");
        politico.setCargo(deputadoEstadual);
        governo.adicionarPolitico("PCOR", politico);

        // adiciona prefeito
        politico = new Politico();
        politico.setNome("Sebastião Mendes");
        politico.setCargo(prefeito);
        governo.adicionarPolitico("PCOR", politico);

        // calcula gastos com partidos
        BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
        System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));

        BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
        System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));

        // calcula gastos com partidos para determinados cargos
        BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
        System.out.println("Gastos com vereadores do partido LDRS: "
                + formatador.format(gastosVereadoresLdrs.doubleValue()));

        BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
        System.out.println("Gastos com deputados estaduais do partido LDRS: "
                + formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));

        BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
        System.out.println("Gastos com prefeitos do partido LDRS: "
                + formatador.format(gastosPrefeitosLdrs.doubleValue()));
    }

}