package captain.blue210.studyfornetsuperbackend.domain.model.goods;

import lombok.Getter;

@Getter
public class Goods {
  private final Integer goodsId;
  private final String goodsName;
  private final String goodsBrandName;

  public Goods(Integer goodsId, String goodsName, String goodsBrandName) {
    this.goodsId = goodsId;
    this.goodsName = goodsName;
    this.goodsBrandName = goodsBrandName;
  }
}
