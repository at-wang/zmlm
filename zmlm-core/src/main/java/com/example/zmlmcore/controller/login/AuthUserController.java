package com.example.zmlmcore.controller.login;


import com.example.zmlmcommon.utils.FSUtil;
import me.zhyd.oauth.config.AuthConfig;
import me.zhyd.oauth.model.AuthCallback;
import me.zhyd.oauth.model.AuthResponse;
import me.zhyd.oauth.request.AuthFeishuRequest;
import me.zhyd.oauth.request.AuthRequest;
import me.zhyd.oauth.utils.AuthStateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 用户第三方认证表 前端控制器
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@RestController
@RequestMapping("/auth")
public class AuthUserController {




    @RequestMapping("/login")
    public void renderAuth(HttpServletResponse response) throws IOException {
        AuthRequest authRequest = getAuthRequest();
        response.sendRedirect(authRequest.authorize(AuthStateUtils.createState()));
    }

    @RequestMapping("/authLogin")
    public Object authLogin(AuthCallback callback) {
        AuthRequest authRequest = getAuthRequest();

        AuthResponse login = authRequest.login(callback);
        return login;
    }

    private AuthRequest getAuthRequest() {
        return new AuthFeishuRequest(AuthConfig.builder()
                .clientId(FSUtil.APP_ID)
                .clientSecret(FSUtil.APP_SECRET)
                .redirectUri(FSUtil.URL)
                .build());
    }

}
