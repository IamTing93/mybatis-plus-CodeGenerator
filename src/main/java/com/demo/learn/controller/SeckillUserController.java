package com.demo.learn.controller;


import com.demo.learn.service.SeckillUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ting
 * @since 2021-05-06
 */
@RestController
@RequestMapping("/learn/seckillUser")
public class SeckillUserController {

	@Autowired
	private SeckillUserService seckillUserService;

	@GetMapping("{id}")
	public String getNameById(@PathVariable long id) {
		return seckillUserService.getById(id).getNickname();
	}

}
