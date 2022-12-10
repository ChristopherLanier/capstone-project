package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.GlutenFree;
import io.codelaborators.serverside.repositories.GlutenFreeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class GlutenFreeController {

    @Resource
    private GlutenFreeRepository glutenFreeRepo;

    @GetMapping("/recipes/gluten-free")
        public Collection<GlutenFree> getAllGlutenFreeRecipes(){
        return (Collection<GlutenFree>) glutenFreeRepo.findAll();
    }
    @GetMapping("/recipes/{mealType}")
    public Collection<GlutenFree> getGlutenFreeRecipesByMealType(@PathVariable String mealType) {
        return (Collection<GlutenFree>) glutenFreeRepo.findByMealType(mealType.toLowerCase()); }
}
