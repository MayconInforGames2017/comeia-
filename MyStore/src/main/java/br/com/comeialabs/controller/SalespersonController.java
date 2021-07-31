package br.com.comeialabs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.comeialabs.domain.Salesperson;
import br.com.comeialabs.exceptions.BusinessException;
import br.com.comeialabs.repository.SalespersonRepository;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/salesperson")
@AllArgsConstructor
public class SalespersonController {

	private SalespersonRepository salespersonRepository;

	@GetMapping("/list")
	public String list(ModelMap model) {
		List<Salesperson> salespersons = salespersonRepository.findAll();
		model.addAttribute("salespersons", salespersons);
		return "salesperson/list";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, RedirectAttributes attributes) {
		Salesperson salesperson = salespersonRepository.findById(id)
				.orElseThrow(() -> new BusinessException("Vendedor não encontrado. Id" + id));
		salespersonRepository.delete(salesperson);
		attributes.addFlashAttribute("message", "Operação realizada com sucesso.");
		return "redirect:/salesperson/list";
	}

	@GetMapping("/new")
	public String newSalesperson(Salesperson salesperson) {
		return "/salesperson/form";
	}

	@PostMapping("/save")
	public String save(@Valid Salesperson salesperson, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "/salesperson/form";
		}
		salespersonRepository.save(salesperson);
		attributes.addFlashAttribute("message", "Operação realizada com sucesso.");
		return "redirect:/salesperson/list";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, ModelMap model, RedirectAttributes attributes) {
		Salesperson salesperson = salespersonRepository
				.findById(id)
				.orElseThrow(() -> new BusinessException("Vendedor não encontrado. Id" + id));
		model.addAttribute("salesperson", salesperson);
		attributes.addFlashAttribute("message", "Operação realizada com sucesso.");
		return "/salesperson/form";
	}
	
}
