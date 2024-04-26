package thymproject.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thymproject.project.entity.FeedBack;

public interface FeedBackRepository extends JpaRepository<FeedBack,Integer> {
}
