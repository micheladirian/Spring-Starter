package ch.abbts.nds.swe.swdt.starter.skill;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component("ascendingStringOrderImpl")
public class AscendingStringOrderImpl implements Sortable<String> {

  // Sortiert einen importierten String und legt diese dann in der Collectors Liste hinzu..!
  @Override
  public List<String> sort(List<String> input) {
    return input.stream().sorted().collect(Collectors.toList());
  }

  // Sortiert den input Nach "ASC" (aufsteigend)
  @Override
  public boolean supports(String input) {
    return "ASC".equals(input);
  }
}
