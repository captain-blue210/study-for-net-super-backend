package captain.blue210.studyfornetsuperbackend.presentation.api.controller.goods;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import captain.blue210.studyfornetsuperbackend.domain.model.goods.Goods;

@RestController
@RequestMapping("/api")
public class GoodsController {

  @GetMapping("/items")
  public List<Goods> getAll(@RequestParam(value = "page", defaultValue = "1") Integer page) {
    Goods goods = new Goods(1, "test", "test");
    List<Goods> goodsList = new ArrayList<>();
    goodsList.add(goods);
    return goodsList;
  }
}
