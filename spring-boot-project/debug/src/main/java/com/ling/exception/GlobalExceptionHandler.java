package com.ling.exception;


import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 参数校验异常，将校验失败的所有异常组合成一条错误信息
	 *
	 * @param e 异常
	 * @return 异常结果
	 */
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity handleValidException(HttpServletRequest req, MethodArgumentNotValidException e) {
		log.warn("Catch a MethodArgumentNotValidException（参数绑定校验异常） in API【 {} 】, message：[{}]", req.getRequestURL().toString(), e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
		return wrapperBindingResult(e.getBindingResult());
	}

	/**
	 * 包装绑定异常结果
	 *
	 * @param bindingResult 绑定结果
	 * @return 异常结果
	 */
	private ResponseEntity wrapperBindingResult(BindingResult bindingResult) {
		StringBuilder msg = new StringBuilder();
		for (ObjectError error : bindingResult.getAllErrors()) {
			msg.append(", ");
			msg.append(Optional.ofNullable(error.getDefaultMessage()).orElse(""));
		}
		return ResponseEntity.badRequest().body(msg.substring(2));
	}
}
