package br.com.fiap.epicinvest.stock;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("stocks")
public class StockController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("stocks", List.of(
            "Ação 1",
            "Ação 2",
            "Ação 3",
            "Teste unitário"
        ));
        return "stock/index";
    }
    
}
