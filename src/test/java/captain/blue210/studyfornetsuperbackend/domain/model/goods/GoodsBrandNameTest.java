package captain.blue210.studyfornetsuperbackend.domain.model.goods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GoodsBrandNameTest {

  @Test
  @DisplayName("商品ブランド名を取得できる")
  public void testGetGoodsBrandName() {
    GoodsBrandName goodsBrandName = new GoodsBrandName("ブランド名テスト");
    assertEquals("ブランド名テスト", goodsBrandName.getGoodsBrandName());
  }

  @Test
  @DisplayName("商品ブランド名が0文字だった場合は例外を送出する")
  public void testSetGoodsBrandName0() {
    assertThrows(RuntimeException.class, () -> new GoodsBrandName(""));
  }

  @Test
  @DisplayName("商品ブランド名が101文字だった場合は例外を送出する")
  public void testSetGoodsBrandNameExceeds200() {
    assertThrows(
        RuntimeException.class,
        () ->
            new GoodsBrandName(
                "商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブ"));
  }

  @Test
  @DisplayName("商品ブランド名が0文字より多く100文字以内だった場合、商品ブランド名を設定できる")
  public void testSetGoodsBrandName200() {
    GoodsBrandName goodsBrandName =
        new GoodsBrandName(
            "商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品ブランド名商品");
    assertEquals(100, goodsBrandName.getGoodsBrandName().length());
  }
}
