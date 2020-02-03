package com.atguigu.gmall.user.service.impl;



import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.mapper.UserMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserMemberReceiveAddressMapper userMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
//        List<UmsMember> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMemberId(String umsMemberId) {

        UmsMemberReceiveAddress receiveAddress = new UmsMemberReceiveAddress();
        receiveAddress.setMember_id(umsMemberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userMemberReceiveAddressMapper.select(receiveAddress);

        return umsMemberReceiveAddresses;
    }


}
