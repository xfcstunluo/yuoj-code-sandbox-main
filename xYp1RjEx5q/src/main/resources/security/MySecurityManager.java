
import java.security.Permission;

/**
 * 设置java自带的安全管理器
 */
public class MySecurityManager extends SecurityManager{
    //按alt+Insert
    //Java安全管理器中的方法，检查所有权限
    @Override
    public void checkPermission(Permission perm) {
//        super.checkPermission(perm);
    }

    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("执行的权限不足: "+cmd);

    }

    @Override
    public void checkRead(String file) {
//        throw new SecurityException("读的权限不足: "+file);
    }

    @Override
    public void checkWrite(String file) {
//        throw new SecurityException("写的权限不足: "+file);

    }

    @Override
    public void checkDelete(String file) {
//        throw new SecurityException("删除的权限不足: "+file);

    }

    @Override
    public void checkConnect(String host, int port) {
//        throw new SecurityException("连接网络的权限不足: "+host+":"+port);

    }
}
