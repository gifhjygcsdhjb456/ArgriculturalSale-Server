package com.qst.crop.service.impl;

import com.qst.crop.dao.DiscussDao;
import com.qst.crop.entity.Discuss;
import com.qst.crop.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DiscussServiceImpl implements DiscussService {
    @Autowired(required=false)
    private DiscussDao discussDao;

    @Override
    public void add(Discuss discuss) {
        discussDao.insertSelective(discuss);
    }

    @Override
    public List<Discuss> selectByKnowledgeId(Integer knowledgeId) {
        List<Discuss> Discuss = discussDao.selectByKnowledgeId(knowledgeId);
        return Discuss;
    }

}
