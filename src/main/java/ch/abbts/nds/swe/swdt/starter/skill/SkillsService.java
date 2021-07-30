package ch.abbts.nds.swe.swdt.starter.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SkillsService {

  @Autowired
  private SkillsRepository skillsRepository;

  @Autowired
  private SortingFactory sortingFactory;

  // ...
  public List<String> sort(String order) {
    // Speichert die Abgelegten "Skills" in eine Liste
    List<String> skills = skillsRepository.skills();
    // Liest die Sortiermethode ein
    Sortable sortStrategy = sortingFactory.getSortOrder(order);
    // Gibt die "Skills" nach der angewählten sort Metode zurück
    return sortStrategy.sort(skills);
  }
}