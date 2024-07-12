package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * 设置java自带的安全管理器
 */
public class DefaultSecurityManager extends SecurityManager{
    //按alt+Insert
    //Java安全管理器中的方法，检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不限制权限");
//        super.checkPermission(perm);
    }

}
