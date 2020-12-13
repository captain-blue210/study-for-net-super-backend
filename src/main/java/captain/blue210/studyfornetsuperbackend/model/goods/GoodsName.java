package captain.blue210.studyfornetsuperbackend.model.goods;

public class GoodsName {
  private final String goodsName;

  public GoodsName(String goodsName) {
    // 完全コンストラクタ
    // 文字数チェック
    if (!isValidLength(goodsName)) {
      throw new RuntimeException("GoodsName length is not valid.");
    }

    this.goodsName = goodsName;
  }

  private static boolean isValidLength(String goodsName) {
    return goodsName.length() > 0 && goodsName.length() <= 200;
  }

  public String getGoodsName() {
    return this.goodsName;
  }
}
