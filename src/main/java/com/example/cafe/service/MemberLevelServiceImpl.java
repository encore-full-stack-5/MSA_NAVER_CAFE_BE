package com.example.cafe.service;

import com.example.cafe.global.domain.entity.Cafe;
import com.example.cafe.global.domain.entity.MemberLevel;
import com.example.cafe.global.domain.repository.MemberLevelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberLevelServiceImpl implements MemberLevelService {
    private final MemberLevelRepository memberLevelRepository;
    @Transactional
    @Override
    public void createDefaultMemberLevel(Cafe cafe) {
        List<MemberLevel> defaultMemberLevel = new ArrayList<>();

        String[] levelNames = {"새싹멤버", "일반멤버", "성실멤버", "열심멤버", "우수멤버", "감사멤버"};
        String[] levelDescriptions = {
                "가입 후 막 활동을 시작하는 멤버",
                "카페 일반 멤버",
                "카페활동을 성실히 하는 멤버",
                "카페 열심 멤버",
                "카페 우수 멤버",
                "최고 고마운 VIP 멤버"
        };

        for (int i = 0; i < levelNames.length; i++) {
            MemberLevel memberLevel = new MemberLevel();
            memberLevel.setPriority(i + 1);
            memberLevel.setName(levelNames[i]);
            memberLevel.setDescription(levelDescriptions[i]);
            memberLevel.setCafe(cafe);
            defaultMemberLevel.add(memberLevel);
        }
        memberLevelRepository.saveAll(defaultMemberLevel);
    }
}
