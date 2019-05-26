package application;

import domain.Frame;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingServiceTest {

    private BowlingService bowlingService;

    @Before
    public void setUp() {
        bowlingService = new BowlingService();
    }

    @Test
    public void caculateTotalScore_shouldReturnEmptyFrames_whenTheGameHasNoFrames(){
        List<Frame> frames = new ArrayList<>();

        List<Frame> actual = bowlingService.caculateTotalScore(frames);

        assertEquals(actual.size(), 0);
    }
}