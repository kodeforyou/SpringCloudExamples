package com.kodeforyou.apps.springboot.resourcesconsumer.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kodeforyou.apps.springboot.resourcesconsumer.ResourceDto;

@FeignClient(name="payment-srvc-proxy", url="http://ec2-3-80-59-213.compute-1.amazonaws.com:8080/api/v1")
public interface ResourceSrvcProxy {
	@RequestMapping(value="/resources", method=RequestMethod.GET)
    public abstract List<ResourceDto> getAllResoruces();
	
	@RequestMapping(value="/resources/{rid}", method=RequestMethod.GET)
    public abstract ResourceDto getResoruce(@PathVariable(value = "rid") int rid);
}
