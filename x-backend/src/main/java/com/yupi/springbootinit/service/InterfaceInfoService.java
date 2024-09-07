package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.InterfaceInfo;

public interface InterfaceInfoService extends IService<InterfaceInfo> {
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) ;
}
