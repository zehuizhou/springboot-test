package com.example.demo.controller;
import com.example.demo.entity.Boy;
import com.example.demo.service.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;

    @GetMapping(value = "/boy")
    public List<Boy> findAll() {
        return boyRepository.findAll();
    }

    @PostMapping(value = "/boy")
    public Boy addBoy(@RequestParam("name") String name, @RequestParam("sex") String sex) {
        Boy boy = new Boy();
        boy.setName(name);
        boy.setSex(sex);
        return boyRepository.save(boy);
    }

    @GetMapping(value = "boy/{id}")
    public Optional<Boy> findOne(@PathVariable("id") Integer id){
        return boyRepository.findById(id);
    }

    @DeleteMapping(value = "/boy/{id}")
    public String delBoy(@PathVariable("id") Integer id){
        boyRepository.deleteById(id);
        return "success";
    }

    @PutMapping(value = "/boy/{id}")
    public Boy updBoy(@PathVariable("id") Integer id,
                      @RequestParam(value = "name", required = false) String name,
                      @RequestParam(value = "sex", required = false) String sex){
        Boy boy = new Boy();
        boy.setId(id);
        boy.setName(name);
        boy.setSex(sex);

        return boyRepository.save(boy);
    }

}
