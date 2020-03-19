package br.jus.tjpb.swrsn.rebeldes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebeldeRepository extends JpaRepository<Rebelde,Integer> {

}
