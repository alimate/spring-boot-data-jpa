package com.alimate.service;

import com.alimate.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
@RequestMapping("/skills")
public class SkillsService {
    @Autowired private SkillRepository skillRepository;

    @RequestMapping(value = "/{skillId}", method = DELETE)
    public String deleteSkill(@PathVariable String skillId) {
        skillRepository.delete(skillId);

        return "Deleted";
    }
}