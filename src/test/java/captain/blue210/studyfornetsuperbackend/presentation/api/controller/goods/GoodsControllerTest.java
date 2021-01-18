package captain.blue210.studyfornetsuperbackend.presentation.api.controller.goods;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import captain.blue210.studyfornetsuperbackend.domain.model.goods.Goods;

@WebMvcTest
class GoodsControllerTest {
  @Autowired
  private MockMvc mock;

  @Test
  @WithMockUser("spring")
  @DisplayName("get all items")
  void testGetAllItems() throws Exception {
    Goods goods1 = new Goods(1, "test", "test");
    List<Goods> goodsList = new ArrayList<>();
    goodsList.add(goods1);

    mock.perform(get("/api/items")).andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$[0].goodsName", is(goods1.getGoodsName())));
  }
}
