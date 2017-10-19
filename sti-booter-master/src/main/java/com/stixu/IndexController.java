package com.stixu;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stixu.domain.Role;
import com.stixu.security.RoleRepository;

/**
 *
 * @author ganhuan
 */
@RestController
public class IndexController {
	   
	public RoleRepository roleRepository;
	
	
    /**
	 * @param roleRepository
	 */
	@Inject
	public IndexController(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}
   
    @RequestMapping("/role")
    public Role getRole() {
    	return roleRepository.findOne("0001");
    }
    
}
