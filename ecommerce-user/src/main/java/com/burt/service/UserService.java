package com.burt.service;

import com.burt.model.User;

/**
 * @author burt created on 2021/12/8
 * @version $Id$
 */
public interface UserService {

    User getUserById(Long userId);
}
