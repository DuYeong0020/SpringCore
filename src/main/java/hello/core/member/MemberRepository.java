package hello.core.member;

// 인터페이스랑 구현체랑 같은 페키지에 두는것은 별로
public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
