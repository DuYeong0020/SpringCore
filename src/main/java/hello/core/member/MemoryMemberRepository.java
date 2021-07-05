package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }
    // ConcurrentHashMap 동시성 이슈때문에 쓴다. 보통
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
