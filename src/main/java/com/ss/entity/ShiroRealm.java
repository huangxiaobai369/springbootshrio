package com.ss.entity;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by Administrator on 2018-03-14.
 */
public class ShiroRealm extends AuthorizingRealm {

    /***
     *授权(验证权限时调用)
     * @param principalCollection
     * @return
     * 根据用户的权限信息做授权判断，这一步是以doGetAuthenticationInfo为基础的，只有在有用户信息后才能根据用户的角色和授权
     * 信息做判断是否给用户授权，因此这里的Roles和Permissions是用户的两个重点判断依据
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证(登录时调用)
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     * 获取用户的权限信息，这是为下一步的授权做判断，获取当前用户的角色和这些角色所拥有的权限信息。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
