package com.heweiming.project.ai.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.heweiming.project.ai.bean.Page;
import com.heweiming.project.ai.mapper.base.BaseMapper;
import com.heweiming.project.ai.service.base.BaseService;

public class BaseServiceImpl<R, E, M extends BaseMapper<R, E>> implements BaseService<R, E> {

    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    @Autowired
    protected M mapper;

    @Override
    public long countByExample(E example) {
        if (logger.isDebugEnabled()) {
            logger.debug("countByExample(E) - start"); //$NON-NLS-1$
        }
        long returnlong = mapper.countByExample(example);
        if (logger.isDebugEnabled()) {
            logger.debug("countByExample(E) - end"); //$NON-NLS-1$
        }
        return returnlong;
    }

    @Override
    public int deleteByExample(E example) {
        if (logger.isDebugEnabled()) {
            logger.debug("deleteByExample(E) - start"); //$NON-NLS-1$
        }

        int returnint = mapper.deleteByExample(example);
        if (logger.isDebugEnabled()) {
            logger.debug("deleteByExample(E) - end"); //$NON-NLS-1$
        }
        return returnint;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(R record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(R record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<R> selectByExample(E example) {
        return mapper.selectByExample(example);
    }

    @Override
    public R selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(R record, E example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(R record, E example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(R record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(R record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public Page<R> selectByExampleToPage(E example, RowBounds rowBounds) {
        Page<R> page = new Page<>();
        page.setData(mapper.selectByExampleWithRowbounds(example, rowBounds));
        page.setTotal(mapper.countByExample(example));
        return page;
    }

}
