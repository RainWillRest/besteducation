package com.education.realm;


import com.education.pojo.Role;
import com.education.pojo.User;
import com.education.service.RoleService;
import com.education.service.SysMenuService;
import com.education.service.UserRoleService;
import com.education.service.UserService;
import com.education.service.impl.SysMenuServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sun on 2019/8/2.
 */

public class MyShiroRealm extends AuthorizingRealm{

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private UserRoleService userRoleService;


//授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
       User user = (User)principalCollection.getPrimaryPrincipal();
        List<Role> roles = (List<Role>) userRoleService.seleteById(user.getUserId());

        return simpleAuthorizationInfo;
    }
//身份认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;
        User realUser = userService.seleByUserName(userToken.getUsername());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return null;
    }
    //清理权限缓存
    public void clearCacheAuthorizationInfo(){
        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }
}
