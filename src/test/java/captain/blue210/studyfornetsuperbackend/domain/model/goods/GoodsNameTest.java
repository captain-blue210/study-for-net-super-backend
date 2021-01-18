package captain.blue210.studyfornetsuperbackend.domain.model.goods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GoodsNameTest {

  @Test
  @DisplayName("商品名を取得できる")
  public void testGetGoodsName() {
    GoodsName goodsName = new GoodsName("商品名テスト");
    assertEquals("商品名テスト", goodsName.getGoodsName());
  }

  @Test
  @DisplayName("商品名が0文字だった場合は例外を送出する")
  public void testSetGoodsName0() {
    assertThrows(RuntimeException.class, () -> new GoodsName(""));
  }

  @Test
  @DisplayName("商品名が101文字だった場合は例外を送出する")
  public void testSetGoodsNameExceeds200() {
    assertThrows(
        RuntimeException.class,
        () ->
            new GoodsName(
                "商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品"));
  }

  @Test
  @DisplayName("商品名が0文字より多く100文字以内だった場合、商品名を設定できる")
  public void testSetGoodsName200() {
    GoodsName goodsName =
        new GoodsName(
            "商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商品名商");
    assertEquals(100, goodsName.getGoodsName().length());
  }
}
