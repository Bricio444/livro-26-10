package application.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequesteMethod;
import org.springframework.web.bind.annotation.requesteParam;

import application.repositories.LivroRepository;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    private LivroRepository livrosRepo;
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp"; 
    }
  public String listar(){
    return "livro/list.jsp";
  }
  @RequestMapping("/insert")
  public String formInsert(){
    return "insert.jsp";
  }


  @RequestMapping("method"=RequesteMethod.POST)
  public String  saveInsert(@requesteParam("titulo")String titulo){
   livro livro= new livro();
   livro.strtitulo(livro);
   livro setTitulo(titulo);
   livrosRepo.save(livro);
   return "redirect:/livro/list";

  
  }
}
