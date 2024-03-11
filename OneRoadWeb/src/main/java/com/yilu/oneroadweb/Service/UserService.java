package com.yilu.oneroadweb.Service;

import com.yilu.oneroadweb.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void register(User user);
    User login(User user);
}
