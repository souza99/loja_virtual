

public interface LojaRepository extends JpaRepository<LojaDomain, Long>{

    @Query(valeu = "Select a from LojaDomain a where a.nome like %?1%")
    Page<LolaDomain> findBynome(String nome, Pageable page);


    Page <LojaDomain> fidAll(Pageable page);
}