package com.loja_virtual.loja.domain;


@Entity
@Table(name = produto)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter

public class LojaDomain implements Serializable{

    private static final long serialVersionUID = 4048798961366546485L;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private id;

    @Column(name="nome")
    private nome;

    @Column(name="preco")
    private preco;

    @Column(name="descricao")
    private descricao;

}