package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * 设置java自带的安全管理器
 * 禁用所有权限
 */
public class DenySecurityManager extends SecurityManager{
    //按alt+Insert
    //Java安全管理器中的方法，检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限不足: "+perm.toString());
    }


}
