package captain.blue210.studyfornetsuperbackend.domain.model.goods;

import lombok.Getter;

@Getter
public class GoodsBrandName {
  private final String goodsBrandName;

  public GoodsBrandName(String goodsBrandName) {
    if (!isValidLength(goodsBrandName)) {
      throw new RuntimeException("GoodsBrandName length is not valid.");
    }
    this.goodsBrandName = goodsBrandName;
  }

  private static boolean isValidLength(String goodsBrandName) {
    return goodsBrandName.length() > 0 && goodsBrandName.length() <= 100;
  }
}
