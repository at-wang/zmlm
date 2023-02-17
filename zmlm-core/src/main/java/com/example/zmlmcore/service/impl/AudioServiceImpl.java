package com.example.zmlmcore.service.impl;

import com.example.zmlmcore.domain.Audio;
import com.example.zmlmcore.dao.AudioDao;
import com.example.zmlmcore.service.AudioService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 音频表 服务实现类
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Service
public class AudioServiceImpl extends ServiceImpl<AudioDao, Audio> implements AudioService {

}
